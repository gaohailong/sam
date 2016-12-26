package com.sam.util;

import java.util.Random;

public class CreateRandom {

	public Integer createRandom(){
		Random random = new Random();
		int ooid = random.nextInt(899999)+100000;		
		return ooid;
	}
}
