 import java.util.*;
public class season {
     public static boolean isSpringSeason(int day,int month){
        switch (month){

            case 3:
            return (day >=20 && day<=31);
        case 4:
        case 5:
        return (day >=1 && day <=31);
        case 6:
        return(day >=1 && day <=20);
        default:
        return false;
        }
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day=sc.nextInt();
        if(isSpringSeason(day, month)){
            System.out.println("it's a spring season");

            }
            else{
                System.out.println("not a spring season");
            }
        }
    }


