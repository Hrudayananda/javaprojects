package javaprojects;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {2,6,5,4,8,9};
		int t=7;
		boolean f=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== t) {
				f=true;
				System.out.println(f);
			}
		}
		if(!f) {
			System.out.println("number not found.");
		}
	}

}
