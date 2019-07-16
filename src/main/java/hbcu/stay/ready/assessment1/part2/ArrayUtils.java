package hbcu.stay.ready.assessment1.part2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if(objectArray[i] == objectToCount){
                count += 1;
            }

        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        Object[] newArray = new Object[objectArray.length - 1];

        for (int i = 0; i < objectArray.length; i++) {
            if(objectArray[i] != objectToRemove){
                newArray[i] = objectArray[i];
            }

        }

        return newArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        HashMap <Object, Integer>dictionary = new HashMap<Object, Integer>();

        fillDictionary(dictionary, objectArray);

        int commonNumber = 0;

        Object commonObject = 0;

        for(Map.Entry<Object, Integer> entry : dictionary.entrySet()){

            if (entry.getValue() > commonNumber){
                commonNumber = entry.getValue();

                commonObject = entry.getKey();
            }


        }


        return commonObject;
    }


    private static Object fillDictionary(HashMap<Object, Integer> dictionary, Object[] objectArray){


        for (int i = 0; i < objectArray.length; i++){

            Object key = objectArray[i];

            if(dictionary.containsKey(key)){
                Integer value = dictionary.get(key);
                value ++;
                dictionary.put(key, value);
            }
            else{
                dictionary.put(key, 1);
            }
        }



        return dictionary;

    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        HashMap <Object, Integer>dictionary = new HashMap<Object, Integer>();

        fillDictionary(dictionary, objectArray);

        int leastCommonNumber = 0;

        Object leastCommonObject = 0;

        for (Map.Entry<Object, Integer> entry : dictionary.entrySet()){

            if (leastCommonNumber == 0){
                leastCommonNumber = entry.getValue();
                leastCommonObject = entry.getKey();
            }
            else{
                if(leastCommonNumber > entry.getValue()){

                    leastCommonNumber = entry.getValue();
                    leastCommonObject = entry.getValue();

                }

            }

        }
        return leastCommonObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        int length = objectArray.length + objectArrayToAdd.length;

        Object[] mergedArray = new Object[length];

        for (int i = 0; i < objectArray.length; i++) {

            mergedArray[i] = objectArray[i];

        }

        for (int i = 0; i < objectArrayToAdd.length; i++){
            mergedArray[i + objectArray.length] = objectArrayToAdd[i];
        }



        return mergedArray;
    }


}
