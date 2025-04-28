package Assignment9_ConditionalStatementAndLoops;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHikeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> output = new HashMap<String, Double>();
		output.put("Alice Johnson", calculateHikePercentage(75000.0, 5.1, 4.2));
		output.put("Bob Smith", calculateHikePercentage(68000.0, 3.2, 3.8));
		output.put("Carol Davis", calculateHikePercentage(82000.0, 7.1, 4.5));
		output.put("David Brown", calculateHikePercentage(90000.0, 10.2, 2.5));
		output.put("Eva Green", calculateHikePercentage(60000.0, 2.4, 3.5));
		
		for (Map.Entry<String, Double> entry : output.entrySet()) {
            System.out.printf("%s : %.2f%% \n", entry.getKey(), entry.getValue()*100 );
        }
		
		
	}
		





private static double calculateHikePercentage(double baseSalary, double experience, double rating) {
 
 double vPay = 0.0;
 double bonus = 0.0;
 double reward = 0.0;
 
 if(rating>=4.0) {
	 baseSalary = 15.0;
	 bonus =1500;
 }
 else if(rating >= 3.0 ) {
	 baseSalary = 10.0;
	 bonus =1200;
 }
 else {
	 baseSalary = 3.0;
	 bonus =300;
 }
 
 if (experience >= 5) {
	 bonus = 5000;
 }

 double hike = ( baseSalary * vPay/100) + bonus + reward ;

return hike/baseSalary;
 
	
	
	
}
}