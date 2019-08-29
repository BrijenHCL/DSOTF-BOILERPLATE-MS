/*
 * Copyright (C) 2019 ULTA
 * http://www.ulta.com
 * 9008570@ulta.com
 * All rights reserved
 */
package com.ulta.boilerplate.transformation;

import java.util.Calendar;

import com.ulta.boilerplate.response.HelloResponse;

public class HelloResponseTranformation {
	
	public HelloResponse helloResponseTransalation(HelloResponse helloResponse){
		helloResponse.setDate(Calendar.getInstance().getTime());
		return helloResponse;
		
	}

}
