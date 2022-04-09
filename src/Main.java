public class Main {
    public static void main(String[] args) {

        //входные данные
        int currentAccount = 100;
        int amountCredited = 1100;

        //логика программы
//        int bonus;
//        if (amountCredited < 1000) {
//            bonus = 0;
//        } else {
//            bonus = amountCredited / 100;
//        }
        int bonus = (amountCredited < 1000) ? 0 : amountCredited / 100;
        int total;
        total = currentAccount + amountCredited + bonus;
        System.out.println("Итоговый счет - " + total);
        System.out.println("Сумма бонуса - " + bonus);
    }
}
