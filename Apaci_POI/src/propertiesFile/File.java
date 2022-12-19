package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File {
	
	FileInputStream fi;
	String path="F:\\Java\\demoData.txt";
	public Properties data() throws IOException
	{
		 fi=new FileInputStream(path);
		
		Properties pr=new Properties();
		
		return pr;
	}

}
