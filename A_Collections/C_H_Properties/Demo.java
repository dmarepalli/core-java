package C_H_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {
public static void main(String[] args) throws IOException {
	Properties p = new Properties();
	System.out.println(new File(".").getAbsolutePath());
	FileInputStream fis = new FileInputStream(new File(".").getAbsolutePath()+"\\A_Collections\\C_H_Properties\\abc.properties");
	p.load(fis);
	String s = p.getProperty("user");
	System.out.println(s);
	p.setProperty("David", "10000");
	FileOutputStream fos = new FileOutputStream(new File(".").getAbsolutePath()+"\\A_Collections\\C_H_Properties\\abc.properties");
	p.store(fos, "updated by me");
}
}
