
package com.ttn.bootcamp.day1;

/*Write a program to replace a substring inside a string with other string.
 */
public class Ques1 {

    public static void main(String[] args) {
        String initialString = "Hello World";
        String toReplace = "He";
        String replacementString = "Wa";

      /*
      This method is used to replace a substring with another string
      @param initialString  main string under which replacement needs to happen
      @param toReplace string which need to be replaced
      @param replacementString string which needs to be replaced with toReplace string
      replaceAll() inbuilt function which will replace the target string.
      @return updated string
       */

        System.out.println(initialString);
        String updatedString = initialString.replaceAll(toReplace, replacementString);
        System.out.println(updatedString);
    }
}
