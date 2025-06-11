package javapj;

public class ConstantTime {
	public static void printElement(int[] arr) {
		if(arr.length > 0) {
			System.out.println("First Element is:"+arr[9]);
		}else {
			System.out.println("Array is Empty.");
		}
	}
	

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50,32,45,32,455,6,3,412,75};
		printElement(num);

	}
}