import java.util.Scanner;

public class mytryss {
    public static void main(String[] args) {

        {
            Scanner sc = new Scanner(System.in); //объект сканер который сканирует из стандартный ввод, (консоль)

            System.out.println(" Введите первое число:");
            String numString1 = sc.nextLine(); //сканер ожидай строку после ввода ентер запиши результат в переменную намстрин1
            for(char c : numString1.toCharArray()) { //проходимся по каждому сиволу из массив символов
                if (Character.isDigit(c)) { //проверяем являетс ли символ числом
                    System.out.println(c + " - this is a digit");
                } else {
                    System.out.println(c + " - this is not a digit");
                    return; // если нет заканчиваем программу
                }
            }
            System.out.println("Введите второе число:");
            String numString2 = sc.nextLine();
            for(char c : numString2.toCharArray()) {
                if (Character.isDigit(c)) {
                    System.out.println(c + " - this is a digit");
                } else {
                    System.out.println(c + " - this is not a digit");
                    return;
                }
            }
            int number1 = Integer.parseInt(numString1); //парсим число из строки
            int number2 = Integer.parseInt(numString2);
            int resultNumbers = number1 + number2;
            System.out.println("Результат ввода двух чисел " + resultNumbers);
//            String numString = sc.nextLine();
                      // if (String.isNumeric) {
            //numString.toCharArray() Skava ['S', 'k', 'a','v','a']



//                int num = Integer.parseInt(numstring);
//            }else {
//                System.out.println(numString + " Не является числом");
//            }

            //todo автомат выдачи напитков у нас будет кола - 100б фанкта - 120 , компот - 150 , сок - 300
            // мы будем вносить купюры 100 и проверяем на что нам хватает денег
            // потом сделать выбор "компот" выдача компота и ваша сдача посчитать сколько будет сдача
    }
}
}

