import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        /*
        int numOfNums;
        System.out.println("How many random numbers do you want to see (must be at least 1)?");
        numOfNums = scan.nextInt();
        printRandom(numOfNums);
        
        double x1;
        System.out.println("Enter the first x-coordinate:");
        x1 = scan.nextDouble();
        double x2;
        System.out.println("Enter the second x-coordinate:");
        x2 = scan.nextDouble();
        double y1;
        System.out.println("Enter the first y-coordinate:");
        y1 = scan.nextDouble();
        double y2;
        System.out.println("Enter the second y-coordinate:");
        y2 = scan.nextDouble();
        System.out.println("Slope: " + calcSlope(x1, x2, y1, y2));
        */
        System.out.println("Enter two doubles:");
        System.out.print('>');
        double f;
        f = scan.nextDouble();
        System.out.print('>');
        double s;
        s = scan.nextDouble();
        System.out.println("Distance: " + roundedDist(f, s));

    }
    public static int roundedDist(double a, double b)
    {
        int dist = (int)(Math.abs(a - b) + 0.5);
        return dist;
    }
    
    public static void printRandom(int num)
    {
        System.out.println("Enter a positive integer:\n" + num);
        System.out.println("Random numbers:");
        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println((int)(Math.random() * (num + 1) + 2));
        }
        return;

    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2)
    {
        
        double slope = (y1 + y2) / (x1 + x2);
        
        return slope;
    }
    
    
}
