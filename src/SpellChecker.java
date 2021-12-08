import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker {

    public static String[] read() throws IOException {
        String [] arr = new String[61336];
        Scanner scan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (scan.hasNext()) {
            arr[count] = scan.next();
            count++;
        }

        return arr;
    }

        public static int search(String[] arr, String word) {
            int min = 0;
            int max = arr.length - 1;
            while (min <= max) {
                int mid = (min + max) / 2;
                if (arr[mid].compareTo(word) == 0)
                    return mid;
                else if (arr[mid].compareTo(word) > 0)
                    max = mid + 1;
                else
                    min = mid - 1;
            }
            return -1;
        }
    public static void main(String [] args) throws IOException {
        String[] arr = read();
    }


}
