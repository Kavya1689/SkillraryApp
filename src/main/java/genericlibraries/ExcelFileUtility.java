package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	//Workbook workbook=null;
	/*public String fetchDataFromExcel(String sheetName, int rowNum, int cellNum)
	{
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	*/
	
	private Workbook workbook;
	public void excelInitialization(String excelpath)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(excelpath);
		} catch ( FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> fetchDataFromExcel(String sheetName)
	{
		List<String> list=new ArrayList<>();
		Sheet sheet=workbook.getSheet(sheetName);
		for(int i=0; i<4; i++)
		{
			String data=sheet.getRow(i).getCell(1).getStringCellValue();
			list.add(data);
		}
		return list;
 	}
	public void closeWorkbook()
	{
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
