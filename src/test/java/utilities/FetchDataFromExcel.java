package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantsData.Constants;

public class FetchDataFromExcel {
	
	public static String getURL(int x, int y) throws IOException
	{
		FileInputStream fs = new FileInputStream(Constants.EXCEL_PATH);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFCell value = sheet.getRow(x).getCell(y);
		String url = value.toString();
		wb.close();
		return url;
		
	}

}
