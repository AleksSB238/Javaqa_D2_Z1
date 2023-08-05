public class Main {
    public static void main(String[] args) {
        System.out.println("Пополнение счета телефона");
        int score = 100;
        int paymentAmount = 1100;
        System.out.println("на  " + paymentAmount + " руб.");
        int bonus;

        if (paymentAmount > 1000){
            bonus = paymentAmount / 100;
        } else {
            bonus = 0;
        }

        int finalScore = score + paymentAmount + bonus;

        System.out.println("Итого на счету :  " + finalScore + " руб." + "  Из них бонусами :  " + bonus + " руб.");

    }
}