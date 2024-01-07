import java.util.*;

class reversedStringPelindrom
{
     public String reverseStringPelindrom(String input) {
        
        char[] charArray = input.toCharArray();
        
       
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        
        return new String(charArray);
    }
}

public class Program31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String reversedString = reverseStringPelindrom(inputString);

       
        System.out.println("Reversed string: " + reversedString);
    }

    // Method to reverse a string
   
}
