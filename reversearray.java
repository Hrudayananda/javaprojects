package javapj;

import java.util.Arrays;

public class reversearray {

    public static void main(String[] args) {
        int[] arr = {5, 7, 6, 8, 0, 2};
        int[] rev = new int[arr.length];

        int index = 0; 

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < 1; j++) { 
                rev[index] = arr[i];
                index++;
            }
        }

        System.out.println("reverse array:" + Arrays.toString(rev));
    }
}
