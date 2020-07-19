package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir")+"\\Excel\\Book 4.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Login");
		XSSFRow row = sheet.getRow(3);
		XSSFCell cell = row.getCell(1);
		System.out.println(cell.getCellType());
		System.out.println("From Asian End");
		System.out.println("Harsha");
	}

}
