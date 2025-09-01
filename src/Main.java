import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int validFileCount = 0; // порядковый номер правильных файлов

        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();

            // Определяем, существует ли файл
            File file = new File(path);
            boolean fileExists = file.exists();
            // Определяем, что это именно файл, а не папка
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Указанный путь не существует или ведёт к папке.");
                continue;
            } else {
                validFileCount++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + validFileCount);
            }
        }
    }
}
