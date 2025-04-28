package assignmen6_array;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Suresh","Mahesh","Naresh"};
		int[] marks = {75, 80, 82};
		int marksfinal[]= new int[3];
		System.out.println("Updated Marks : "+"\n");
		for(int i=0;i<marks.length;i++) {
			marksfinal[i] = marks[i] +10;
			
			System.out.println(name[i] +":"+marksfinal[i]);
			;
		}
		
		int average = (marksfinal[0]+marksfinal[1]+marksfinal[2])/marks.length;
		System.out.println("Average Marks: "+average);

	}

}
