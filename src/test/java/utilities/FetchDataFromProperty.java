package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constantsData.Constants;

public class FetchDataFromProperty {
	
	public static Properties getDataFromProperty() throws IOException
	{
	   FileReader fr = new FileReader(Constants.PROP_FIle_PATH);
	   Properties pr = new Properties();
	   pr.load(fr);
	   return pr;
	}

}
