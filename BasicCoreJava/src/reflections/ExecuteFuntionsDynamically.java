package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecuteFuntionsDynamically {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class c = Class.forName("");
		Object scriptClassObj = c.newInstance();		

		Method m = c.getDeclaredMethod("login");
		m.invoke(scriptClassObj);

	}

}
