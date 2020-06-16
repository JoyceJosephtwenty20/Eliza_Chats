import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What is your name?");
        String name = sc.nextLine();
        System.out.println("Nice to meet your, " + name + ", How has your day been?");
        String userMessage = sc.nextLine();
        System.out.printf("Okay, Anything in particular that makes you feel that " + userMessage + " ? \n") ;
        sc.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");



    }
}
