/**
 * Create a program that will do the same printing as this:
 *
 * int arr = new int[7];
 *
 * arr[0] = 10;
 * arr[1] = 20;
 * arr[2] = 30;
 * arr[3] = 40;
 * arr[4] = 50;
 * arr[5] = 60;
 * arr[6] = 70;
 *
 * @author Udayan Khattry
 */
public class ArrayIteration {
    public static void main(String[] args) {
        int [] arr = new int[7];

        // this is the same way as doing this:
        // int j = 10;
        // DO NOT DO for(int i = 0; int j = 10;...)

        // you can move the j += 10 to the for () section behind the i++... just remove the ;
        // OR  you can add it right after arr[i] = j;

        // you can't add a comma after the boolean statement... it only holds one
        for(int i = 0, j = 10; i < arr.length; i++, j += 10) {
            arr[i] = j;
            System.out.println(arr[i]);
        }

    }
}
