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
		System.out.println("4.Sleep Method Implementation");
		System.out.println("5.Email Validtion using Regex");
		System.out.println("6.Phone Number Validation");
		
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
		case 4: Sleep.slp();
		break;
		case 5: System.out.println("Enter the Email Address");
		String cs = objj.next();
		if(Regex.regex(cs)){
            System.out.println("valid Address"); 
        }else{
            System.out.println("Email Address Not Valid");
        }
		break;
		case 6: System.out.println("Enter the Phone Number");
		String ph = objj.next();
		PhNo.ph1(ph);
		break;
		default:System.out.println("Enter the correct option");
		}
		          }
	
	public static int add(int a, int b) {
		return a+b;
	}
	
}
