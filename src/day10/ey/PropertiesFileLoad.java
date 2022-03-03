package day10.ey;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileLoad {
	private static Properties loadProperties(String fileName) {
		
		InputStream propsFile;
		Properties props=new Properties();
		
		try {
			propsFile =new FileInputStream(fileName);
			props.load(propsFile);
			propsFile.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return props;
	}
	public static void main(String[] args) {
		
		final String PROPERTIES_FILE="MyApplication.properties";
		Properties myprops;
		myprops = loadProperties(PROPERTIES_FILE);
		System.out.println(myprops.get("username"));
		System.out.println(myprops.get("password"));
		System.out.println(myprops.get("batchname"));
		System.out.println(myprops.get("program"));

	}

}