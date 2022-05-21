import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.Arrays;


public class lab3 {

    public static void main(String... args) {

        String text = readFile("input.html");
        Pattern pattern = Pattern.compile("\\b([a-z0-9._-]+@[a-z0-9.-]+)\\b");

        Matcher match = pattern.matcher(text);
        List <String> email = new ArrayList<String>();
        while (match.find()) {
            int start=match.start();
            int end=match.end();
            email.add(text.substring(start,end));
            System.out.println(text.substring(start,end));
        }


        writeHtml(email, "output.txt");
    }

    public static String readFile(String emailPath) {
        try (FileReader reader = new FileReader(emailPath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String text = "";
            while(bufferedReader.ready()) {
                text = text.concat(bufferedReader.readLine());
            }
            return text;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeHtml(List emailPath, String htmlPath) {
        try (FileWriter writer = new FileWriter(htmlPath);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(String.valueOf(emailPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}