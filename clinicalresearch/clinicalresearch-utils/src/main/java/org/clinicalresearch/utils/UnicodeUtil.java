package org.clinicalresearch.utils;


public class UnicodeUtil {
	
	public static Character fromUnicodeToChar(String unicode) {
		Character character = null;
		if (unicode != null && !unicode.isEmpty()) {
			String replace = unicode;
			if (unicode.contains("\\u")) {
				replace = unicode.replace("\\u", "");
			}
			int unicodeInt = Integer.parseInt(replace, 16);
			character = (char)unicodeInt;
			return character;
		} else {
			return character;
		}
	}
}
