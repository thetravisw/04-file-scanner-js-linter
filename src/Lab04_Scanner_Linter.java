import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab04_Scanner_Linter {
    public static void main(String[] args) {
        String filename = "C:\\Users\\H_K_K\\codefellows\\401\\04-file-scanner-js-linter\\gates.js";
        File file = new File(filename);

        int linecount=1;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                //Applying a bunch of conditionals, to see if the line should be linted
                if (!line.isEmpty() && !line.contains("while") && !line.contains("do") && !line.contains("else") && !line.contains("if") &&!line.endsWith("{") && !line.endsWith("}")&& !line.endsWith(";")) {
                    System.out.println("Line " + linecount + ": Missing semicolon.");
                }

                linecount++;
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }
}