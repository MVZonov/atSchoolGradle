package lesson54;

public class Task2 {
    public static void action(String a, int b) {
        System.out.println("Путь: " + a.substring(0, b + 1));
        System.out.println("Имя файла: " + a.substring(b + 1));
    }
    public static void main(String[] args) {
        String a = args[0];
        int last1 = a.lastIndexOf("/");
        int last2 = a.lastIndexOf("\\");
        if (a.endsWith("/") || a.endsWith("\\")) {
            System.out.println("Введен некорректный путь до файла.");
        } else {
            if (last2 > 0) {
                action(a, last2);
            } else if (last1 > 0) {
                action(a, last1);
            } else {
                System.out.println("Проверьте правильность ввода.");
            }
        }
    }
}
