package com.example.demo.util;

import lombok.Data;

@Data
public class ResponseVO<T> {
	private int code = 200;
	private String message;
	private boolean check = true;
	private T response;
}
