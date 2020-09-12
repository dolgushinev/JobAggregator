import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vacancy {
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getcDate() {
        return cDate;
    }

    public String getUrl() {
        return url;
    }

    public boolean containsKeyword(String[] keywords)
    {

        for (String keyword:keywords) {
            Pattern pattern = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(getDescription());
            if(matcher.find()) return true;
        }

        return false;
    }

    private LocalDateTime cDate;
    private String url; //подумать над типом данных URL

    public Vacancy(String title, String description, LocalDateTime cDate, String url) {
        this.title = title;
        this.description = description;
        this.cDate = cDate;
        this.url = url;
    }
}
