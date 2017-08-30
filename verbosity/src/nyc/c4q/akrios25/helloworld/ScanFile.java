package nyc.c4q.akrios25.helloworld;


import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ScanFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("/Users/c4q/IdeaProjects/verbosity/resources/Dickens.txt" )));
            while (scanner.hasNext()) {
                    /*count # of sentences... */
                System.out.println(scanner.next());
            }
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("/Users/c4q/IdeaProjects/verbosity/resources/Melville.txt")));
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
                System.out.println(count);
            }
        }
        finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
