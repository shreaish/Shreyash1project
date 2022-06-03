package appachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class Xlsheet
{
public static void main(String[] args) throws IOException 
{
	String path=("G:\\Excalsheet\\apache.xlsx");
	FileInputStream file=new FileInputStream(path);
	//worksheet
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sheet=book.getSheet("selenium");
	XSSFRow row=sheet.getRow(0);
	XSSFCell cell=row.getCell(0);
	String date=cell.getStringCellValue();
	System.out.println(date);

	
}
}
