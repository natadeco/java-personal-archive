package org.tact.base;

import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner objj = new Scanner(System.in);
		System.out.println("Micro-Assignments");
		System.out.println("Enter Your Choice");
		System.out.println("1.Addtion");
		System.out.println("2.Reading files from the folder");
		System.out.println("3.Concatenation of two Dictionary");
		int ch = objj.nextInt();
		
		switch(ch) {
		case 1: System.out.println("Enter two integers to add");
		int a = objj.nextInt();
		int b = objj.nextInt();
		System.out.println("Addition of given integer is " + App.add(a,b));
		break;
		case 2: System.out.println("Enter the file path");
		String folder = objj.next();
		Filereader.file(folder);
		break;
		case 3: System.out.println("Concatenation of two dictionary");
		Dict.dic();
		break;
		default:System.out.println("Enter the correct option");
		}
		          }
	
	public static int add(int a, int b) {
		return a+b;
	}
	
}
