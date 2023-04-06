import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int maxNumber = scanner.nextInt();

        int i = 1;
        int iPow = 1;
        while (maxNumber >= iPow) {
            System.out.println(iPow);
            i++;
            iPow = (int) Math.pow(i, 2);
        }
    }
}