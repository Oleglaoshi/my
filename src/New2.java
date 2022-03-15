import java.util.Arrays;
import java.util.Scanner;

public class New2 {
    public static void main (String []args){
        String result = "Результат";
                int a = 17;
        int b = 36;
        int resultSum = a + b;

        System.out.println(result + " " + resultSum);
        String result2 = "Результат ещё";
        int fg = 4;
        int hk = 3;
        int ressultSum = fg+hk;
        System.out.println (result2 + " " + ressultSum);
        int x = 20;
        int z = 3;
        int multiply = x*z;
        System.out.println( result + " " + multiply);
        int all = resultSum * multiply;
        System.out.println(result + " " + all);
        int trymultiply = a * z;
        System.out.println( trymultiply);
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите первое число:");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int number2 = sc.nextInt();
        int resultNumbers = number1+number2;
        System.out.println( "Результат ввода двух чисел " + resultNumbers);
        System.out.println("Спасибо! Вы ввели число " + number1 );
        System.out.println("Спасибо! Вы ввели число " + number2 );
        if (number1 < 100)
            System.out.println ("num меньше 100");




    }
}
