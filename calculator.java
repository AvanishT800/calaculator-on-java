import java.util.*;
public class Calculator {

public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter operation");
    int operation= sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    switch (operation){
        case 1: System.out.println(a+b);
        break;
        case 2:System.out.println(a-b);
        break;
        case 3:System.out.println(a*b);
        break;
        case 4: System.out.println(a/b);
        break;
        case 5:System.out.println(a%b);


    }
}
}
