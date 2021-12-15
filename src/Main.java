public class Main {
    public static void main(String args[]) {
        int startCheck = 100; // Начальный счет
        int sumAdd = 1500; // Сумма пополнения баланса
        int bonus; //Бонус
        if (sumAdd < 1000) {
            bonus = 0;
        } else {
            bonus = sumAdd / 100;
        }
        int total = sumAdd + startCheck + bonus;
        System.out.print("Итого: " + total + " руб; Бонус: " + bonus + " руб.");
    }
}