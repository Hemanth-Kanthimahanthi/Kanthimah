import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven 
{
	@SuppressWarnings("resource")
	public ArrayList<String> getData(String testCaseName) throws IOException
	{
		ArrayList<String> as=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("D:\\Profession\\Excel Practice\\Demo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("AL"))
			{
				XSSFSheet sheet= workbook.getSheetAt(i); 
				//Identify test cases column by scanning the entire 1st row
				
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				
				int k=0;
				int column = 0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestData"))
					{
						column=k;
					}
					k++;

				}
				System.out.println(column);
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))
					{
						
						Iterator<Cell> cr=r.cellIterator();
						
						while(cr.hasNext())
						{
							//System.out.println(cr.next().getStringCellValue());
							as.add(cr.next().getStringCellValue());
						}
					}
				}
				
			}
				
		}
		 return as;
	}

	
}
