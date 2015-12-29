/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package com.kongwu.insweb.utils;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example demonstrates opening a workbook, modifying it and writing the
 * results back out.
 *
 * @author Glen Stampoultzis (glens at apache.org)
 */

public class ReadExcel {
	private static Logger logger = Logger.getLogger("ReadExcel.class");

	/**
	 * @param filepath 输入excel路径
	 *        ：测试
	 *        ：标注
	 *        ：导入
	 * @return 解析出的测试集信息,导入:list<usrid,query,biz,semantic>
	 * 							  测试:
	 *                           标注:
	 * @throws IOException
	 */
	public static  List<List<String>> readTestset(String filepath)
			throws IOException {
		FileInputStream fileIn = null;
		List<List<String>> testsetList = new ArrayList<List<String>>();
		/**读取excel**/
		try {
			fileIn = new FileInputStream(filepath);
			/**excel 2007**/
			if (filepath.endsWith(".xlsx")) {
				Workbook wb = new XSSFWorkbook(fileIn);
				Sheet sheet = wb.getSheetAt(0);
				Row row = null;
				Cell cell = null;
				int rowSize = sheet.getLastRowNum() + 1;// getLastRowNum()比实际行数少1
				logger.info("获取行数"+rowSize);
				if (rowSize < 2)
					return null;
				// 循环读取所有列表,从第二行开始
				for (int i = 1; i < rowSize; i++) {
					row = sheet.getRow(i);
					if (row == null)
						continue;		
					int cellSize = row.getLastCellNum();
					logger.info("获取列数"+cellSize);
					/**
					 * 循环读取cell
					 */
					List<String> list = new ArrayList<String>();
					for(int j=0;j<cellSize;j++){
						cell = row.getCell(i);
						if(cell!=null){
							list.add(cell.toString());
						}
					}
					
					testsetList.add(list);
				}
			} else {
				POIFSFileSystem fs = new POIFSFileSystem(fileIn);
				HSSFWorkbook wb = new HSSFWorkbook(fs);
				HSSFSheet sheet = wb.getSheetAt(0);
				HSSFRow row = null;
				HSSFCell cell = null;
				int rowSize = sheet.getLastRowNum() + 1;// getLastRowNum()比实际行数少1
				logger.info("获取行数"+rowSize);
				if (rowSize < 2)// 长度不符合要求
					return null;
				// 循环读取所有列表,从第二行开始
				for (int i = 1; i < rowSize; i++) {
					row = sheet.getRow(i);
					if (row == null)
						continue;
					int cellSize = row.getLastCellNum();
					logger.info("获取列数"+cellSize);
					List<String> list = new ArrayList<String>();
					for(int j=0;j<cellSize;j++){
						cell = row.getCell(j);
						if(cell!=null){
							list.add(cell.toString());
						}
					}
					testsetList.add(list);
				}
			}
		} finally {
			if (fileIn != null)
				fileIn.close();
		}
		return testsetList;
	}
}
