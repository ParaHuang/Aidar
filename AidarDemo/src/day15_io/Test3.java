package day15_io;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Files.lines(Path.of("testdata.txt"))
                .forEach(System.out::println);
    }
}
