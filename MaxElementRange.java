package pwonedassignment1;

import java.util.Scanner;

public class MaxElementRange {
	
	static void printArrary(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	static int maxtMost(int arr[]) {
		
		int ans =arr[0];
		
		for(int i =1;i<arr.length;i++) {
			
			if(arr[i]>arr[i-1]  && arr[i]>arr[i+1]) {
				
				ans = Math.max(arr[i],ans);
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements :");
		
		int arr[] = new int[n];
		
		for(int i =0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxtMost(arr));
		
		

	}

}
