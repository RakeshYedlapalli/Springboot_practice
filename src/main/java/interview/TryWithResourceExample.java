package interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/yadlapallirakesh/Documents/rakesh-yedlapalli-git-workspace/Spring-boot/SpringBootPracticeworkspace/Springboot_practice/src/main/java/interview/file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Exception handling
            e.printStackTrace();
        }
    }
}

