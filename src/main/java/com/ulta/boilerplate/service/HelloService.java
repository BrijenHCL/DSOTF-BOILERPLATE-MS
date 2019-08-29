package com.ulta.boilerplate.service;

import org.springframework.stereotype.Service;

import com.ulta.boilerplate.exception.HelloException;
import com.ulta.boilerplate.response.HelloResponse;

@Service
public interface HelloService {

	public HelloResponse getHelloWord() throws HelloException;

}
