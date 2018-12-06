package it.ilucas.utils;

import java.util.Collection;

public class Utils {
	public static boolean isFilled(Object value) {
		return (value != null);
	}
	
	public static boolean isFilled(String value) {
		return (value != null && !"".equals(value.trim()));
	}
	
	public static final boolean isFilled(Collection<?> value) {
		return (value != null && value.size() > 0 );
	}
	
	public static final boolean isFilled(Object[] value) {
		return (value != null && !(value.length < 1) );
	}

}
