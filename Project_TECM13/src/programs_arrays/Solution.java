package programs_arrays;

public class Solution 
{
	public static void main(String[] args) 
	{
		Document[] d1=new Document[4];
		d1[0]=new Document(24,"BZA","Swaram",564);
		d1[1]=new Document(48,"HYD","Durgam",88);
		d1[2]=new Document(25,"VSKP","Anargalam",879);
		d1[3]=new Document(50,"PVPT","Anitharasadhyam",213);
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













