package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException 
	{
		
		fun1("D:\\\\06012019\\\\BasicCoreJava\\\\src\\\\files\\\\properties\\\\ObjectRepo.propertiess");

	}
	
	
	public static void fun1(String path) throws IOException 
	{
		
		Properties or= new Properties();
		FileInputStream file= new FileInputStream(path);
		
		or.load(file);
		
		System.out.println(or.getProperty("username1"));
		
	}

}
