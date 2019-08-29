/*
 * Copyright (C) 2019 ULTA
 * http://www.ulta.com
 * 9008570@ulta.com
 * All rights reserved
 */
package com.ulta.boilerplate.serviceImpl;

import org.springframework.stereotype.Service;

import com.ulta.boilerplate.exception.HelloException;
import com.ulta.boilerplate.response.HelloResponse;
import com.ulta.boilerplate.service.HelloService;
import com.ulta.boilerplate.transformation.HelloResponseTranformation;

@Service
public class HelloServiceImpl implements HelloService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ulta.boilerplate.service.HelloService#getHelloWord()
	 */
	@Override
	public HelloResponse getHelloWord() throws HelloException {

		HelloResponse helloResponse = new HelloResponse();
		HelloResponseTranformation hrTranformation = new HelloResponseTranformation();
		helloResponse.setMessage("Hi !!! Hello Word !!!");
		helloResponse = hrTranformation.helloResponseTransalation(helloResponse);
		return helloResponse;
	}
}
