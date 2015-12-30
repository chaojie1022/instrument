package insweb.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlRegUtils { 
private final static String regxpForHtml = "<([^>]*)>"; // ����������<��ͷ��>��β�ı�ǩ

private final static String regxpForImgTag = "<\\s*img\\s+([^>]*)\\s*>"; // �ҳ�IMG��ǩ

private final static String regxpForImaTagSrcAttrib = "src=\"([^\"]+)\""; // �ҳ�IMG��ǩ��SRC����

/** 
  * 
  */ 
public HtmlRegUtils() { 
  // TODO Auto-generated constructor stub 
}

/** 
  * 
  * �������ܣ��滻�����������ʾ 
  * <p> 
  * 
  * @param input 
  * @return String 
  */ 
public String replaceTag(String input) { 
  if (!hasSpecialChars(input)) { 
   return input; 
  } 
  StringBuffer filtered = new StringBuffer(input.length()); 
  char c; 
  for (int i = 0; i <= input.length() - 1; i++) { 
   c = input.charAt(i); 
   switch (c) { 
   case '<': 
    filtered.append("&lt;"); 
    break; 
   case '>': 
    filtered.append("&gt;"); 
    break; 
   case '"': 
    filtered.append("&quot;"); 
    break; 
   case '&': 
    filtered.append("&amp;"); 
    break; 
   default: 
    filtered.append(c); 
   }

  } 
  return (filtered.toString()); 
}

/** 
  * 
  * �������ܣ��жϱ���Ƿ���� 
  * <p> 
  * 
  * @param input 
  * @return boolean 
  */ 
public boolean hasSpecialChars(String input) { 
  boolean flag = false; 
  if ((input != null) && (input.length() > 0)) { 
   char c; 
   for (int i = 0; i <= input.length() - 1; i++) { 
    c = input.charAt(i); 
    switch (c) { 
    case '>': 
     flag = true; 
     break; 
    case '<': 
     flag = true; 
     break; 
    case '"': 
     flag = true; 
     break; 
    case '&': 
     flag = true; 
     break; 
    } 
   } 
  } 
  return flag; 
}

/** 
  * 
  * �������ܣ�����������"<"��ͷ��">"��β�ı�ǩ 
  * <p> 
  * 
  * @param str 
  * @return String 
  */ 
public static String filterHtml(String str) { 
  Pattern pattern = Pattern.compile(regxpForHtml); 
  Matcher matcher = pattern.matcher(str); 
  StringBuffer sb = new StringBuffer(); 
  boolean result = matcher.find(); 
  while (result) { 
   matcher.appendReplacement(sb, ""); 
   result = matcher.find(); 
  } 
  matcher.appendTail(sb); 
  return sb.toString(); 
}

/** 
  * 
  * �������ܣ�����ָ����ǩ 
  * <p> 
  * 
  * @param str 
  * @param tag 
  *            ָ����ǩ 
  * @return String 
  */ 
public static String fiterHtmlTag(String str, String tag) { 
  String regxp = "<\\s*" + tag + "\\s+([^>]*)\\s*>"; 
  Pattern pattern = Pattern.compile(regxp); 
  Matcher matcher = pattern.matcher(str); 
  StringBuffer sb = new StringBuffer(); 
  boolean result1 = matcher.find(); 
  while (result1) { 
   matcher.appendReplacement(sb, ""); 
   result1 = matcher.find(); 
  } 
  matcher.appendTail(sb); 
  return sb.toString(); 
}

/** 
  * 
  * �������ܣ��滻ָ���ı�ǩ 
  * <p> 
  * 
  * @param str 
  * @param beforeTag 
  *            Ҫ�滻�ı�ǩ 
  * @param tagAttrib 
  *            Ҫ�滻�ı�ǩ����ֵ 
  * @param startTag 
  *            �±�ǩ��ʼ��� 
  * @param endTag 
  *            �±�ǩ������� 
  * @return String 
  * @�磺�滻img��ǩ��src����ֵΪ[img]����ֵ[/img] 
  */ 
public static String replaceHtmlTag(String str, String beforeTag, 
   String tagAttrib, String startTag, String endTag) { 
  String regxpForTag = "<\\s*" + beforeTag + "\\s+([^>]*)\\s*>"; 
  String regxpForTagAttrib = tagAttrib + "=\"([^\"]+)\""; 
  Pattern patternForTag = Pattern.compile(regxpForTag); 
  Pattern patternForAttrib = Pattern.compile(regxpForTagAttrib); 
  Matcher matcherForTag = patternForTag.matcher(str); 
  StringBuffer sb = new StringBuffer(); 
  boolean result = matcherForTag.find(); 
  while (result) { 
   StringBuffer sbreplace = new StringBuffer(); 
   Matcher matcherForAttrib = patternForAttrib.matcher(matcherForTag 
     .group(1)); 
   if (matcherForAttrib.find()) { 
    matcherForAttrib.appendReplacement(sbreplace, startTag 
      + matcherForAttrib.group(1) + endTag); 
   } 
   matcherForTag.appendReplacement(sb, sbreplace.toString()); 
   result = matcherForTag.find(); 
  } 
  matcherForTag.appendTail(sb); 
  return sb.toString(); 
} 
}