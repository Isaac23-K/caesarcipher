import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    boolean theAppIsRunning = true;
    while (theAppIsRunning){
        // user to pick option
        Scanner option = new Scanner(System.in);
        System.out.println("Welcome to Ceaser Cipher App : Encode , Decode or Leave");


        String choice = option.nextLine();

        // enter text
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word ");
        String plainText = input.nextLine();
        System.out.println("Original plain text : " + plainText);

        // enter shift key or number
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Your shift key is : " );
        int key = Integer.parseInt(inputKey.nextLine());
        System.out.println("Your shift key is : " + key );

    }
    }
}
