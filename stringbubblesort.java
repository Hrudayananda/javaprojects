package javapj;

public class stringbubblesort {

	public static void main(String[] args) {
		String[] arr= {"gani","anil","kamal","jithu"};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String str=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=str;
				}
			}
		}
		System.out.println("sorted string");
		for(String s:arr) {
			System.out.println(s);
		}
	}

}
