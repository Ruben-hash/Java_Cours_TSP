//class Main {
//    public static void main(String[] args) {
//        int var = 14;
//        for (int i = 1; i <= var; i++) {
//            for (int l = 1; l <= (var-i); l++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int g = i - 1; g >= 1; g--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

public class pyramide {
    public static void main(String[] args) {
        int rows = 14; // Number of rows in the pyramid

        // Loop over each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for current row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print ascending numbers for current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers for current row
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}