package chap19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryToStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("list() 메서드를 이용하여 스트림 생성하기");
		Path path = Paths.get("src");
		Stream<Path> sr1 = Files.list(path);
		sr1.forEach( p -> System.out.println(p.getFileName()) );
	
		System.out.println("find() 메서드를 이용하여 스트림 생성하기");
        Stream<Path> sr2 = Files.find(path, 100,
                        (p, basicFileAttributes) -> {
                            File file = p.toFile();
                            return !file.isDirectory() &&
                                    file.getName().contains("Stream");
                        });
		sr2.forEach( p -> System.out.println(p.getFileName()) );
	}
}
