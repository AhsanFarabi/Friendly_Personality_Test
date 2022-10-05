import All_input.Inputs;
import All_input.Questions;

import java.util.Scanner;

class players{
    public int i=0;
}
class player extends players{
    public void insertInfo(){
        System.out.print("Played: " + ++i + " times\n");
    }
}
class result{

    public void printInfo(String name){
        System.out.println("Player Name: "+ name + "\n");
    }
    public void printInfo(int ans[]){
        if (ans[0] == 1 && ans[1] == 1 && ans[2]== 1 && ans[3]== 1 && ans[4]==1) {
            System.out.println("You are a romantic guy");

        } else if(ans[0]==2) {
            System.out.println("You are a poor superhero");
        }
        else if(ans[3]==1 && ans[4]==2) {
            System.out.println("You are a positive man");
        }
        else {
            System.out.println("You are a good man");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Object
        for(;;) {
            Inputs in = new Inputs();
            Questions Q = new Questions();
            result R = new result();
            player P = new player();
            in.input();
            System.out.println("Let's answer thses questions\n\n");
            Q.question();
            R.printInfo(in.userName);
            R.printInfo(Q.ans);
            P.insertInfo();
            Scanner next = new Scanner(System.in);
            System.out.println("Enter any key to test again");
            int Con = next.nextInt();
        }

    }
}



