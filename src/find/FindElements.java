package find;

/**
 * Created by Yuriy on 21.02.2016.
 * Це мерзенний код, але я маю на деякий час забути про нього і йти далі)
  */
public class FindElements {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 3, 4}, {2, 1, 3, 1, 2}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        int k = 0;
        System.out.print("Line 1: ");
        for (int i = 0; i < 5; i++) {
            if (arr[0][i] == 1) {
                k = i;
                System.out.print(k);
            }
        }
        System.out.println();
        System.out.print("Line 2: ");
        for (int i = 0; i < 5; i++) {
            if (arr[1][i] == 1) {
                k = i;
                System.out.print(k);
            }
        }
        System.out.println();
        System.out.print("Line 3: ");
        for (int i = 0; i < 5; i++) {
            if (arr[2][i] == 1) {
                k = i;
                System.out.print(k);
            }
        }
        System.out.println();
        System.out.print("Line 4: ");
        for (int i = 0; i < 5; i++) {
            if (arr[3][i] == 1) {
                k = i;
                System.out.print(k);
            }
        }
    }
}







