package appachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EL
{
	public static void main(String[] args) throws IOException
{
	String path="G:\\Excalsheet\\apache.xlsx";
	//File Read
	FileInputStream file=new FileInputStream(path);
	//Worksheet
	XSSFWorkbook book=new XSSFWorkbook(file);
	//sheet
	XSSFSheet sheet=book.getSheet("selenium");
//Row
XSSFRow row=sheet.getRow(0);
XSSFCell cell=row.getCell(0);
	double data=cell.getNumericCellValue();
	System.out.println(data);
	
	double data1=book.getSheet("selenium").getRow(1).getCell(0).getNumericCellValue();
System.out.println(data1);

	
	
}

}
