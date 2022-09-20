public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat(){
        int stat = 0;
        int i = 0;
        for (int sale : sales){
            if (min()!= sale && sale != max()) {
                stat += sale;
                i++;
            }
        }
        System.out.println(i);
        return (stat/i);
    }
}
