package aiisgnment10_Array_And_Loops;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {12,34,11,36,87,98,93};
		
		int max1= 0;
		int max2=0;
		int max3=0;
		//int max1 = array1[1];
		for(int i=0;i<array1.length;i++) {
			if (max1<array1[i]) {
				//data = temp;
				max1 =array1[i];
				
			}
			
		}
		//System.out.println(max1);
		
		for(int i=0;i<array1.length;i++) {
			if(max2<array1[i] && array1[i]!=max1) {
				max2=array1[i];
			}
		}
		System.out.println("The 2nd largest no.: "+max2);
		
		for(int i=0;i<array1.length;i++) {
			if(max3<array1[i] && array1[i]!=max1 && array1[i]!=max2) {
				max3=array1[i];
			}
		}
		System.out.println("The 3rd largest no.: "+max3);
	}

}
