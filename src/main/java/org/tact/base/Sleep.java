package org.tact.base;

public class Sleep {
	public  static void slp() {
for(int i=0;i<5;i++) {
	System.out.println("Hello Toronto");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}
