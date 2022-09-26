public class Main {
    public static void main(String[] args) {
//<<<<<<< HEAD
        //long[] price = {15L, 200L, 25L, 666L};
//=======
        long[] price = {15L, 200L, 25L, 666L, 526L, 126L, 88L};
//>>>>>>> Stat
        SalesManager sales = new SalesManager(price);
        System.out.println(sales.max());
        System.out.println(sales.min());
        System.out.println(sales.stat());
    }
}
