package org.pineapple.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead {
	public static String ReadJsonData(String jsonFilePath) throws FileNotFoundException
	{
		File f = new File(jsonFilePath);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject ob = new JSONObject(js);
		return ob.toString();
		
		
	}

}
