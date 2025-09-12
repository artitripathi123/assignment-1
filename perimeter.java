 import java.util.*;
public class perimeter {
    public static int calculateRounds(int a,int b,int c){
        int Rounds=(a+b+c);
    return Rounds ;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int Rounds=calculateRounds(a, b, c);
        System.out.println(Rounds);
    }
}
