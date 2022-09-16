public class Main {
    /*
    Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
*/
        public static String abbrevName(String name) {
            String str1 = name.substring(0, 1);
            str1 = str1.toUpperCase();
            String str2 = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2);
            str2 = str2.toUpperCase();
            name = str1 + "." + str2;
            return name;





        }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}