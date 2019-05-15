package util;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
//	public static void main(String[] args) throws IOException {
//
//	}
	
	@Test(dataProvider = "test1data")
	public void test1(String username, String password, String address) {
		System.out.println(username+" "+ password + " "+ address);
	}
	
	@DataProvider(name="test1data")
	public Object[][] getdata() throws IOException {
		String projectpath=System.getProperty("user.dir");
		String filepath=projectpath+"\\excel\\test.xlsx";
		Object data[][]=testdata(projectpath,filepath);
		return data;
	}
			
	
	public static Object[][] testdata(String projectpath, String filepath) throws IOException 
	{
		
		ExcelUtil excel=new ExcelUtil(filepath,"Sheet1");
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolumncount();
		Object data[][]=new Object[rowcount-1][colcount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0; j<colcount;j++) {
				String celldata=excel.getCellData(i, j);
				//System.out.print(celldata + " ");	
				data[i-1][j]=celldata;
			}
			System.out.println();
		}
		return data;
	}
}

