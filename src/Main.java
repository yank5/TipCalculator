import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
//definitions
        float totCost =0;
        float cost =0;
        int people;
        float percent;

        DecimalFormat formatter = new DecimalFormat("#.##");
//inputs
        Scanner test = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("People in group: ");
        people = test.nextInt();
        System.out.print("Tip percentage 1-100: ");
        percent = test.nextInt();
//cost addition loop
        while(cost!=-1){
            System.out.print("Enter cost in dollar (write -1 to stop) :");
            cost = test.nextFloat();
            if (cost>=0) { //makes sure -1 isnt added to totCost
                totCost += cost;
            }
        }
//math
        float tip = (percent/100)*(totCost);
        String tipF = formatter.format(tip);
        float ppbt = totCost/people;
        String ppbtF = formatter.format(ppbt);
        float tcpp = ((totCost+tip)/people);
        String tcppF = formatter.format(tcpp);

//output
        System.out.print("Total bill before tip: "+totCost);
        System.out.print("\nTip percentage: "+percent);
        System.out.print("\nTotal tip: "+tipF);
        System.out.print("\nTotal bill with tip: "+(totCost+tip));
        System.out.print("\nPer person cost before tip: "+ ppbtF);
        System.out.print("\nTip per person: "+percent/people);
        System.out.print("\nTotal cost per person: "+tcppF);


        test.close();
    }
}