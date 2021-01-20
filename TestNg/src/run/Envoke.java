package run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Envoke 
{
	public static void main(String[] args) throws IOException 
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\WorkSpace Java\\TestNg\\d.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("D:\\WorkSpace Java\\TestNg\\d.properties");
		prop.store(fos, null);
	}
}
