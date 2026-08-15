import java.util.*;

public class Pattern5 {

    
     /* Print the Pattern 

     HALF NUMBER PYRAMID :-

     1
     1 2
     1 2 3
     1 2 3 4 
     1 2 3 4 5       
     */

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        for(int row = 0 ; row < n ; row++){
            for(int column = 0 ; column <= row ; column++){
                System.out.print( column+1+" ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
