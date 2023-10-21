public class Main {

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 7;
        int total = number1 + number2;
        boolean sumChecker = hasEqualSum(number1, number2, total);
        System.out.println("The number add up: " + sumChecker);

        number1 = 5;
        number2 = 7;
        total = number1 + number2;
        sumChecker = hasEqualSum(number1, number2, 15);
        System.out.println("The number add up: " + sumChecker);

    }

    public static boolean hasEqualSum(int number1, int number2, int total) {

        if (number1 + number2 == total) {
            return true;
        } else {
            return false;
        }

    }


}