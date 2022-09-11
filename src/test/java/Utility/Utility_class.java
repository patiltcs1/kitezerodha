package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	public static String getTD(int rowindwx,int colindex)throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\Framework.xlsx");
		
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(rowindwx).getCell(colindex).getStringCellValue();
		return data;
		
	}

}
