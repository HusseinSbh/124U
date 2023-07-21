public class First50OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 50) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
