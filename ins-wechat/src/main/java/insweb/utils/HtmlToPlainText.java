package insweb.utils;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * 遍历DOM树，生成规范的格式化的文本文档
 * Create Author : liqiang
 * Create Date : 2015年4月9日
 * File Name : HtmlToPlainText.java
 */
public class HtmlToPlainText {
    private static String[] blockElementTagName = new String[]{"p","div","li","h1","h2","h3","h4","h5","h6","dl","hr","form"};
    public static List parse(String input) {
        String br = "###br###";
        if(StringUtils.isEmpty(input))
            return new ArrayList();
        List<String> list = new ArrayList<String>();

        Document doc = Jsoup.parse(input);
        //将所有的块元素标签增加换行符
        for(String tagName : blockElementTagName){
            Elements tagEles = doc.select(tagName);
            for(Element e : tagEles){
                String text = e.html();
                String temp = e.outerHtml();
                List<Element> childElements = e.children();
                if(CollectionUtils.isNotEmpty(childElements)){
                    if(childElements.get(0).tagName().equals("img")||childElements.get(0).tagName().equals("IMG")){
                        input = input.replace(temp,text);
                       continue;
                    }else{
                        Element next = e.nextElementSibling();
                        if(next!=null&&(next.tagName().equals("img")||next.tagName().equals("IMG"))){
                            input = input.replace(temp,text);
                        }else{
                            text = e.text();
                            input = input.replace(temp,text+"\n");
                        }
                    }
                }else{
                    text = e.text();
                    if(StringUtils.isNotEmpty(text)){
                        input = input.replace(temp,text+"\n");
                    }
                }
            }
        }
        input = input.replaceAll("\r\n",br).replaceAll("\r",br).replaceAll("\n",br).replaceAll("<br />",br);

        doc = Jsoup.parse(input);
        Elements eles = doc.select("img");
        if (eles.size() == 0) {
            list.add("text|" + doc.text().replaceAll(br,"\n"));
            return list;
        }
        for (Element ele : eles) {
            String src = ele.attr("src");
            String tempHtml = ele.outerHtml();
            input = input.replace(tempHtml, "#$@img|" + src + "#$@");
            tempHtml = tempHtml.replace(" />","/>");
            input = input.replace(tempHtml, "#$@img|" + src + "#$@");
            tempHtml = tempHtml.replace("/>",">");
            input = input.replace(tempHtml, "#$@img|" + src + "#$@");
        }
        String[] array = Jsoup.parse(input).text().split("#\\$@");
            for (String str : array) {
                if (StringUtil.isBlank(str)) continue;
                if (str.startsWith("img|")) {
                    list.add(str);
                } else {
                    list.add("text|" + str.replace(br,"\n"));
                }
            }

        return list;
    }
}
