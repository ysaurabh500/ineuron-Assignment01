package com.assignment;

public class HomePartten {

	public static void main(String[] args) {
		int n=17;
		for(int i= 0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==0||i==n-1||i+j<=(n-1)/2||j-i>=(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
