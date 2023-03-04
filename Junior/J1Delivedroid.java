import java.util.Scanner;

public class J1Delivedroid {
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int numPackagesDelivered = theScanner.nextInt(); // first line is the number of packages succesfully delivered
        int numObstacleCollisions = theScanner.nextInt(); // second line is the number of obstacles collided with
        int score = numPackagesDelivered * 50; // adds 50 for each package delivered
        score = score + (numObstacleCollisions * -10); // subtracts 10 for each obstacle collided with
        if (numPackagesDelivered > numObstacleCollisions) { // adds 500 if more packages were delivered than obstacles were collided with
            score = score + 500;
        }
        System.out.println(score); // prints the final score
    }
}