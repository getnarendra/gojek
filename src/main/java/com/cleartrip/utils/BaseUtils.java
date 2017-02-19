package com.cleartrip.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseUtils {
	
	Properties p = new Properties();
	
	public Properties Readproperties() throws IOException{
		System.out.println(System.getProperty("user.dir"));
		InputStream in = new FileInputStream(new File(System.getProperty("user.dir") +   "\\src\\main\\resources\\data\\data.properties"));
		p.load(in);
		return p;
	}
}
