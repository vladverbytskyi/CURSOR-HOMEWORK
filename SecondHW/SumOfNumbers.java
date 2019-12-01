package SecondHW;

public class SumOfNumbers {
    public static void main(String[] args) {

        Integer[] numbers = {1, -5, 8, 10, -22, 11};
        int sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        System.out.print(sum);
    }
}
