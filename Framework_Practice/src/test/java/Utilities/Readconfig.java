package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	
	Properties pro;

	public Readconfig()
	{

		File src = new File("./Configuration/config"); 



		try {

			FileInputStream fis = new FileInputStream(src);


			pro = new Properties();

			pro.load(fis);

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Exception is  "+e.getMessage()); 
		}


	}

	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
		
	}
	public String getUserName()
	{
		String uname = pro.getProperty("LoginuserName");
		return uname;
	}
	public String getPwd()
	{
		String pwd= pro.getProperty("LoginpassWord");
		return pwd;
		
	}
	public String getTourURL()
	{
		String url2 =  pro.getProperty("TourURL");
		return url2;
	}
	public String getTourUsername()
	{
		String Tourusername = pro.getProperty("tUserName");
		return Tourusername;
		
	}
	public String getTourPassword()
	{
		String pwd2 = pro.getProperty("tPassword");
		return pwd2;
		
	}
	

}
