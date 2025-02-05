package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTest2 {
	static FileInputStream f; //Read file or convert given file
	static XSSFWorkbook wb; //
	static XSSFSheet   sh;
	
	public static String getStringData(int a,int b) throws IOException    
	{
		f=new FileInputStream("F:\\Testing course\\Manual\\test\\newexcel.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	public static String getIntegerData(int a, int b) throws IOException   
	{
		f= new FileInputStream("F:\\Testing course\\Manual\\test\\newexcel.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c= r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}
	
}
