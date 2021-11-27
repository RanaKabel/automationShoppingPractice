package Utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {
			//Reference the workbook/ file
			workbook= new XSSFWorkbook (excelPath);

			//Reference the sheet

			sheet= workbook.getSheet(sheetName);
		}


		catch (Exception Exp)

		{

			System.out.println(Exp.getMessage());
			System.out.println(Exp.getCause());
			Exp.printStackTrace();}

		
		
	}
	
public static void main(String[] args) {
	
}




	public static int getRowCount () {
		int rowCount=0;
		try {
		 
		 rowCount= sheet.getPhysicalNumberOfRows();
		//System.out.println(rowCount);
		}
		
		
		catch (Exception Exp)

		{

			System.out.println(Exp.getMessage());
			System.out.println(Exp.getCause());
			Exp.printStackTrace();

		}
return rowCount;
	}
	
	
	public static String getCellData (int rowNum, int colNum)
	{
		String cellData=null;
		try {
			
		
			 cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
			}
			
			
			catch (Exception Exp)

			{

				System.out.println(Exp.getMessage());
				System.out.println(Exp.getCause());
				Exp.printStackTrace();

			}
		
		
		return cellData;
	}
	
	
	public static int getCellNumData (int rowNum, int colNum)
	{
		Double doublecellData=null;
		try {
			
		
			 doublecellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		
			}
			
			
			catch (Exception Exp)

			{

				System.out.println(Exp.getMessage());
				System.out.println(Exp.getCause());
				Exp.printStackTrace();

			}
		
		int cellData= doublecellData.intValue();
		return cellData;
	}
	
	
	
	
	
public static int getColCount () {
	int ColCount=0;
		try {
		 
		 ColCount= sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(ColCount);
		}
		
		
		catch (Exception Exp)

		{

			System.out.println(Exp.getMessage());
			System.out.println(Exp.getCause());
			Exp.printStackTrace();

		}
return ColCount;
	
}}
	

