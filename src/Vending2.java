import java.util.Scanner;

public class Vending2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //цена товара
        int priceCola = 100;
        int priceFanta = 120;
        int priceStewedFruit = 150;
        int priceJuice = 300;
        //выбор товара
        int buttonCola = 1;
        int buttonFanta = 2;
        int buttonStewedFruit = 3;
        int buttonJuice = 4;
        // for exit enter -1
        int exitButton = -1;

        while (true) {
            System.out.print("Enter drink you want: Если хотите колу нажмите кнопку 1 " +
                    "если фанту 2 если компот 3 сок -4 for exit enter -1");
            int chooseDrink = keyboard.nextInt();
            if(chooseDrink == exitButton){
                System.out.println("Вы выключили автомат");
                return;
            }
            if (chooseDrink == buttonCola
                    || chooseDrink == buttonFanta
                    || chooseDrink == buttonStewedFruit
                    || chooseDrink == buttonJuice
            ) {
                System.out.print("Внесите сумму: ");
                if (chooseDrink == buttonCola) {
                    System.out.println(priceCola + " рублей");
                }
                if (chooseDrink == buttonFanta) {
                    System.out.println(priceFanta + " рублей");
                }
                if (chooseDrink == buttonStewedFruit) {
                    System.out.println(priceStewedFruit + " рублей");
                }
                if (chooseDrink == buttonJuice) {
                    System.out.println(priceJuice + " рублей");
                }
            } else {
                System.out.println("Нет такого товара");
            }
        }

    }

}