package hbcu.stay.ready.assessment1.part1;



/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String[] sentence = str.split("\\s+");

        for (int i = 0; i < sentence.length; i++) {

            sentence[i] = sentence[i].substring(0,1).toUpperCase() + sentence[i].substring(1).toLowerCase();
        }





        return listToSentence(sentence);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {


        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {

        String[] reversedSentence = str.split("\\s+");

        for (int i = 0; i < reversedSentence.length; i++) {
            reversedSentence[i] = reverse(reversedSentence[i]);

        }

        return listToSentence(reversedSentence);
    }

    private static String listToSentence(String[] list){

        String sentence = "";

        for(int i = 0; i < list.length; i ++){
            sentence += list[i];
            if (i != list.length - 1){
                sentence += " ";
            }
        }

        return sentence;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        StringBuilder tempString = new StringBuilder(str).reverse();

        String reversedString = tempString.toString();


        return camelCase(reversedString);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String newString = "";

        for (int i = 1; i < str.length() - 1; i ++){
            newString += str.charAt(i);
        }

        return newString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String[] string = str.split("");

        String emptyString = "";

        for (int i = 0; i < string.length; i++) {
            if (Character.isUpperCase(string[i].charAt(0))){
                emptyString += string[i].toLowerCase();
            }
            else if(Character.isLowerCase(string[i].charAt(0))) {
                emptyString += string[i].toUpperCase();
            }
            else{
                emptyString += string[i];
            }

        }



        return emptyString;
    }

}
