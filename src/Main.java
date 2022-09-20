public class Main {
    public static void main(String[] args) {
        long[] price = {15L, 200L, 25L, 666L};
        SalesManager sales = new SalesManager(price);
        System.out.println(sales.max());
    }
}
