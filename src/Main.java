public class Main {

    public static void main(String[] args) {
        int score = 250;
        int amount = 1001;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else bonus = 0;
        int item_score = score + amount + bonus;
        System.out.println("итоговый счёт:" + item_score);
        System.out.println("бонусных рублей:" + bonus);
    }
}
