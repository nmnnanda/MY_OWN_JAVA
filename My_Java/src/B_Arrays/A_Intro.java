package B_Arrays;

public class A_Intro {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};  // SYNTAX : datatype arrayname  array declaration
		int[] arr1 = {6,7,8,90};
		
		int[] arr2 = new int[5];
		arr2[0] = 14;
		arr2[1] = 16;
		arr2[2] = 90;
		arr2[3] = 15;
		arr2[4] = 16;
		
		for(int i=0; i<=arr.length-1; i++) {
		System.out.print(arr2[i]+" ");
		}
		System.out.println();
		// multi dimentional array declaration and defintion
		
		// way 1 :
		int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; //declaration and defenation
		
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        
        //  Way 2 :
        
        int[][] arr4 = new int[3][4];

        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr4[i][j] = value;
                value++;
            System.out.print(arr4[i][j]+ " ");
        }
            System.out.println();
        }
        
        //Way 3
        int[][] arr5 = new int[2][3];
        arr5[0][0] = 14;
        arr5[0][1] = 16;
        arr5[0][2] = 90;
        arr5[1][0] = 15;
        arr5[1][1] = 16;
        arr5[1][2] = 13;

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        }

}
}