package com.cts.creatio.crm.language.basic;

public class Assignment3_ArrayClass extends Assignment3_class{

	String [] emp = new String [3];
	int [] id = new int [3];
	
	public void insertValue(Assignment3_class a) {
		emp[0] = a.emp1;
		emp[1] = a.emp2;
		emp[2] = a.emp3;
		
		id[0] = a.id1;
		id[1] = a.id2;
		id[2] = a.id3;
				
	}
	
	public void printValue(){
		for(int i=0;i<emp.length;i++) {
			System.out.println("Emplyee Name: "+emp[i]+"  " +"Employee ID:" +id[i]);
		}
	}
		 
	public static void main(String[] args) {
		Assignment3_class ac = new Assignment3_class();
		Assignment3_ArrayClass ac1 = new Assignment3_ArrayClass();
		ac1.insertValue(ac);
		ac1.printValue();
		

	}

}
