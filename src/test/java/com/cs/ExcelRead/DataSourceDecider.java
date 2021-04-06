package com.cs.ExcelRead;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DataSourceDecider {

	static Logger log;
	static String obtainedUrl;
	static String obtainedData;

	static {
		log = LogManager.getLogger(DataSourceDecider.class);
	}

	public static String dataFinder(String data) throws Exception {
		
		
		 if(!(data.startsWith("#")))
		 {
		 return data;
			}

		else if(data.startsWith("#")){
		
				String s=data.substring(1);
			
			obtainedData= ExcelRead.getdata(s);
			
			} 
	
		return obtainedData;
		
		
	}



}