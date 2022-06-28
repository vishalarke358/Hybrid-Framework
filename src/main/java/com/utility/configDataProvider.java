package com.utility;

import java.io.FileInputStream;

import java.util.Properties;

public class configDataProvider {

	 Properties pro;
   public configDataProvider() throws Exception {
	   String file="C:\\Users\\Lenovo\\eclipse-workspace\\Hybrid_framework\\config\\config.Properties";
	   FileInputStream fils=new FileInputStream(file);
	   pro=new Properties();    //load congigProperties file
	   pro.load(fils);
   }
	
   public String getQAENV_1() {
	      return pro.getProperty("QAENV_1");  //string key object
	   
   }
   
   
   
}
