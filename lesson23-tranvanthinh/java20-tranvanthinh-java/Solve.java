import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Solve {
    public static void main(String[] args) {
        try {
            List<Integer> numbersList = Files.lines(Paths.get("D:\\BecomeJavaDev\\java19\\5. Frontend\\lesson23-tranvanthinh\\java\\input.txt"))
                    .skip(1) 
                    .flatMap(line -> extractNumbers(line))
                    .sorted()
                    .collect(Collectors.toList());

            Files.write(Paths.get("D:\\BecomeJavaDev\\java19\\5. Frontend\\lesson23-tranvanthinh\\java\\output.txt"), 
                         numbersList.stream()
                                    .map(String::valueOf) 
                                    .collect(Collectors.toList())); 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Stream<Integer> extractNumbers(String line) {
        return Arrays.stream(line.split("\\D+"))
                     .filter(s -> !s.isEmpty())
                     .map(Integer::parseInt);
    }
}
