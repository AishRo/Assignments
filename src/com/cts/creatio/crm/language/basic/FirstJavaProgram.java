package com.cts.creatio.crm.language.basic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		//print the placeholder
		System.out.printf("%s is my name, my emp is %d, attendance status is %b", "Aish", 123, true);
		System.out.println("");
		
		System.out.format("total bill is %.2f %n", 100.9886522); 
		
		System.out.append("Hi").append(" Aish!!").append(" \n ");
		
		System.out.write(97);
		System.out.println();
		
		
		System.err.println("ERROR : There is a error in Line 22");
		
		Logger log = Logger.getLogger("My Logger");
		log.info("Current line is 26!");
		log.warning("Warning at Line 27, Please check!!");
		
		PrintWriter w= new PrintWriter("C:\\AutomationTraining\\AutomationProject\\Log.txt");
		w.println(LocalDateTime.now()+"  Line 32 is running");
		w.format(LocalDateTime.now()+"  total bill is %.2f %n", 100.9886522);
		w.append(LocalDateTime.now()+"  Hi").append("Aish").append("\n");
		w.write(65); System.out.println();
		w.println(LocalDateTime.now()+" This is line 37");
		
		
		w.close();
		
		
		
	}

}
