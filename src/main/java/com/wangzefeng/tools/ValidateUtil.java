package com.wangzefeng.tools;



import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {

	public static final String dateFormat = "yyyy-MM-dd";
	public static final String sdateFormat = "yy-MM-dd";

	public static final String mDateFormat = "yyyy-MM-dd kk:mm:ss";
	public static final String mDateFormat2 = "yyyy-MM-dd";
	public static final String mDateFormat3 = "yyyy年MM月dd日";
	public static final String mDateTimeFormat1 = "yyyy年MM月dd日 HH时mm分";
	public static final String mDateTimeFormat2 = "yyyy/MM/dd HH:mm:ss";
	public static final String mDateTimeFormat3 = "yyyy-MM-dd HH:mm:ss";


	public static Date formartDate(String str,int dateformat){
		if (StrKit.isBlank(str))
			return null;
		Date date = null;
		SimpleDateFormat sdf = null;
		if(dateformat==1){
			sdf = new SimpleDateFormat(mDateTimeFormat1);
		}else if(dateformat==2){
			sdf = new SimpleDateFormat(mDateTimeFormat2);
		}else{
			sdf = new SimpleDateFormat(mDateTimeFormat3);
		}
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

//	public static Date formartDate3(String str){
//		if (StrKit.isBlank(str))
//			return null;
//		Date date = null;
//		SimpleDateFormat sdf = null;
//		sdf = new SimpleDateFormat(mDateTimeFormat3);
//		try {
//			date = sdf.parse(str);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return date;
//	}

	/**
	 * 验证字符串是否为空或为""
	 * 
	 * @param content
	 * @return
	 */
	public static boolean validateString(String content) {
		if (content != null && !"".equals(content.trim()) && !"null".equals(content)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 验证字符串数组是否为空或为""
	 * 不等于空返回true  等于空返回false
	 * @param content
	 * @return
	 */
	public static boolean validateStringAttr(String[] content) {
		 if(content==null || content.length==0){
		 	return false;
		 }else{
		 	for(String one:content){
		 		if(validateString(one)){
		 			return true;
				}
		 	}
		 	return false;
		 }
	}

	/**
	 * 验证字符串数组是否为空或为""
	 * 不等于空返回true  等于空返回false
	 * @param content
	 * @return
	 */
	public static String generatorSqlIn(String[] content) {
		StringBuffer sb = new StringBuffer();
		 for(String one:content){
		 	if(validateString(one)){
		 		if(sb.length()>0){
		 			sb.append(",").append("'"+one+"'");
				}else{
					sb.append("'"+one+"'");
				}
			}
		 }
		 return "("+sb.toString()+")";
	}

	public static boolean isEmpty(String str) {
		return (str == null || "".equals(str.trim()));
	}

	public static boolean isIntgt0(Integer i) {
		if (i != null && i.intValue() > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 不是-1
	 * 
	 * @param content
	 * @return
	 */
	public static boolean nnOneString(String content) {
		if (content == null || "".equals(content.trim())) {
			return false;
		} else if ("-1".equals(content.trim())) {
			return false;
		}
		return true;
	}

	/**
	 * @param str
	 */
	public static boolean isNumber(String str) {
		return isNumber(str, Integer.MAX_VALUE);
	}

	/**
	 * @param str
	 * @param length
	 */
	public static boolean isNumber(String str, int length) {
		if (str == null || "".equals(str.trim())) {
			return false;
		} else {
			return Pattern.matches("\\d{1," + length + "}", str);
		}
	}

	/**
	 * @param str
	 * @param arry
	 */
	public static boolean contains(String str, String[] arry) {
		if (str != null) {
			for (String string : arry) {
				if (str.equals(string)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @param str
	 */
	public static Date formartDate(String str) {
		if (str == null)
			return null;
		Date date = null;
		SimpleDateFormat sdf = null;
		if (str.length() <= 8) {
			sdf = new SimpleDateFormat(sdateFormat);
		} else {
			sdf = new SimpleDateFormat(dateFormat);
		}
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// e.printStackTrace();
		}
		return date;
	}

	public static String formartDate2String(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(mDateFormat);
		return date == null ? "" : sdf.format(date);
	}

	public static String formartDate2String2(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(mDateFormat2);
		return date == null ? "" : sdf.format(date);
	}

	public static String formartDate2String3(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(mDateFormat3);
		return date == null ? "" : sdf.format(date);
	}

	/**
	 * 验证两字符是否匹配（内容是否相同）
	 * 
	 * @param content
	 *            原字符串
	 * @param matchStr
	 *            要匹配的字符串
	 * @return
	 */
	public static boolean matchString(String content, String matchStr) {
		if (content == null || "".equals(content.trim())) {
			return false;
		} else if (matchStr.equals(content)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 验证两字符是否匹配（内容是否相同）
	 * 
	 * @param content
	 *            原字符串
	 * @param matchStr
	 *            要匹配的字符串
	 * @return
	 */
	public static boolean imatchString(String content, String matchStr) {
		if (content == null || "".equals(content.trim())) {
			return false;
		} else if (matchStr.equalsIgnoreCase(content)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validateReg(String regEx, String str) {
		Pattern p = Pattern.compile(regEx);
		return p.matcher(str).matches();
	}

	public static String getRegStr(String regEx, String str) {
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		while (m.find()) {
			return m.group();
		}
		return null;
	}

	/**
	 * 验证字符串是否为日期格式 可通过的格式：yyyy-MM-dd or yyyy.MM.dd or yyyy/MM/dd
	 * 
	 * @param str
	 * @return
	 */
	public static boolean validateDate(String str) {
		String reg = "^\\d{2,4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	/**
	 * 验证时间格式是不是 yyyy-MM yyyy.MM yyyy/MM
	 * @author chenjie@hzunitech.com
	 * @date 2016年1月26日
	 * @return
	 */
	public static boolean validateYYYYMMDate(String str){
		str = str.replaceAll("\\.", "-").replaceAll("/", "-");
		if(str.length()>7){
			return false;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		try {
			Date d = sdf.parse(str);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
	/**
	 * 验证字符串是否为日期格式 可通过的格式：MM/dd/yyyy hh24:mm:ss
	 * 
	 * @param str
	 * @return
	 */
	public static boolean valiDate(String str) {
		SimpleDateFormat re =new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		try {
			Date da=re.parse(str);
			if(da!=null)return true;
		} catch (ParseException e) {
			return false;
		}
		return false;
	}
	
	public static boolean valiDateTime(String str) {
		SimpleDateFormat re =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			Date da=re.parse(str);
			if(da!=null)return true;
		} catch (ParseException e) {
			return false;
		}
		return false;
	}
	
	public static boolean valiDateTimeYear(String str) {
		SimpleDateFormat re =new SimpleDateFormat("yyyy");
		try {
			Date da=re.parse(str);
			if(da!=null)return true;
		} catch (ParseException e) {
			return false;
		}
		return false;
	}
	
	public static boolean valiDateSpecial(String str) {
		str = str.replaceAll("\\.", "-").replaceAll("/", "-");
		SimpleDateFormat re =new SimpleDateFormat("MM-dd");
		try {
			Date da=re.parse(str);
			if(da!=null)return true;
		} catch (ParseException e) {
			return false;
		}
		return false;
	}
	/**
	 * 
	 * @param gps
	 * @return
	 */
	public static boolean validateGps(String gps) {
		if (gps == null || "".equals(gps.trim())) {
			return false;
		}
		String reg = "^\\d*(\\.)?\\d+\\,\\d*(\\.)?\\d+$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(gps);
		return m.matches();
	}

	public static boolean isDecimal(String targetStr) {
		// 表达式的功能：验证必须为数字（整数或小数）
		String pattern = "(\\-)?[0-9]+(.[0-9]+)?";
		// 对()的用法总结：将()中的表达式作为一个整体进行处理，必须满足他的整体结构才可以。
		// (.[0-9]+)? ：表示()中的整体出现一次或一次也不出现
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(targetStr);
		boolean b = m.matches();
		return b;
	}

	public static boolean isJustNumber(String targetStr) {
		if (validateString(targetStr)) {
			return targetStr.matches("[0-9]+");
		} else {
			return false;
		}
	}

	public static String getUUid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static String getString(String str) {
		if (str == null || "".equals(str)) {
			return "";
		} else {
			return str;
		}
	}

	/**
	 * 删除制表符、换行符
	 * 
	 * @param content
	 * @return
	 */
	public static String replaceRowChar(String content) {
		if (isEmpty(content)) {
			return content;
		}
		return content.replaceAll("\n", "").replace("\t", "");
	}

	public static boolean isIDNO(String idNo) {
		if (isEmpty(idNo))
			return false;
		String regs="^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";
		String reg="^(\\d{6})(\\d{2})([0-1][0-9])(\\d{2})(\\d{3})$";
		Pattern p = Pattern.compile(reg);
		Pattern ps = Pattern.compile(regs);
		Matcher m = p.matcher(idNo);
		Matcher ms = ps.matcher(idNo);
		return m.matches() || ms.matches();
	}
	/**
	 * 字符转码防止xxs  html
	 */

	public static Object copys(Object object) throws Exception {
		Class<?> classType = object.getClass();
		Object objectCopy = classType.getConstructor(new Class[] {})
				.newInstance(new Object[] {});
		Field fields[] = classType.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String fieldName = field.getName();
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getMethodName = "get" + firstLetter + fieldName.substring(1);
			String setMethodName = "set" + firstLetter + fieldName.substring(1);
			Method getMethod = classType.getMethod(getMethodName,
					new Class[] {});
			Method setMethod = classType.getMethod(setMethodName,
					new Class[] { field.getType() });
			Object value = getMethod.invoke(object, new Object[] {});
			setMethod.invoke(objectCopy, new Object[] { value });
		}
		return objectCopy;
	}

	
	/**
	 * 根据字符串获取集合
	 * @param data
	 * @author shixin
	 */
	public static List<String> frmArray(String data){
		if(data==null||"".equals(data)){
			return null;
		}
		String[] data_array = data.split("\\,");
		return  new ArrayList<String>(Arrays.asList(data_array));
	}
	
	/**
	 * 根据字符串获取集合
	 */
	public static String arraytoString(List<String> list){
		StringBuffer s=new StringBuffer();
		for(String st:list){
			if(ValidateUtil.validateString(st)){
				s.append(st+",");
			}
		}
		if(ValidateUtil.validateString(s.toString()) && s.toString().endsWith(",")){
			s=new StringBuffer(s.substring(0,s.length()-1));
		}
		return  s.toString();
	}

	public static LinkedHashMap<String, String> toMapKeyToValue(String data) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		if(validateString(data)){
			for(String s:data.split(",")){
				map.put(s.split(":")[0],s.split(":")[1]);
			}
		}
		return map;
	}
	public static LinkedHashMap<String, String> toMapKeyToKey(String data) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		if(validateString(data)){
			for(String s:data.split(",")){
				map.put(s.split(":")[0],s.split(":")[0]);
			}
		}
		return map;
	}
	public static <T> String validateFiledIsNull(Map<String,String> fileds, T obj) throws Exception {
		String ret ="";
		for(String key:fileds.keySet()){
			String getMethodStr = "get" + key.substring(0,1).toUpperCase()+key.substring(1);
			Method m = obj.getClass().getMethod(getMethodStr);
			Object value =  m.invoke(obj);
			if(value==null || value.toString().trim().equals("")){
				if(!validateString(ret)){
					ret=fileds.get(key);
				}else{
					ret+=","+fileds.get(key);
				}
			}
		}
		return ret;
	}

	/**
	 * 判断一个集合中是否包含某个正则的字符
	 * @author chenjie@hzunitech.com
	 * @date 2015年8月26日
	 * @param values
	 * @param
	 * @return
	 */
	public static boolean likes(Collection<? extends Object> values, String reg) {
		if(values==null) {
			return false;
		}
		for(Object s:values){
			if (s instanceof String && s!=null && ((String)s).matches(reg)) return true;
		}
		return false;
	}

	
	/**
	 * 比较 字符串前后是否有改变
	 * @param first
	 * @param last
	 * @return
	 */
	public static boolean compare(String first, String last){
		if(!ValidateUtil.validateString(first)){
			first = "";
		}
		if(!ValidateUtil.validateString(last)){
			last = "";
		}
		boolean hasChange = false;
		if(!first.equals(last)){
			hasChange = true;
		}
		return hasChange;
	}
	
	public static boolean isTel(String targetStr) {
		// 表达式的功能：验证必须为数字（整数或小数）
		String pattern = "(\\-)?[0-9]+(.[0-9]+)?";
		// 对()的用法总结：将()中的表达式作为一个整体进行处理，必须满足他的整体结构才可以。
		// (.[0-9]+)? ：表示()中的整体出现一次或一次也不出现
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(targetStr);
		boolean b = m.matches();
		return b;
	}
	
	/**
	 * 0:"密码为空"
	   1:"弱"
	   2:"一般"
	   3:"好"
	   4:"强"
	   5:"很强"
	 * param  password
	 *  
	 */
	public static int isWeakPasswords(String password) {
	    	 int score   = 0;
	    	 if(!validateString(password)){
	    	     return 0;
	    	 }
	    	 if("zpepc001".equals(password)){
	    	     return 3;
	    	 }
		 if (password.length() > 6)score++;
		 if (password.matches("^.*?[^a-zA-Z$]+.*?$"))score++;
		 if (password.matches("^.*?[\\d]+.*?$"))score++;
		 if (password.matches("^.*?[!,@,#,$,%,^,&,*,?,_,~,-,(,)]+.*?$"))score++;
		 if (password.length()> 12) score++;
		 return score;
	}

	public static String formartDate2FullString2(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(mDateTimeFormat2);
		return date == null ? "" : sdf.format(date);
	}

	public static void main(String[] args) {
	    System.out.println(isWeakPasswords("1a,123456"));
	}
}
