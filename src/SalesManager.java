public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat() {
        int stat = 0;
        int i = 0;
        int n = 0;
        int x = 0;
        for (long sale : sales) {
            //if (min() != sale $$ sale != max() ) {
            //   stat += sale;
            //   i++;
            //}
            if (min() == sale && n == 0) {
                n++;
            } else if (max() == sale && x == 0) {
                x++;
            } else {
                stat += sale;
                i++;
                //System.out.println(sale);
            }
        }
        //System.out.println(i);
        return (stat / i);
    }
}
