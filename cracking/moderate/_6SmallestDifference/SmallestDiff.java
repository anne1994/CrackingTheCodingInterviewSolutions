package _6SmallestDifference;

import java.util.Arrays;

class SmallestDiff{
	//compute the pair of values(one in each array) with smallest diff
	static int findSmallestDifference(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		int a = 0;
		int b = 0;
		int diff = Integer.MAX_VALUE;
		while(a < array1.length && b < array2.length) {
			if(Math.abs(array1[a]-array2[b]) < diff) {
				diff = Math.abs(array1[a]-array2[b]);
			}
		//move smaller value
		if(array1[a] < array2[b]) {
			a++;
		}else {
			b++;
		 }
		} //while loop 
		return diff;
	}
	
	
	
	
}