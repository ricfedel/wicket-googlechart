package it.ricfed.wicket.googlecharts.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ClassHelper {

	public static Type findGenericClass(Class<?> clz) {
		return findGenericClass(clz, 0);
	}

	public static Type findGenericClass(Class<?> clz, int index) {
		if (clz == null)
			return null;
		try {
			Type gs = clz.getGenericSuperclass();
			while (gs != null && !(gs instanceof ParameterizedType)
					&& gs instanceof Class) {
				Type type = ((Class<?>) gs).getGenericSuperclass();
				if (type == null || gs.getClass() == type.getClass()) {
					gs = null;
				} else {
					gs = type;
				}
			}
			ParameterizedType pt = null;
			if (gs != null && gs instanceof ParameterizedType) {
				pt = (ParameterizedType) gs;
				Type[] ata = pt.getActualTypeArguments();
				if (ata != null && ata.length > 0) {
					return ata[index];
				}
			}
		} catch (Throwable t) {
			System.err.println(t.getMessage());
		}
		return null;
	}
}
