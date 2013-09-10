package net.sas.model.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private static DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static DateFormat customSdf;
	
	public static String dateToString(Date dateToConvert){
		return sdf.format(dateToConvert);
	}
	
	public static Date stringToDate(String stringToConvert) throws ParseException{
		return sdf.parse(stringToConvert);
	}
	
	public static String dateToString(Date dateToConvert, String format){
		customSdf = new SimpleDateFormat(format);
		return customSdf.format(dateToConvert);
	}
	
	public static Date stringToDate(String stringToConvert, String format) throws ParseException{
		customSdf = new SimpleDateFormat(format);
		return customSdf.parse(stringToConvert);
	}
}
