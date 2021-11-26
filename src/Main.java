public class Main {
    public static void main(String args[]){
        int StartCheck = 100; // Начальный счет
        int Sum_add = 1500; // Сумма пополнения баланса
        int Bonus; //Бонус
        if( Sum_add < 1000 ){
            Bonus = 0;
        }else{
            Bonus = Sum_add / 100;
        }
        System.out.print("Итого: ");
        System.out.print(Sum_add+StartCheck+Bonus);
        System.out.print(" руб.");
        System.out.print(" Бонус: ");
        System.out.print(Bonus);
        System.out.print(" руб.");
    }
}