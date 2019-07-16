package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];

        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            product *= intArray[i];

        }

        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        int sum = 0;

        for (int i = 0; i < intArray.length; i ++){
            sum += intArray[i];
        }


        return (double)(sum / intArray.length);
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {

        int largest = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            largest = largerNumber(largest, intArray[i]);

        }
        return largest;
    }

    private static Integer largerNumber(int x, int y){
        if (x > y){
            return x;
        }
        if (y > x){
            return y;
        }

        return x;

    }

}
