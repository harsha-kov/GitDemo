package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir") + "\\Excel\\Book 4.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Login");
		int rowCount = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowCount; i++) {
			Row eachRow = s.getRow(i);
			int cellCount = eachRow.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
				Cell c = eachRow.getCell(j);
				System.out.println(c);
			}
		}
	}

}
