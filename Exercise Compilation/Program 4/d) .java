public class First50EvenNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; count < 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
