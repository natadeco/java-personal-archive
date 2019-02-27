package org.tact.base;

import java.io.File;

public class Filesize {
static void file(String f) {
	
	File ff = new File(f);
	System.out.println("File Size in bytes is " + ff.length());
	
}
}
