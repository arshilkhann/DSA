import java.util.*;
public class Pattern7 {
    /*
Pattern star pyramid 
         * 
       * * * 
     * * * * *
   * * * * * * *
 * * * * * * * * *
    */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0 ; row < n ; row++){
            for(int column = 0 ; column < n-row+1 ; column++){
                System.out.print(" ");
            }

            for(int star = 0 ; star < 2*row+1 ; star++){
                System.out.print("*");
            }

            for(int column = 0 ; column < n-row+1 ; column++){
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
