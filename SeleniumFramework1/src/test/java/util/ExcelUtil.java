package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelUtil(String filepath, String sheetname) throws IOException{
		workbook=new XSSFWorkbook(filepath);
		sheet=workbook.getSheet(sheetname);
	}
		
	public String getCellData(int row, int col) {
		String celldata=sheet.getRow(row).getCell(col).getStringCellValue();
		return celldata;
	}
	
	public int getrowcount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getcolumncount() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

}
