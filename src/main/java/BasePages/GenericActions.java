package BasePages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class GenericActions {

	public static void fillTextField(WebElement TextField, String FieldValue) {
		TextField.sendKeys(FieldValue);
	}

	public static String readTestData(String SheetName,String ColumnName, int RowNumber) throws IOException{
		String DriverPath=System.getProperty("user.dir");
		File TestDataFile=new File(DriverPath+File.separator + "TestData"+File.separator+"qaDemoTestData.xlsx");
		System.out.println(TestDataFile);
		XSSFWorkbook TestDataWorkBook = null;;
		XSSFSheet TestDataSheet;
		XSSFRow row;
		XSSFCell cell;
		String cellValue = null;
		try {
			FileInputStream inputStream = new FileInputStream(TestDataFile);
			 TestDataWorkBook = new XSSFWorkbook(inputStream);;
			 TestDataSheet=TestDataWorkBook.getSheet(SheetName);
			int col_Num=-1;
			 row=TestDataSheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				if(row.getCell(i).getStringCellValue().equals(ColumnName.trim()))
					col_Num=i;
			}
			row=TestDataSheet.getRow(RowNumber-1);
			cell=row.getCell(col_Num);
			
			if (cell.getCellType()==cell.CELL_TYPE_NUMERIC){
				 cellValue = String.valueOf(cell.getNumericCellValue());
			}
			else if(cell.getCellType()==cell.CELL_TYPE_STRING){
				 cellValue = String.valueOf(cell.getStringCellValue());
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally{
			TestDataWorkBook.close();
		
	
	}
		return cellValue;
	}

}
