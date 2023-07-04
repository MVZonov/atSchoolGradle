package lesson54;

public class Task1 {
    static String s = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        String a = "6";
        System.out.println(findIndex(a));
        System.out.println(s);
    }

    public static int findIndex(String a) {
        return s.replace(" ", "").indexOf(a);
    }
}