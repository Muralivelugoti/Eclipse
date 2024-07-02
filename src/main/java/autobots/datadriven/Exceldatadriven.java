
package autobots.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldatadriven {
	
	public ArrayList<String> dataDriven(String sname, String cname, String ctext) throws IOException {
		FileInputStream fis = new FileInputStream("C://Users//Lenovo//Desktop//Test//ExcelDataDriven.xlsx");	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);	
		int sheets = workbook.getNumberOfSheets();
		ArrayList<String> arr = new ArrayList<String>();
//		System.out.println("Sheet Number :"+sheets);
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase(sname)) {
			XSSFSheet sheet = workbook.getSheetAt(i);
			Iterator<Row> row =	sheet.rowIterator();
			//row.next();
			Row firstrow = row.next();
			Iterator<Cell> ce =firstrow.cellIterator();
			int k=0;
			int colum=0;
			while(ce.hasNext()) {
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase(cname)) {
					colum=k;
					
				}
				k++;
				
			}
//			System.out.println("colum number :"+colum);
			while(row.hasNext()) {
			Row rv = row.next();
			if(rv.getCell(colum).getStringCellValue().equalsIgnoreCase(ctext)) {
				Iterator<Cell> cv=rv.cellIterator();
				while(cv.hasNext()) {
					Cell c = cv.next();
					
					
						arr.add(c.getStringCellValue());
						
					
					
				}
//			System.out.println(arr);
			}
			
			}
			
			}
			
			
		}
		return arr;
		
		}
		

	}

