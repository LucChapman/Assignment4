import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String input;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        input = scanner.nextLine();

        for(int i = input.length() - 1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
        
        scanner.close();
    }
}
