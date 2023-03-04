import java.util.Scanner;

public class J1Delivedroid {
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int numPackagesDelivered = theScanner.nextInt();
        int numObstacleCollisions = theScanner.nextInt();
        int score = numPackagesDelivered * 50;
        score = score + (numObstacleCollisions * -10);
        if (numPackagesDelivered > numObstacleCollisions) {
            score = score + 500;
        }
        System.out.println(score);
    }
}