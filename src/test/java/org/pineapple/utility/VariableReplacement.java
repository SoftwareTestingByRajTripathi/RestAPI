package org.pineapple.utility;

import java.util.regex.Pattern;

public class VariableReplacement {
	
	public static String variableValue(String jsonData,String variableName,String VaraibleValue )
	{
	String replacedvalue =	jsonData.replaceAll(Pattern.quote("{{"+variableName+"}}"), VaraibleValue);
	
	return replacedvalue;
	}

}
