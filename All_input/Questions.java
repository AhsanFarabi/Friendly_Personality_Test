package All_input;
import java.util.Scanner;
public class Questions {
    public int[] ans = {0,0,0,0,0};
    String[] AllQ = {
            "What is your favourite movie?\n(1)Titanic (2)Avengers",
            "What is your favourite dish?\n(1)Burger (2)Noodles",
            "Do you talk to yourself?\n(1)Yes (2)No",
            "Everything happens for a reason. Do you agree?\n(1)Yes (2)No",
            "How you define life?\n(1)Life is hard (2)Life is simple"
    };
    public void question() {
        for(int i=0; i<5; i++) {
            System.out.println(AllQ[i]);
            System.out.print("Your Answer (1/2): ");
            Scanner q = new Scanner(System.in);
            ans[i] = q.nextInt();
        }

    }
}
