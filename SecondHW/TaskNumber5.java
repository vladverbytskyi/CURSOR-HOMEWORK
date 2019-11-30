package SecondHW;

public class TaskNumber5 {
    public static void main (String[] args) {
        Integer[] integers = {1, 2, 4, 1,};
        int sum = 0;
        for (int i = 0; i < integers.length; i ++)  {
            sum += integers[i];
        }
        System.out.print("Середнє арифметичне становить - " + sum / integers.length);
    }
}
