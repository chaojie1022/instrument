package insweb.controller;

import com.alibaba.fastjson.JSON;
import com.kongwu.insweb.utils.ImgUtils;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController{


    @RequestMapping("/ue")
    public void ue(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        CommonsMultipartFile upfile = (CommonsMultipartFile) multipartRequest
                .getFile("upfile");
        Map<String,Object> resultMap = new HashMap<String,Object>();
        DiskFileItem fi = (DiskFileItem)upfile.getFileItem();
        File file = fi.getStoreLocation();
        if(upfile!=null){
            List<String> fileNames = ImgUtils.uploadImages(file,"2");
            resultMap.put("url", fileNames.get(0));
            resultMap.put("state", "SUCCESS");
        }else{
            resultMap.put("result", "FAIL");
        }
        //此处springmvc配置自定义输出方式失败，暂且使用response输出保证功能正常
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Writer out = response.getWriter();
        out.write(JSON.toJSONString(resultMap));
        out.close();
    }

    @RequestMapping("/index")
    @ResponseBody
    public Object index(HttpServletRequest request) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        CommonsMultipartFile upfile = (CommonsMultipartFile) multipartRequest
                .getFile("file");
        Map<String,Object> resultMap = new HashMap<String,Object>();
        DiskFileItem fi = (DiskFileItem)upfile.getFileItem();
        File file = fi.getStoreLocation();
        if(upfile!=null){
            List<String> fileNames = ImgUtils.uploadImages(file,"2");
            resultMap.put("url", fileNames.get(0));
            resultMap.put("state", "SUCCESS");
        }else{
            resultMap.put("result", "FAIL");
        }


        return resultMap;
    }
}
