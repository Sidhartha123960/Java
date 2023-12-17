package com.sidhartha.mainclass;
import java.io.*;

class Ubuntu implements Runnable
{
	 public void run()
	 {
         File f1 = new File("C:\\Users\\LENOVO\\Desktop\\FileUbutntu\\license.txt");
         File f2 = new File("C:\\Users\\LENOVO\\Desktop\\FileUbutntu\\version.txt");
         if(f1.isFile() && f2.isFile())
		 {
		    for(int i=1;i<=2000;i++)
		    {
		        System.out.println(f1.getName());
		        System.out.println(f2.getName());
		    }	
		 }
         else
         {
        	 System.out.println("......not found......");
         }
	 }	
}
public class FileUbuntuTransfer 
{

	public static void main(String[] args) 
	{
		Ubuntu u = new Ubuntu();
        Thread thread1 = new Thread(u);
		thread1.run();      
	}
}