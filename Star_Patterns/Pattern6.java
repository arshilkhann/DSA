import java.util.*;
public class Pattern6 {

    /* Print the Pattern 

    INVERTED HALF NUMBER PYRAMID :-

     1 2 3 4 5
     1 2 3 4
     1 2 3
     1 2 
     1        
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for(int row = n ; row >= 0 ; row--){
            for(int column = 0 ; column < row ; column++){
                System.out.print(column+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
