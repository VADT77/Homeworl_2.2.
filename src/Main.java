
public class Main {
    public static void main(String[] args) {
        int accountValue = 100;
        int payment = 1100;


        int bonus = 1000 / 100;
        if (payment >= 1000) {
            accountValue = accountValue + payment / 100;
        }
        accountValue = accountValue + payment;


        System.out.printf("Платёж %s руб. принят. На вашем счету: %s руб., в том числе бонусы: %s руб.", payment, accountValue, bonus);
    }
}

