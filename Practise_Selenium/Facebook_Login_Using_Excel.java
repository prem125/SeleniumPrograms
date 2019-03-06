package Practise_Selenium;

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Facebook_Login_Using_Excel {

	public static void main(String[] args) throws Exception {
		File f = new File("E:\\Eclipse Selenium\\Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("Sheet1");
		Row rw = st.getRow(0);
		Cell cl = rw.getCell(0);
		String data = cl.toString();
		System.out.println(data);
	}
}
