package org.pineapple.utility;

import java.util.Random;

public class RandomData {
	public static Integer randomNo()
	{
		Random r = new Random();
		return r.nextInt();
	}

}
