package org.pineapple.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	public static Properties readPropertyFile(String filepath) throws IOException
	{
		File f = new File(filepath);
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		return pr;
	}

}
