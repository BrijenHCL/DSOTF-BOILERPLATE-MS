/*
 * Copyright (C) 2019 ULTA
 * http://www.ulta.com
 * 9008570@ulta.com
 * All rights reserved
 */
package com.ulta.boilerplate.service;

import org.springframework.stereotype.Service;

import com.ulta.boilerplate.exception.HelloException;
import com.ulta.boilerplate.response.HelloResponse;

@Service
public interface HelloService {

	public HelloResponse getHelloWord() throws HelloException;

}
