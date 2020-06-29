package utils;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaUtils {
	
	public static String randomNumber() {
		
		Random random= new Random();
		int randomnumber1=random.nextInt(1000);
		String randomnumber=Integer.toString(randomnumber1);
		return randomnumber;
		
		
	}

	
	public static String randomString() {
		
		
		String randomstring=RandomStringUtils.randomAlphabetic(8);
		return randomstring;
		
	}
}
