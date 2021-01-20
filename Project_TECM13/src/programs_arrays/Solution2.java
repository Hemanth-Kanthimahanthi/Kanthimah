package programs_arrays;
import java.util.Scanner;
public class Solution2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter document array size..");
		int size=sc.nextInt();
		Document[] d1=new Document[size];
		for(int i=0;i<=d1.length-1;i++)
		{
			System.out.println("enter "+i+" index elements..");
			System.out.println("enter id..");
			int id=sc.nextInt();
			System.out.println("enter folder name..");
			String folderName=sc.next();
			System.out.println("enter title...");
			String title=sc.next();
			System.out.println("enter pages..");
			int pages=sc.nextInt();
			d1[i]=new Document(id,folderName,title,pages);
		}
		Document rv=combineDocument(d1);
		System.out.println(rv);
	}
	public static Document combineDocument(Document[] d1)
	{
		int finalId=d1[0].getId();
		String finalFolderName=d1[0].getFolderName();
		String finalTitle=d1[0].getTitle();
		int finalPages=d1[0].getPages();
		for(int i=1;i<=d1.length-1;i++)
		{
			int tempId=d1[i].getId();
			if(tempId>finalId)
			{
			finalId=tempId;
			}
			
			String tempFolderName=d1[i].getFolderName();
			finalFolderName=finalFolderName+"#"+tempFolderName;
		
			String tempTitle=d1[i].getTitle();
			finalTitle=finalTitle+tempTitle;
		
			int tempPages=d1[i].getPages();
			finalPages=finalPages+tempPages;			
		}
			Document rv=new Document(finalId,finalFolderName,finalTitle,finalPages);
			return rv;
	}

	}
