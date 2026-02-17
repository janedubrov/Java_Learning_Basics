package Day4;

public class Ternary {
    public static void main(String[] args) {
//        int money = 100;
//        int bread = 20;
//        int rest = money - bread;
//        int reward = rest >= 50 ? 10 : 5;
//        rest -= rest >= 50 ? 10 : 5;
//        System.out.println(reward);
//        System.out.println(rest);

//        if (rest >= 50) {
//            reward = 10;
//            rest -= 10;
//        } else {
//            reward = 5;
//            rest -= 5;

      int money = 100;
      int bread = 20;
      int moneyAfterPurchase = money - bread;
      int leftToChild = moneyAfterPurchase >= 50 ? 10 : 5;
      moneyAfterPurchase -= moneyAfterPurchase >= 50 ? 10 : 5;
        System.out.println(leftToChild);
        System.out.println(moneyAfterPurchase);


        }
    }
