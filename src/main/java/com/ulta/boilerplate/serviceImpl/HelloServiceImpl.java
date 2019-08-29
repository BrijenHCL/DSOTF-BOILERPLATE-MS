package com.ulta.boilerplate.serviceImpl;

import org.springframework.stereotype.Service;

import com.ulta.boilerplate.exception.HelloException;
import com.ulta.boilerplate.response.HelloResponse;
import com.ulta.boilerplate.service.HelloService;

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
		helloResponse.setMessage("Hi !!! Hello Word !!!");
		return helloResponse;
	}
}
