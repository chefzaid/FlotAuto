package net.sas.util;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("rawtypes")
public class DateConverter extends StrutsTypeConverter {
	
	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		Date returnObject = null;
		String value = values[0];
		if (value != null && !value.trim().equals("")) {
			try {
				returnObject = DateUtil.stringToDate(value, getDatePattern());
			} catch (ParseException e) {
				// ignore the parse exception
			}
		}
		return returnObject;
	}

	@Override
	public String convertToString(Map context, Object o) {
		Date date = (Date) o;
		String formatedDate = DateUtil.dateToString(date, getDatePattern());
		return formatedDate;
	}

	private String getDatePattern() {
		ResourceBundle bundle = ResourceBundle.getBundle("application",
				ActionContext.getContext().getLocale());
		String pattern = bundle.getString("text.date.format");
		return pattern;
	}
}