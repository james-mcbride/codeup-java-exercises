import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.Files.createFile;

public class FileIOLesson {


    public static void main(String[] args) throws IOException, IOException {
        Path dataDirectory = Paths.get("languages.text");
        if (! Files.exists(dataDirectory)) {
            Files.createFile(dataDirectory);
        }
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Javascript");
        languages.add("Java");
        Files.write(dataDirectory, languages);


    }
}
