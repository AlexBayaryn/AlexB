package task1;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class UtilClass {
    public static Directory getDirectory(Scanner scanner, PrintStream out) {
        out.print("Введите имя дериктории: ");
        String nameDirectory = "data/" + scanner.next();
        Directory directory = new Directory(nameDirectory);
        return directory;
    }

    public static File getFile(Scanner scanner, PrintStream out) {
        out.print("Введите имя файла: ");
        String nameFile = scanner.next() + ".txt";
        File file = new File(nameFile);
        return file;
    }

    public static TxtFile textFile2(Scanner scanner, PrintStream out) throws IOException {
        TxtFile txtFile = new TxtFile(getDirectory(scanner, out), getFile(scanner, out));
        return txtFile;
    }
}
