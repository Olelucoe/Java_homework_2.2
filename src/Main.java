public class Main {

    public static void main(String[] args) {
        int score = 250;
        int amount = 1001;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        } ;
        int itemScore = score + amount + bonus;
        System.out.println("итоговый счёт:" + itemScore);
        System.out.println("бонусных рублей:" + bonus);
    }
}
