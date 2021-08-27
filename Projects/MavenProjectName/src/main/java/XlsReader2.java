

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReader2 {
	Workbook work_book;
	Sheet sheet;
	Row row;

	public XlsReader2(String wbPath) {
		try {
			work_book = new XSSFWorkbook(wbPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getRowCount(String sheetName) {
		// 2. Get the Sheet of Workbook.
		sheet = work_book.getSheet(sheetName);
		int lastRowNo = sheet.getLastRowNum();// 3
		int firstRowNo = sheet.getFirstRowNum();// 0

		int rCount = (lastRowNo - firstRowNo) + 1;// 3-0=3
		return rCount;
	}

	public int getCellCount() {
		row = sheet.getRow(0);
		int firstCellNum = row.getFirstCellNum();
		int lastCellNum = row.getLastCellNum();
		int cellCount = lastCellNum - firstCellNum;// 2-0
		return cellCount;
	}

	public String getCellData(int row,int col) {
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	
//	public static void main(String[] args) {
//		//S1: workbook Path
//		String wbPath = System.getProperty("user.dir") + "\\src\\testData\\loginData.xlsx";
//		XlsReader xlr = new XlsReader(wbPath);
//		//S2: count Rows
//		int rowCount = xlr.getRowCount("login");
//		//S3: Count Cols
//		int colCount = xlr.getCellCount();
//		 
//		//S4: to fetch all the data from Excel sheet
//		for(int i=1;i<rowCount;i++) {
//			for(int j=0;j<colCount;j++) {
//				String data = xlr.getCellData(i,j);
//				System.out.print(data+" ");
//			}
//			System.out.println ();
//		}
//		
//
//	}
}
