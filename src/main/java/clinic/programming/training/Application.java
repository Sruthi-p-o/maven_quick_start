package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public Application() {
        System.out.println("Application Constructor Called");
    }

    public int countWords(String input) {
        if (StringUtils.isBlank(input)) {
            return 0;
        }
        return input.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Application app = new Application();
        int wordCount = app.countWords("This is a test sentence");
        System.out.println("Word Count: " + wordCount);
    }
}
