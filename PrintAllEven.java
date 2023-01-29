package pwonedassignment1;

import java.util.Scanner;

public class PrintAllEven {
	
	/*static void printArray(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	*/
	
	static void printEven(int arr[]) {
		
		int n = arr.length;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]);
				
				
			}
		}
		
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

		printEven(arr);
		
		
		
	}

}
