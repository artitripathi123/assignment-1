 import java.util.*;

public class simpleinterest {
    public static int calculateSimpleInterest(int P,int R,int T){
        int SimpleInterest=(P*R*T)/100;
        return SimpleInterest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int R=sc.nextInt();
        int T=sc.nextInt();

        int SimpleInterest=calculateSimpleInterest(P, R, T);
        System.out.println(SimpleInterest);
        
    }
    
}


