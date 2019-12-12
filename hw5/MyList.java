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

    public long getMax(@NotNull List<T> list) {
        return list
                .stream()
                .mapToLong(Number::longValue)
                .max().orElseThrow(NoSuchElementException::new);
    }

    public long getMin(@NotNull List<T> list) {
        return list
                .stream()
                .mapToLong(Number::longValue)
                .min().orElseThrow(NoSuchElementException::new);
    }
}
