package programs_arrays;

public class Document 
{
	int id;
	String folderName;
	String title;
	int pages;
	Document(int id,String foldername,String title,int pages)
	{
		this.id=id;
		this.folderName=folderName;
		this.title=title;
		this.pages=pages;
	}
	public int getId()
	{
		return this.id;
	}
	public String getFolderName()
	{
		return this.folderName;
	}
	public String getTitle()
	{
		return this.title;
	}
	public int getPages()
	{
		return this.pages;
	}
	public int setId(int id)
	{
		return this.id;
	}
	public String setFolderName(String folderName)
	{
		return this.folderName;
	}
	public String setTitle(String title)
	{
		return this.title;
	}
	public int setPages(int pages)
	{
		return this.pages;
	}
	public String toString()
	{
		return " "+this.id+" "+this.folderName+" "+this.title+" "+this.pages;
	}
}

