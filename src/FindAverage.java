/**
 * Create a program that will average the scores given
 *
 * @author Udayan Khattry 
 */
public class FindAverage {
    public static void main(String[] args) {
        int [] scores = new int[4];
        int sum = 0;

        scores[0] = 85;
        scores[1] = 70;
        scores[2] = 95;
        scores[3] = 90;

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int average = sum / scores.length;
        System.out.println("Average score of 4 students: " + average);

    }
}
