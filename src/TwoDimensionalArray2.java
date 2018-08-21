/**
 * Class to show how to construct a symmetrical 2-D array.
 *
 * @author Udayan Khattry
 */
public class TwoDimensionalArray2 {
    public static void main(String[] args) {
		/*
		 2nd dimensions are initialized on separate statements.
		 */
//		int [][] arr = new int[3][]; // this will create an object of three elements - each element is an int data type.. these will become a reference type... then java will assign null to each of the elements... arr will distort the address of this object or index
//		arr[0] = new int [2];
//		arr[1] = new int [2];
//		arr[2] = new int [2];

		/*
		 If 2nd dimension is fixed, then following syntax can be used
		 to construct 2-D array object.
		 */
        int [][] arr = new int[3][2];
		
		/*
		 Separate statements to print all the array elements.
		 */
        System.out.println(arr[0][0]); // will first assign the int default value of 0
        System.out.println(arr[0][1]); // will first assign the int default value of 0
        System.out.println(arr[1][0]); // will first assign the int default value of 0
        System.out.println(arr[1][1]); // will first assign the int default value of 0
        System.out.println(arr[2][0]); // will first assign the int default value of 0
        System.out.println(arr[2][1]); // will first assign the int default value of 0

        // arr is an example of symmetrical two dimensionality

    }
}