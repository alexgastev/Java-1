/**
 * Java. Homework 1
 *
 * @author AG
 * @version 12.09
 */

public class lesson1 {
    public static void main(String[] args) {

        /* task 2 */
        byte z = 1;
        short f = 2;
        int y = 3;
        long q = 4;
        float m = 5.0f;
        double n = 6.789;
        boolean g = false;
        char r = 0;

        /* task 3 */
        public static int task3(int a, int b, int c, int d) {
             task3 = a * (b + (c / d));
             return task3;
        }

        /* task 4 */
        public static boolean task4(int first, int second) {
            if (first + second <= 20 && first + second >= 10) {
                task4 = true;
            } else {
                task4 = false;
            }
            return task4;
        }

        /* task 5 */
        public static void task5(int x1) {
            if (x1>=0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }

        /* task 6 */
        public static boolean task6(int x2) {
            if (x2 < 0) {
                return true;
            } else {
                return false;
            }
        }

        /* task 7 */
        public static void task7(String name) {
            System.out.println("Привет, " + name);
        }

        /* task 8 */
        public static void task8(int year) {
            if (year % 400 == 0) {
                System.out.println("Visokosny god");
            } else if (year % 100 == 0) {
                System.out.println("Ne visokosny god");
            } else if (year % 4 == 0) {
                System.out.println("Visokosny god");
            } else {
                System.out.println("Ne visokosny god");
            }
        }
    }
}
