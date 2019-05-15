package util;

import java.io.IOException;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		String filepath=projectpath+"\\excel\\test.xlsx";
		ExcelUtil util=new ExcelUtil(filepath,"Sheet1");
		util.getCellData(1, 1);
		
		

	}

}
