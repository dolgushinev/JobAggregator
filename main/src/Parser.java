import java.io.File;
import java.util.List;

public interface Parser {
    boolean load(int months);

    boolean process(List<String> keywords);

    boolean save();
}