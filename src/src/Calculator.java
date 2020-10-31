package src;

import java.util.Random;

/*General class Calculator.*/

/**
 * @author Batya
 * */

public class Calculator {

    public static void calculator(){
        Random randomNumber = new Random();

        int randomNumber1 = randomNumber.nextInt(10);//get random number1 from 0 to 9;
        int randomNumber2 = randomNumber.nextInt(10);//get random number2 from 0 to 9;

        System.out.println("Sum of " + randomNumber1 + " and " + randomNumber2 + " = " + Plus.plus(randomNumber1, randomNumber2));
        System.out.println("Minus of " + randomNumber1 + " and " + randomNumber2 + " = " + Minus.minus(randomNumber1, randomNumber2));
        if(randomNumber2 == 0){//check if divider is 0
            System.out.println("Divider can not be 0");
        } else {
            System.out.println("Divide of " + randomNumber1 + " and " + randomNumber2 + " = " + Divide.divide(randomNumber1, randomNumber2));
        }
        System.out.println("Multiply of " + randomNumber1 + " and " + randomNumber2 + " = " + Multiply.multiply(randomNumber1, randomNumber2));
    }
}
