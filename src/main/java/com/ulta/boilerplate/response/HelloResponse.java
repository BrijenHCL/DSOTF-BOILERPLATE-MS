/*
 * Copyright (C) 2019 ULTA
 * http://www.ulta.com
 * 9008570@ulta.com
 * All rights reserved
 */
package com.ulta.boilerplate.response;

import java.util.Date;

public class HelloResponse {
	private String message = null;
	private Date date= null;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
