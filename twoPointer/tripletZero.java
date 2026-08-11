public class tripletZero {
    public static void main(String[] args) {    
        System.out.println(finalResult());
    }
    public static int finalResult(){
        int[] arr = {-1,-1,0,1,2,4};
        int result =0 ;
        for(int i = 0 ; i <arr.length-2 ; i++){
            if (i>0 & arr[i] == arr[i-1])
                continue;
            int left = i+1;
            int right = arr.length-1;

            int sum = -1 *arr[i];
            while (left<right) {
                int s = arr[left] + arr[right];
                if (s == sum){
                    result = s ;
                    left ++;
                    right -- ;
                    while (left<arr.length & arr[left] == arr[left-1]) {
                        left++ ;
                    }
                    while (right>0 & arr[right] == arr[right-1]) {
                        right-- ;
                    }
                }
                else if (s < sum){
                    left ++;
                }
                else {
                    right -- ;
                }
            }

        }
        return result ;
    }
}
