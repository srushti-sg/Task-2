package program.com;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Choose the desired pattern
        System.out.println("Select a pattern:");
        System.out.println("1. Right-angled triangle");
        System.out.println("2. Inverted right-angled triangle");
        System.out.println("3. Pyramid");
        System.out.println("4. Diamond");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                rightAngledTriangle(rows);
                break;
            case 2:
                invertedRightAngledTriangle(rows);
                break;
            case 3:
                pyramid(rows);
                break;
            case 4:
                diamond(rows);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Helper methods for different patterns
    private static void rightAngledTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void invertedRightAngledTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void diamond(int rows) {
        pyramid(rows);
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    }