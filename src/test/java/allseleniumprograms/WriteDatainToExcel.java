package allseleniumprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainToExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\Downloads\\TestDD.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Testtest");
		for(int r=0;r<=3;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0; c<3;c++)
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue("welcome");
				
			}
		}
		wb.write(file);
		wb.close();
		file.close();
		
		
		
		
		
		
		
		
		


	}

}
