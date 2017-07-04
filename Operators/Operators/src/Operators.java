/**
 * Created by home-folder on 6/22/17.
 */
public class Operators {

    public static void main(String[] args) {

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from (#3)
        // 5. Write an "if" statement that displays the message "Total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less
        double myFirstValue = 20;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        double theRemainder = myTotal % 40;

        System.out.println("myTotal = " + myTotal);
        System.out.println("remainder is " + theRemainder);
        if(theRemainder <= 20){
           System.out.println("Total was over the limit");
         }

    }
}
