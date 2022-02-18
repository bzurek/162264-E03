package Z3;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad3 {
    public static List<String> filesWithoutExactExtension(String dir, String extension){
        return Stream.of(new File(dir).list()).filter(file -> !file.contains(extension)).collect(Collectors.toList());
    }
    public static void main(String[] args){
        String pathToDir = "C:\\";
        List<String> files = filesWithoutExactExtension(pathToDir,".txt");
        System.out.println(files);
    }
}
