public class Main {


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