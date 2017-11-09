package com.spiral;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int columns = sc.nextInt();
int arr[][] = new int[rows][columns];
for(int i=0;i<rows;i++){ 
	for(int j=0;j<columns;j++){
		arr[i][j]=sc.nextInt();
	}
}
spiral(rows, columns, arr);
	}

	private static void spiral(int rows, int columns, int[][] arr) {
    int k=0, m=0,i=0;
   while(k<rows&&m<columns){
	   for( i=m;i<columns;i++){
		   System.out.println(arr[k][i]);
		 
	   }  k++;
	   
	   for(i=k;i<rows;i++){
		   System.out.println(arr[i][columns-1]);
	   }columns--;
	   
	   if(k<rows){
	   for(i=columns-1;i>=m;i--){
		   System.out.println(arr[rows-1][i]);
		  
	   
	   rows--;
	   }
	   if(m<columns){
	   for(i=rows-1;i>=k;i--){
		   System.out.println(arr[i][m]);
		  
	   }
	   m++;
	   }
   }
    
    
	}

}
}
