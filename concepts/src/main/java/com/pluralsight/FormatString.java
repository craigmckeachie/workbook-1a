package com.pluralsight;

public class FormatString {

    public static void main(String[] args) {
        int x = 2;
        int y = 2;

        int sum = x + y;

        System.out.println("2 + 2 = 4");
        System.out.println(x + " + " + y  + " = " + sum);


        //format string type characters
        //f for a float or double (has decimal places)
        //d for an int or long (whole numbers)


        String message = String.format("%d + %d = %d", x,y, sum);
        System.out.println(message);


        System.out.printf("%d + %d = %d \n", x,y, sum);

//        char operator = '+';
//        String message2 = String.format("%d %c %d = %d", x,operator,y, sum);
//        System.out.println(message2);


        float grossPay = 5239.77f;
        System.out.printf("Gross Pay: $%.2f", grossPay);


    }


}
