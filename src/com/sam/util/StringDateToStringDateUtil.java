package com.sam.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 实体类中的日期为String.
 * 将String 的日期转换格式为String类型
 * @author zhw
 *
 */
public class StringDateToStringDateUtil {

	private static String dateFormat = "yyyy-MM-dd";
	
	public static String StringDateToStringDate(String dateStr) {
		SimpleDateFormat formatter;   
	    formatter = new SimpleDateFormat (dateFormat);
	    String resultDateStr;
		try {
			resultDateStr = formatter.format(formatter.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
			return dateStr;
		}
		return resultDateStr;
	}

}
