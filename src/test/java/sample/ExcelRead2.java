package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"\\Excel\\Book 4.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Login");
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
			Row eachRow = s.getRow(i);
			for(int j=0; j<eachRow.getPhysicalNumberOfCells();j++) {
				Cell c =  eachRow.getCell(j);
				if(c.getCellType()==CellType.STRING) {
					String name = c.getStringCellValue();
					System.out.println(name);
				} else {
					if (DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						SimpleDateFormat si = new SimpleDateFormat("dd-mm-yyyy");
						String date = si.format(d);
						System.out.println(date);
					} else {
						double num = c.getNumericCellValue();
						long b = (long)num;
						String number = String.valueOf(b);
						System.out.println(number);
					}
				}
			}
		}
		
		


	}

}
