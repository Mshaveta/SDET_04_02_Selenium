

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public String[][] readData() {
		// S1: workbook Path
		String wbPath = System.getProperty("user.dir") + "\\src\\test\\java\\testData\\loginData.xlsx";
		XlsReader2 xlr = new XlsReader2(wbPath);
		// S2: count Rows
		int rowCount = xlr.getRowCount("login");
		// S3: Count Cols
		int colCount = xlr.getCellCount();

		// 2D temp_arr
		String[][] data_arr = new String[rowCount - 1][colCount];
		// S4: to fetch all the data from Excel sheet
		for (int i = 1; i <rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data_arr[i-1][j] = xlr.getCellData(i, j);
			}
		}
		return data_arr;
	}

	@Test(dataProvider = "readData")
	public void login(String appUrl , String username , String password) {
		System.out.println("App Url  - "+appUrl+"Login - "+username+" - "+password);
	}
}
