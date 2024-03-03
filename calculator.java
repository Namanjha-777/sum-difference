import java.util.*;
class calculator{
    static int add(int a,int b){
        return a+b;
    }
    static int diff(int p,int q){
        return p-q;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int c=sc.nextInt();
        System.out.println("enter second number");
        int d=sc.nextInt();
        int sum=add(c,d);
        System.out.println("Sum of numbers ="+sum);
         int diff=diff(c,d);
        System.out.println("Difference of numbers ="+diff);
    }
}