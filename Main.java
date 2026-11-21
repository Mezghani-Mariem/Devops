public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Bienvenue");

        System.out.println(a + "*" + b + "=" + Operation.multiplication(a, b));
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a, b));
        System.out.println(a + "+" + b + "=" + Operation.addition(a, b));
        System.out.println(a + "/" + b + "=" + Operation.division(a, b));
        int zero = 0;
        System.out.println(a + "/" + zero + "=" + Operation.division(a, zero));
        System.out.println("Au revoir");
    }
}
