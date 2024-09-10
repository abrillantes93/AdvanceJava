public class dominioSwap {
    //2,1,2,4,2,2 ; 5,2,6,2,3,2
    public static void main(String[] args) {
        //check if A[] is same - 0
        //not possible to make one row of values - -1
        int A[] = {5,2,2,2,3,2,2};
        int B[] = {2,1,6,4,2,2,3};
     
        int countA = 0;
        int i = 0;
        int j = 1;
        int swapValue = 999;
        //min swap to make everything on a equal 
        
        while (i < A.length){
            while(j < A.length){
                if (A[i] != A[j] && A[i] == B[j]|| B[i] == A[j]){
                   countA++;
                   swapValue = A[j];
                                       
                }
                

                j++;

            }
            if (swapValue == 999){
                i++;
            }
            else{ 
                break;
            }
        }
        // i = 0;
        // j = 1;
        // int countB = 0;
        // int A[] = {2,1,1,4,2,2,3};
        // int B[] = {5,2,2,2,3,2,2};
        // swap and compare
        // while (i < A.length){
        //     while(j < A.length){
        //         if (B[i] != B[j] && B[i] == A[j] || A[i] == B[j]){
        //            countB++;
        //         }

        //         j++;

        //     }
        //     break;
        // }
        // int count = 0;
        // //replace if else
        // count = countA < countB ? countA : countB;
        // System.out.println(countA);
        // System.out.println(countB);
        if (countA == 0){
            System.out.println("-1");
        }
        else{
            System.out.println(countA);
        }
    }
}
