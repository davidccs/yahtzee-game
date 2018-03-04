import java.util.Scanner;

public class sort {
    public static void main (String args[]){
        System.out.println("Enter Your username");
        // creates an instance of the Scanner
        Scanner sc  = new Scanner(System.in);

        String username = sc.nextLine();
        System.out.println(username);

        System.out.println("Enter your age");
        int UserInput = sc.nextInt();
        System.out.println(UserInput);

    }
}
