package Action_keyword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Locatersmap {
	HashMap<String, String> nameToTypeMap;
	HashMap<String, String> nameToValueMap;
	
	public Locatersmap()throws IOException {
	    String filePath = "/home/qainfotech/eclipse-workspace/TATOC_MODULAR_APPROACH/src/Locator/locators.txt";
	    nameToTypeMap = new HashMap<String, String>();
	    nameToValueMap = new HashMap<String, String>();

	    String line;
	    BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    while ((line = reader.readLine()) != null)
	    {
	        String[] parts = line.split(":",6);
	        if (parts.length >= 2)
	        {
	            String name = parts[0];
	           /* System.out.println("a"+parts[0]);
	            System.out.println(parts[1]);
	            System.out.println(parts[2]);
	            System.out.println(parts[3]);
	            System.out.println(parts[4]);*/
	            String type = parts[2];
	            String value = parts[4];
	            nameToTypeMap.put(name, type);
	            nameToValueMap.put(name, value);
	        } else {
	            System.out.println(line);
	        }
	    }
	    reader.close();
	}
	
	public String getLocatorType(String LocatorName) {
		return nameToTypeMap.get(LocatorName);
		
	}
	
	public String getLocatorValue(String LocatorName) {
		return nameToValueMap.get(LocatorName);
	}

}
