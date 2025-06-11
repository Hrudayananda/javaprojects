package javapj;

public class Quadratictime {

	public static void main(String[] args) {
		int[] num= {1,3,5,7,99};
		boolean hasduplicate=false;
		
		//O(n^2) nested loop for comparing all pairs
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] == num[j]) {
					hasduplicate = true;
					System.out.println("Duplicate found:"+num[i]);
				}
			}
		}
		if(!hasduplicate) {
			System.out.println("no Duplicate found.");
		}
	}

}
