package hbcu.stay.ready.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {

        Integer[] evenLessArray = new Integer[numberOfEvenNumbers(ints)];

        int j = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0){
                evenLessArray[j] = ints[i];
                j ++;
            }

        }

        return evenLessArray;
    }

    private static Integer numberOfEvenNumbers(Integer[] array){

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count ++;
            }

        }

        return count;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        Integer[] oddLessArray = new Integer[numberOfOddNumbers(ints)];

        int j = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0){
                oddLessArray[j] = ints[i];
                j ++;
            }

        }




        return oddLessArray;

    }


    private static Integer numberOfOddNumbers(Integer[] array){

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                count ++;
            }

        }

        return count;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] deletedMultiplesOf3 = new Integer[multipleOf3Less(ints)];

        int j = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0){
                deletedMultiplesOf3[j] = ints[i];
                j ++;
            }


        }

        return deletedMultiplesOf3;
    }

    private static Integer multipleOf3Less(Integer[] ints){
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 ==0){
                count ++;
            }

        }
        return count;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] deletedMultiplesOfN = new Integer[multiplesOfNLess(ints, multiple)];

        int j = 0;

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] % multiple == 0){
                deletedMultiplesOfN[j] = ints[i];
                j ++;
            }

        }


        return deletedMultiplesOfN;
    }

    private static Integer multiplesOfNLess(Integer[] ints, int multiple){
        int count = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple ==0){
                count ++;
            }

        }
        return count;
    }
}
