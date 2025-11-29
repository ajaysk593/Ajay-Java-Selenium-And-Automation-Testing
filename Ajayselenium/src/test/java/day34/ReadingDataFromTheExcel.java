package day34;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromTheExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		    FileInputStream file=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Ajayselenium\\Selenium Test Data Excel File\\Selenium Automation Excel file.xlsx");
		  
		        XSSFWorkbook workbook=new XSSFWorkbook(file);
		        XSSFSheet sheet=workbook.getSheet("sheet1");
				
		        int totalRows=sheet.getLastRowNum();
		        int totalcells=sheet.getRow(1).getLastCellNum();
		        System.out.println("Number of rows:"+totalRows);
		        System.out.println("Number of cells:"+totalcells);
		        
		        for(int r=0;r<=totalRows;r++)
		        {
		        	XSSFRow currentRow=sheet.getRow(r);
		        	
		        	for (int c=0;c<totalcells;c++)
		        	{
		        		XSSFCell cell=currentRow.getCell(c);
		        		System.out.println(cell.toString()+"\t");
		        	}
		        	System.out.println();
		        	}
		             workbook.close();
		             file.close();
		            
		        	
		        }
		        
				
	}


