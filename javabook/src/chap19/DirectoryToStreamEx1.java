package chap19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryToStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("list() �޼��带 �̿��Ͽ� ��Ʈ�� �����ϱ�");
		Path path = Paths.get("src");
		Stream<Path> sr1 = Files.list(path);
		sr1.forEach( p -> System.out.println(p.getFileName()) );
	
		System.out.println("find() �޼��带 �̿��Ͽ� ��Ʈ�� �����ϱ�");
        Stream<Path> sr2 = Files.find(path, 100,
                        (p, basicFileAttributes) -> {
                            File file = p.toFile();
                            return !file.isDirectory() &&
                                    file.getName().contains("Stream");
                        });
		sr2.forEach( p -> System.out.println(p.getFileName()) );
	}
}
