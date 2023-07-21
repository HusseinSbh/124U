public class DivisibleByTwoAndThree {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 20) {
            if (number % 2 == 0 && number % 3 == 0) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
