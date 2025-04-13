package com.cts.creatio.crm.language.basic;

import java.util.ArrayList;
import java.util.List;

public class A4_ArraysAndCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> area = new ArrayList<Float>();
		area.add((float) 1484f); //Delhi(1,484 sq km)	
		area.add((float) 741f); //Bengaluru(741 sq km)
		area.add( (float) 681.96f); //Visakhapatnam(681.96 sq km)
		area.add((float) 650f); //Hyderabad(650 sq km)
		area.add((float) 631f); //Lucknow(631 sq km)
		float totalarea = area.get(2)+area.get(3);
		System.out.println("The total area of the 3rd and 4th cities combined: " + String.format("%.2f", totalarea) +"\n");
		
		List <String> topA = new ArrayList<String>();
		topA.add("Louvre Museum (Paris, France)"+"\n");
		topA.add("Eiffel Tower (Paris, France)"+"\n");
		topA.add("Taj Mahal (Agra, India)"+"\n");
		topA.add("Colosseum (Rome, Italy)"+"\n");
		topA.add("Empire State Building (New York, USA)"+"\n");
		topA.add("Anne Frank House (Amsterdam, Netherlands)"+"\n");
		topA.add("Basilica of the Sagrada Família (Barcelona, Spain)"+"\n");
		topA.add("Cayman Crystal Caves (Grand Cayman, Cayman Islands)"+"\n");
		topA.add("Gardens by the Bay (Singapore)"+"\n");
		topA.add("Duomo of Milan (Milan, Italy)"+"\n");
		System.out.println("Top 10 tourist attractions: "+topA+"\n");
		System.out.println("Size of the array top 10 tourist Attractions: "+topA.size()+"\n");
		
		double A[] = {10,20,30,40,50,60,70,80,90,100};
		double c = (A[4]+A[5])/2;
		System.out.println("The Average of 5th and 6th Value is: "+c+"\n");
		
		List<String> movies= new ArrayList<String>();
		movies.add("Avatar (2009)");
		movies.add("Avengers: Endgame (2019)");
		movies.add("Avatar: The Way of Water (2022)");
		movies.add("Titanic (1997)");
		movies.add("Star Wars: The Force Awakens (2015)");
		System.out.println("The third movie on the list- "+movies.get(2));
		
		
		

	}

}
