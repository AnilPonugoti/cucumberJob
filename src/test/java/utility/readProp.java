package utility;

import java.io.FileInputStream;

import java.util.Properties;

public class readProp {
	
	public Properties getProperties() {
		Properties prop=null;
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}

}
