import java.util.*;
/*
Prompt for time
Multiply hours by .5
Remove the decimal
*/


public class KeepHydrated{
    public static void main(String[] args){
        //Create a Scanner object for obtaining input
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the hours cycled and I'll tell you how much water Nathan drank__________:");
        
        //Double variable for keyboard input
        double hoursCycled = reader.nextDouble();
        reader.close();

        //Truncate the decimal -- rounding down to the nearest whole
        int waterConsumed = getWater(hoursCycled);

        //Display the output
        System.out.print("Nathan drank " + waterConsumed + " liter(s)");
    }

    public static int getWater(double time) {
        return (int)(time * .5);
    }
}

