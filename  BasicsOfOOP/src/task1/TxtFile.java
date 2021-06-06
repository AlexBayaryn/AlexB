package task1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TxtFile {
    private Directory directory;
    private File file;
    java.io.File newFile;
    String stringValue;

    public TxtFile() {
    }

    public TxtFile(Directory directory, File file) throws IOException {
        this.directory = directory;
        dirСreate();
        this.file = file;
        fileСreate();

    }

    private void dirСreate() {
        java.io.File dir = new java.io.File(directory.getDirectoryName());
        dir.mkdirs();
    }

    private void fileСreate() throws IOException {
        java.io.File file = new java.io.File(directory.getDirectoryName() + java.io.File.separator + this.file.getNameFile());
        file.createNewFile();
    }

    public void create(Scanner scanner, PrintStream out) throws IOException {
        directory = UtilClass.getDirectory(scanner, out);
        java.io.File dir = new java.io.File(directory.getDirectoryName());
        dir.mkdirs();
        file = UtilClass.getFile(scanner, out);
        newFile = new java.io.File(dir + java.io.File.separator + this.file.getNameFile());
        newFile.createNewFile();
    }

    public void rename(String newName) {
        if (newName.contains(".txt")) {
            file.setNameFile(newName);
            newFile.renameTo(new java.io.File(newFile.getParent() + java.io.File.separator + this.file.getNameFile()));
        } else {
            System.out.println("Неверный ввод!!!");
        }
    }

    public void addText(String text) {
        try (FileWriter fileWriter = new FileWriter(directory.getDirectoryName() + java.io.File.separator + file.getNameFile())) {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showСontent() throws IOException {
        java.io.File file = new java.io.File(String.join(java.io.File.separator, directory.getDirectoryName()), this.file.getNameFile());
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            stringValue = new String(bytes);
        }
    }

    public void deleted() {
        newFile.delete();
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
