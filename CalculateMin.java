package pwonedassignment1;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateMin {

	static int calculate(int[] arr) {
		
		int ans =arr[0];
		
		

		
		for(int i=0;i<arr.length;i++) {
			
			ans = Math.min(ans,arr[i]);
			
			
			
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		
		int arr[] = new int[n];
		
		for(int i =0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
			
		
		System.out.println(calculate(arr));
		
		}
	}


