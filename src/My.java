public class My {

public static void main (String [] args) {
    String result = "Результат";
    System.out.println(result);
    int a = 3;
    int b = 7;
    int resultSum = a + b;
    System.out.println(result + " " + resultSum);
    String resultWithSumResult = result + " " + resultSum;
    System.out.println(resultWithSumResult);
    String resultWithProcessSum = result + " " + (a +b);
    String total = "Итог";
    int c = 17;
    int d = 34;
    int totalSum = c + d;
    System.out.println(total + " " + totalSum);
    System.out.println(total + " " + (c+d));
    String generalTotal = "Общий итог";
    int generaltotalSum = a + b + c + d;
    System.out.println( generalTotal + " " + generaltotalSum);

}
}
