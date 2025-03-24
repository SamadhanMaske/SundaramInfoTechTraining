package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/a.txt");

	}

}
