package org.tact.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader  {
	
	public static void file(String folder) throws FileNotFoundException {
	File file1 = new File(folder);
	Filereader  fi = new Filereader();
	fi.listFiles(file1);
	}

	private void listFiles(File file) {
		// TODO Auto-generated method stub
		System.out.println("Reading the files from the folder");
		File[] fileNames = file.listFiles(); 
		for(File file2 : fileNames) {
			if(file2.isDirectory()) {
			  listFiles(file2);
			}else {
				try {
					readContent(file2);
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}

	private void readContent(File file2) throws IOException {
		// TODO Auto-generated method stub
		try(BufferedReader br  = new BufferedReader(new FileReader(file2))){
            String strLine;
            while((strLine = br.readLine()) != null) {
             System.out.println("File content  is - " + strLine);
            }
		}
	}	
}
