import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T extends Number> {
    private List<T> list = new ArrayList<>();

    public void addArgument(T argument) {
        this.list.add(argument);
    }

    public List<T> getList() {
        return list;
    }

    public Integer getMax(@NotNull List<T> list) {
        return list
                .stream()
                .mapToInt(Number::intValue)
                .max().orElseThrow(NoSuchElementException::new);
    }

    public Integer getMin(@NotNull List<T> list) {
        return list
                .stream()
                .mapToInt(Number::intValue)
                .min().orElseThrow(NoSuchElementException::new);
    }
}
