import java.util.Scanner;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {

        float totCost =1;
        float cost =0;

        Scanner test = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("People in group: ");
        int people = test.nextInt();
        System.out.print("Tip percent: ");
        int percent = test.nextInt();

        while(cost!=-1){
            System.out.print("Enter cost in dollar (write -1 to stop) :");
            cost = test.nextFloat();
            totCost+=cost;
        }






        test.close();
    }
}