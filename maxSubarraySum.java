public class maxSubarraySum {
    public static void main(String[] args) {
        // int ar[] = {5, -4, -3, -2, -1};
        // int n = ar.length;
        // int sum1 = 0;
        // int sum2 = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(ar[k]);
        //             sum1 += ar[k];
        //         }
        //         System.out.print(" || "); 
        //         if(sum1 > sum2){
        //             sum2 = sum1;
        //         }
        //         sum1 = 0;
        //     }
        //    System.out.println(); 
        // }
        // System.out.println("The maximum sum of the subarray is: " + sum2);

        // int ar[] = {-1,-2,-3,4,5};
        // int n = ar.length;
        // int sum1 = 0;
        // int sum2 = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
                
        //             System.out.print(ar[j]);
        //             sum1 += ar[j];

        //               if(sum1 > sum2){
        //                sum2 = sum1;
        //                 }                       
        //     }
        //     //  System.out.print(" || "); 
        //       sum1 = 0;
        //    System.out.println(); 
        // }
        // System.out.println("The maximum sum of the subarray is: " + sum2);

        int ar[] = {-1,-2,-3,-4,-5};
        int sum1 = 0;
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);                        
            sum1 += ar[i];            
            finalSum = Math.max(sum1, finalSum);

            if(sum1 < 0){sum1 = 0;}  
           System.out.println(); 
        }
        System.out.println("The maximum sum of the subarray is: " + finalSum);


    }    
}
