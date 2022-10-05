package All_input;
import java.util.Scanner;

public class Inputs {
    public String userName;
    public String passWord;
    public void input(){
        System.out.print("UIU Personality Test\n\n");
        Scanner name = new Scanner(System.in);
        Scanner pass = new Scanner(System.in);
        System.out.print("Your Name => ");
        userName = name.nextLine();
        System.out.print("Your Age => ");
        passWord = pass.nextLine();
    }
}