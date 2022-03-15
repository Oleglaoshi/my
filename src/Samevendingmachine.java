import java.util.Scanner;

public class Samevendingmachine {
    public static void main (String [] args) {
        Scanner machine = new Scanner(System.in);
        int priceBublic = 25;
        int priceBulca = 20;
        int priceBaton = 30;
        int priceHleb = 50;
        int buttonBublic = 1;
        int buttonBulca = 2;
        int buttonBaton = 3;
        int buttonHleb = 4;
        int exitButton = -1;
        while (true) {
            System.out.print("Введите какое хлебобулочное изделие вы хотите: Если хотите бублик нажмите кнопку 1 " +
                    "если булку 2, если батон 3, если хлеб 4, для выхода из меню выбора хлебобулочных изделий нажмите -1");
            int chooseCookie = machine.nextInt();
            if(chooseCookie == exitButton){
                System.out.println("Вы выключили автомат");
                return;
            }
            if (chooseCookie == buttonBublic
                    || chooseCookie == buttonBulca
                    || chooseCookie == buttonBaton
                    || chooseCookie == buttonHleb)
            {
                System.out.print("Внесите сумму: ");
                if (chooseCookie == buttonBublic) {
                    System.out.println(priceBublic + " рублей");
                }
                if (chooseCookie == buttonBulca) {
                    System.out.println(priceBulca + " рублей");
                }
                if (chooseCookie == buttonBaton) {
                    System.out.println(priceBaton + " рублей");
                }
                if (chooseCookie == buttonHleb) {
                    System.out.println(priceHleb + " рублей");
                }
            } else {
                System.out.println("Нет такого товара");
        }

    }

}}
