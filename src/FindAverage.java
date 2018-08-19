/**
 * Create a program that will average the scores given
 *
 * @author Udayan Khattry 
 */
public class FindAverage {
    public static void main(String[] args) {
        int [] scores = new int[] {85, 70, 95, 90, 100};
        int sum = 0;

        // this is another way of instantianting the array with values than using the way i did it on line 8
        // int [] scores = new int [5];
        /*scores[0] = 85;
        scores[1] = 70;
        scores[2] = 95;
        scores[3] = 90;
        scores[4] = 100;*/

        // same thing of using i <= scores.length - 1
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int average = sum / scores.length;
        System.out.println("Average score of " + scores.length + " students: " + average);
    }
}
