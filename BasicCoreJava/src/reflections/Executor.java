package reflections;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import files.excel.Xls_Reader;

public class Executor {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
	{
		Xls_Reader xl= new Xls_Reader("D:\\UserLogin.xls");
		
		String tcName=xl.getCellData("Keywords", 2, "TC_Name");

		System.out.println(tcName);
		
		String[] keywords=xl.getCellData("Keywords", 2, "Keywords").split(",");
		
		Class c=Class.forName("reflections."+tcName);		
		Object obj=c.newInstance();		
		
		Method m=c.getDeclaredMethod(keywords[1]);
		m.invoke(obj);
		
	}

}
