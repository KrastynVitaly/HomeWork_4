import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача 1:
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Прямой порядок:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Обратный порядок:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
//        //Рандомные числа
//        int size = scanner.nextInt();
//        System.out.println(size);
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = (int) (Math.random() * 100);
//        }
//        System.out.println("Прямой порядок:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Обратный порядок:");
//        for (int i = size - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
    }
}