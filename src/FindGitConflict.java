import java.nio.file.Files;
import java.nio.file.Paths;

public class FindGitConflict {

    public static void main(String... args) throws Exception {

        // we assume that there is conflict in index.html, it works only for first conflict but you can take the idea
        Files.lines(Paths.get("resources/index.html"))
             .dropWhile(l -> !l.contains("<<<<<<<"))
             .skip(1)
             .takeWhile(l -> !l.contains(">>>>>>>"))
             .forEach(System.out::println);

    }



}
