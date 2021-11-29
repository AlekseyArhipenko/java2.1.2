public class Main {
    public static void main(String[] args) {
        int minimum = 1000;
        int replishment = 10000;
        int balance = 100;

        int bonus;
        if(replishment > minimum) {
            bonus = replishment / 100;
        } else {
            bonus = 0;
        }

        int sumBalance;
        sumBalance = balance + replishment + bonus;

        System.out.println(sumBalance);
        System.out.println(bonus);
    }
}