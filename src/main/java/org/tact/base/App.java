package org.tact.base;

import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner objj = new Scanner(System.in);
		System.out.println("Enter two integers to add");
		int a = objj.nextInt();
		int b = objj.nextInt();
		System.out.println("Addition of given integer is " + App.add(a,b));
		System.out.println("\n");
		System.out.println("Enter the file path");
		String folder = objj.next();
		Filereader.file(folder);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
}
