package it.ricfed.wicket.googlecharts.utils;

import java.util.Calendar;
import java.util.Date;

public class ScriptHelper {
	public static final String FUNCTION_BEGIN = "@#@|";
	public static final String FUNCTION_END = "|@#@";

	public static String functionDate(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return FUNCTION_BEGIN + "new Date(" + c.get(Calendar.YEAR) + ","
				+ c.get(Calendar.MONTH) + "," + c.get(Calendar.DAY_OF_MONTH)
				+ ")" + FUNCTION_END;
	}

	public static String functionDateTime(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return FUNCTION_BEGIN + "new Date(" + c.get(Calendar.YEAR) + ","
				+ c.get(Calendar.MONTH) + "," + c.get(Calendar.DAY_OF_MONTH)
				+ "," + c.get(Calendar.HOUR_OF_DAY) + ","
				+ c.get(Calendar.MINUTE) + "," + c.get(Calendar.SECOND) + ")"
				+ FUNCTION_END;
	}

	public static String functionTimeOfDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return FUNCTION_BEGIN + "[" + c.get(Calendar.HOUR_OF_DAY) + ","
				+ c.get(Calendar.MINUTE) + "," + c.get(Calendar.SECOND) + ","
				+ c.get(Calendar.MILLISECOND) + "]" + FUNCTION_END;
	}

	public static Object functionOf(String f) {
		if (f.trim().endsWith(")"))
			return FUNCTION_BEGIN + "new " + f + FUNCTION_END;
		return FUNCTION_BEGIN + "new " + f + ")" + FUNCTION_END;
	}

	public static String toFunctions(String testo) {
		if (testo == null)
			return null;
		String out = testo.replace("\"+FUNCTION_BEGIN+", " ");
		out = out.replace(FUNCTION_END + "\"", " ");
		return out;
	}
}
