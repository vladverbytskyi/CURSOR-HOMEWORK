import java.util.ArrayList;
import java.util.List;

public class DivisibleBy3 {
    void divisibleBy3() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        System.out.println("List  before remove: " + list);
        list.removeIf(integer -> integer % 3 == 0);
        System.out.println("List  after remove: " + list);
    }
}
