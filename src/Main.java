public class Main {
    public static void main(String[] args) {
//<<<<<<< HEAD
        //long[] price = {15L, 200L, 25L, 666L};
//=======
        long[] price = {15L, 15L , 666L, 200L, 25L, 666L, 526L, 126L, 88L, 666L};
//>>>>>>> Stat
        SalesManager sales = new SalesManager(price);
        System.out.println("Sale max = " + sales.max());
        System.out.println("Sale min = " + sales.min());
        System.out.println("Sale stat = " + sales.stat());
    }
}
