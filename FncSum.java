public class FncSum {
    static int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int x = 10, y = 2;
        System.out.printf("The Sum of %d and %d is: %d\n", x, y, sum(x, y));
        System.out.println("sum: " + sum(x, y));
    }
}