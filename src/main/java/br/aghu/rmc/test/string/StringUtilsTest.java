package br.aghu.rmc.test.string;

import org.apache.commons.lang.StringUtils;

public class StringUtilsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object[] objs = {null, null};
		String str = StringUtils.join(objs);

		System.out.println(str);
		
		//############################
		
		String precisionMask = "#0";
		String scaleMask = "";
		String newMask = "#0";
		
		int precision = 14;
		int scale = 4;
		
		
		
		if (precision > 2) {
			precisionMask = StringUtils.leftPad(precisionMask, precision, "#");
			
			newMask = leftNumberMask(newMask, precision, '#');
		}
		if (scale > 0) {
			scaleMask = StringUtils.rightPad(scaleMask, scale, "#");
		}
		
		System.out.println("precisionMask: " + precisionMask);
		System.out.println("scaleMask    : " + scaleMask);
		System.out.println("newMask      : " + newMask);
	}
	
	public static String leftNumberMask(final String str, int precision, char padChar) {
		String strReturned = "";
		if (str != null) {
			strReturned = str;
		}
		
		for (int i=strReturned.length()+1; i<=precision; i++) {
			strReturned = padChar + strReturned;
			if ((i % 3) == 0) {
				strReturned = ',' + strReturned;
			}
		}
		
		return strReturned;
	}

}
