import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven1 
{
	public ArrayList<String> getData(String testCaseName) throws IOException
	{
		ArrayList<String> as=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("D:\\Profession\\Excel Practice\\ABC Company.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("DB"))
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
					if(value.getStringCellValue().equalsIgnoreCase("Name"))
					{
						column=k;
					}
					k++;

				}
				System.out.println("Column present at "+ column+" index position");
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))
					{
						
						Iterator<Cell> cr=r.cellIterator();
						
						while(cr.hasNext())
						{
							Cell c=cr.next();
							if(c.getCellType()==CellType.STRING)
							{
							//System.out.println(cr.next().getStringCellValue());
							as.add((c.getStringCellValue()));
							}
							else
							{
								as.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
					}
				}
				
			}
				
		}
		 return as;
	}

	
}