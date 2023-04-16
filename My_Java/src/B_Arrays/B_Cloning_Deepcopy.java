package B_Arrays;

import java.util.Arrays; //Deep copy means a variable would have a copy of the original array in a different memory location.

public class B_Cloning_Deepcopy {

	public static void main(String[] args) {
		int arr[] = {11,12,13};
		int[] b =arr.clone();
		
	
		System.out.println("Elements inside arr:");
		
		for(int element:arr){
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Elements inside b:");
		
		for(int element:b){
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("After modification :");
		b[0] = b[0]*20;
		System.out.println("Elements inside arr:");
		for(int element:arr){
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Elements inside b:");
		for(int element:b){
			System.out.print(element+" ");
		}
         
	}
	}

