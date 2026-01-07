public class Merge2sortArr {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6,8,10};

        int[] newarr = new int[arr1.length+arr2.length] ;
        int i = 0 ;
        int j = 0 ;
        int id = 0 ;

        while (i<arr1.length && j<arr2.length) { 
            if (arr1[i]<arr2[j]) {
                newarr[id]=arr1[i];
                id++;
                i++;
            }
            else{
                newarr[id]=arr2[j];
                id++;
                j++;
            }
        }
        while (i<arr1.length) {
            newarr[id]=arr1[i];
            id++;
            i++;
        }
        while (j<arr2.length) {
            newarr[id]=arr2[j];
            id++;
            j++;
        }

        for(i = 0 ; i < newarr.length ; i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
