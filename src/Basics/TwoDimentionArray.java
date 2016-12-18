package src.Basics;

public class TwoDimentionArray {

public void initialarray() {
	int[][] arr = new int[10][10];
	   
			  for(int i = 0 ; i<arr.length ; i++) {
				  for(int j = 0 ; j<arr[i].length ; j++){
					  arr[i][j] = i+j;
				  }
			  }
}
}