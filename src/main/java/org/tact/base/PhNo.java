package org.tact.base;

public class PhNo {
	 static void ph1(String ph){
		 if(ph.length() ==10) {
			 if(ph.startsWith("7") || ph.startsWith("8") || ph.startsWith("9")) {
				 System.out.println("Valid Number"); 
			 }
			 else{
		           System.out.println("Not a Valid Number");
		       }   
		 }
		 else if(ph.length() >=10 && ph.length() <=12){
	           if(ph.startsWith("91") || ph.startsWith("0")){
	               System.out.println("Valid Number");
	           }
	               else{
	                       System.out.println("Not a Valid Number");
	                    }                          
	       }else{
	           System.out.println("Not a Valid Number");
	       }  
	   }
}
