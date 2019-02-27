package org.tact.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	static void ex(String path) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File ff = new File(path);
		FileInputStream fis = new FileInputStream(ff);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		 DataFormatter dataFormatter = new DataFormatter();
		 System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
	        for (Row row: sheet) {
	            for(Cell cell: row) {
	                String cellValue = dataFormatter.formatCellValue(cell);
	                System.out.print(cellValue + "\t");
	            }
	            System.out.println();
	        }
	        	wb.close();
	}

}
