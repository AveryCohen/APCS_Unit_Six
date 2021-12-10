import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker
{

    public static String[] getDictionary() throws IOException
    {
        String [] arr = new String[61336];
        Scanner scan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (scan.hasNext())
        {
            arr[count] = scan.next();
            count++;
        }
        return arr;
    }
        public static int wordInDictionary(String word, String [] dictionary)
        {
            int min = 0;
            int max = dictionary.length - 1;
            while (min <= max)
            {
                int mid = (min + max) / 2;
                if (dictionary[mid].compareToIgnoreCase(word) == 0)
                    return 0;
                else if (dictionary[mid].compareToIgnoreCase(word) > 0)
                    max = mid - 1;
                else
                    min = mid + 1;
            }
            return -1;
        }
    public static void main(String [] args) throws IOException
    {
        String[] arr = getDictionary();
        String currentWord;
        Scanner mainScan = new Scanner(System.in);
        Scanner scanAlice = new Scanner(new File("files/alice.txt"));
        FileWriter newAlice = new FileWriter("files/corrected.txt");
        while (scanAlice.hasNext())
        {
            currentWord = scanAlice.next();
            if (wordInDictionary(currentWord, arr) == -1)
            {
                System.out.println("The word: " + currentWord + " may be spelled incorrectly, would you like to change it? Please type y or n");
                String answer = mainScan.nextLine();
                if (answer.equals("y"))
                {
                    System.out.println("Please enter in the correct spelling: ");
                    newAlice.write(mainScan.nextLine() + " ");
                }
                else
                {
                    newAlice.write(currentWord + " ");
                }
            }
            else
            {
                newAlice.write(currentWord + " ");
            }
        }
        newAlice.close();
    }
}
