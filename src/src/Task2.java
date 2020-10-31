package src;

import java.util.Random;

public class Task2 {

    public static void task2Method(){

        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        System.out.println("Task2: Sum of " + number1 + " and " + number2 + " = " + resolution(number1, number2));
    }

    public static int resolution(int num1, int num2){
        if(num1 == num2){
            return (num1 + num2)*2;
        }
        return num1 + num2;
    }
}
