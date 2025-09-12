import java.util.*;

public class practic {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int p =sc.nextInt();
        int r =sc.nextInt();
        int t =sc.nextInt();
        int SI=(p*r*t)/100;
        System.out.println(SI);


    }
    
}

import java.util.*;
public class practic {
    public static int SI ( int P ,int R, int T ){
        int SI= (P*R*T)/100;
        return SI;


    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int P= sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        int SI =SI(P,R,T);
        System.out.println(SI);
    }

}

import java.util.*;
public class practic {
    public static int numberofstudent(int n){
        int numberofstudent =(n*(n-1))/2;
        return numberofstudent;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int numberofstudent = numberofstudent(n);
        System.out.println(numberofstudent);


    }
    }

import java.util.*;
public class practic {
    public static int perimeter(int a, int b, int c){
        int perimeter = (a+b+c);
        return perimeter;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int perimeter = perimeter(a,b,c);
        System.out.println(perimeter);


    }
}


