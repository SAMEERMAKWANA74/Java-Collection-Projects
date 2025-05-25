import java.util.Scanner;
import java.util.Stack;

public class CopyStackfromStack {
    public static void main(String[] args) {
        Stack<Integer> St = new Stack<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Numbers of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for(int x=1;x<=n;x++) {
            int m= sc.nextInt();
            St.push(m);
        }
        System.out.println(St);

        //  use a one stack as storage to store data of first stack

        Stack<Integer> StoreSt = new Stack<>();
        while(St.size()>0)
        {
            StoreSt.push(St.pop());
        }
        // System.out.println(StoreSt);       for understanding i have print it .


        // this is stack, which is copy of your original stack
        Stack<Integer> CpSt = new Stack<>();
        while (StoreSt.size()>0)
        {
            CpSt.push(StoreSt.pop());
        }
        System.out.println(CpSt);
    }

}