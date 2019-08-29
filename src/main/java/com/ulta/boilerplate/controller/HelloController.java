package com.ulta.boilerplate.controller;

import static com.ulta.boilerplate.constant.HelloConstant.HELLO_URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ulta.boilerplate.exception.HelloException;
import com.ulta.boilerplate.response.HelloResponse;
import com.ulta.boilerplate.service.HelloService;;

@RestController
public class HelloController {
	
	@Autowired 
	HelloService helloService;
	@RequestMapping(path = HELLO_URI,method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HelloResponse> getHelloWord() throws HelloException {
		HelloResponse helloResponse = helloService.getHelloWord();
		return ResponseEntity.ok().body(helloResponse);
		
	}

}
