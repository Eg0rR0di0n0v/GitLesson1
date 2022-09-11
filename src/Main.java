public class Main {
    public static void main(String[] args) {
        int[] price = {15, 200, 25, 666};
        SalesManager sales = new SalesManager(price);
        System.out.println(sales.max());
    }
}
