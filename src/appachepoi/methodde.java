package appachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class methodde
{
	public static void main(String[] args) throws IOException
	{

		String path="G:\\Excalsheet\\apache.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book =new XSSFWorkbook(file);
		String data=book.getSheet("selenium").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		String data1=book.getSheet("selenium").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data1);
		
	}

}
