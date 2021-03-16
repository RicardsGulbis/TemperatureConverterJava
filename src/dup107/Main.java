package dup107;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("1 = Celsius to Fahrenheit");
        System.out.println("2 = Celsius to Kelvin");
        System.out.println("3 = Celsius to Rankine");
        System.out.println("4 = Kelvin to Celsius");
        System.out.println("5 = Kelvin to Fahrenheit");
        System.out.println("6 = Kelvin to Rankine");
        System.out.println("7 = Rankine to Celsius");
        System.out.println("8 = Rankine to Fahrenheit");
        System.out.println("9 = Rankine to Kelvin");
        System.out.println("Option : 1 - 9 ");

        int metode;
        if (sc.hasNextInt()) {
            metode = sc.nextInt();
            if (metode < 1 || metode > 9) {
                System.out.println("input-output error");
                sc.close();
                return;
            }
            System.out.println("Value");
            double skaitlis1 = sc.nextDouble();


            switch (metode) {
                case 1 -> System.out.println(("Result"+" "+(skaitlis1 * 1.8) + 32)); //Celsius to Fahrenheit conversion
                case 2 -> System.out.println(("Result"+" "+(skaitlis1 + 273.15))); //Celsius to Kelvin conversion
                case 3 -> System.out.println(("Result"+" "+(skaitlis1 - 273.15) * 1.8)); //Celsius to Rankine conversion

                case 4 -> System.out.println(("Result"+" "+(skaitlis1 - 273.15)));  //Kelvin to Celsius
                case 5 -> System.out.println("Result"+" "+((skaitlis1 * 1.8) - 459.67)); //Kelvin to Fahrenheit
                case 6 -> System.out.println(("Result"+" "+(skaitlis1 * 1.8))); //

                case 7 -> System.out.println(("Result"+" "+(skaitlis1 - 491.67)*0.5556)); //Rankine to Celsius
                case 8 -> System.out.println(("Result"+" "+(skaitlis1 - 459.67))); //Rankine to Fahrenheit
                case 9 -> System.out.println(("Result"+" "+(skaitlis1 * 0.5556))); //Rankine to Kelvin


            }


        }

    }
}
