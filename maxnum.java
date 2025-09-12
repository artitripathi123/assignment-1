 import java.util.*;
public class maxnum {

    public static int  calculateMaxNumber(int n){
        int MaxNumber=(n*(n-1))/2;
        return MaxNumber;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int MaxNumber=calculateMaxNumber(n);
        System.out.println(MaxNumber);
    }
}
