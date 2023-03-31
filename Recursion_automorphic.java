package recursion_automorphic;
import java.util.*;
public class Recursion_automorphic {

    boolean isAutomorphic(int n, int pro){
        
        if(n%10 == pro%10){
            
            if(n==0){
                return true;
            }
            n = n/10;
            pro = pro/10;
            return isAutomorphic(n, pro);
        }
       
        else{
            
                return false;
            }
       
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Recursion_automorphic ob = new Recursion_automorphic();
    System.out.println("Enter a positive number: ");
    int a = sc.nextInt();
    int p = a*a;
    boolean ans = ob.isAutomorphic(a,p);
    if(ans = true)
        System.out.println("It is Automorphic");
    else
        System.out.println("It is not Automorphic");

    
    }
    
}
