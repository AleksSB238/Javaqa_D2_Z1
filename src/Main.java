public class Main {
    public static void main(String[] args) {
        System.out.println("Пополнение счета телефона");
        int score = 100;
        int payment_amount = 1100;
        System.out.println("на  " + payment_amount + " руб.");
        int bonus;

        if (payment_amount > 1000){
            bonus = payment_amount / 100;
        } else {
            bonus = 0;
        }

        int final_score = score + payment_amount + bonus;

        System.out.println("Итого на счету :  " + final_score + " руб." + "  Из них бонусами :  " + bonus + " руб.");

    }
}