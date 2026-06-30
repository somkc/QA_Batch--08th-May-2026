import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook();
		
		Sheet s1 = wb.createSheet("Sheet_A");
		Sheet s2 = wb.createSheet("Sheet_B");
		Row r1 = s2.createRow(10);
		Row r2 = s2.createRow(1);
		Row r3 = s2.createRow(2);
		Cell c1 = r1.createCell(8);
		Cell c2 = r1.createCell(10);
		Cell c3 = r1.createCell(15);
		Cell c4 = r1.createCell(3);
		
		c1.setCellValue(10);
		c2.setCellValue(789.90);
		c3.setCellValue("Testing");
		
		
		try (OutputStream fileOut = new FileOutputStream("S:\\STUDY\\JANBASK\\QA Batch - 08th May 2026\\DataParameterization\\src\\test\\java\\TestData\\TestWorkbook.xlsx")) {
		    wb.write(fileOut);
		}
	}

}
