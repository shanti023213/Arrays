package com.arrays.ravindra;

public class RotateSquareMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4},
						  {5, 6, 7, 8},
						  {9, 10, 11, 12},
						  {13, 14, 15, 16}};
		
		rotateSquareMatrix(matrix);

	}
	
	public static void rotateSquareMatrix(int[][] a){
		
		for(int i=0;i<a.length;i++){
			for(int j=0,k=a[0].length-1; j<k;j++,k--){
				int temp = a[i][j];
				a[i][j] = a[i][k];
				a[i][k] = temp;
			}
			
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i; j<a[0].length;j++){
				int temp = a[j][i];
				a[j][i] = a[i][j];
				a[i][j] = temp;
			}
			
		}
		
		System.out.println("Hi");
	}

}
