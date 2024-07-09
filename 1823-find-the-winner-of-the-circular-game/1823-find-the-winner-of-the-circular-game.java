class Solution {
    
    public int helper(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        
        return (helper(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) {
        
        return helper(n,k)+1;
        
  
    }
}

//         int[] arr = new int[n];
//         int num_zeroes = 0;
//         // System.out.println("num_zeroes: " + num_zeroes);

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = 1;
//         }

//         if(k==1)
//         {
//             return n;
//         }

//         int c = 0;
//         int i = k-1;
//         // System.out.println("i value before start: "+i);
//     // System.out.println("num_zeroes: " + num_zeroes);
//         while (i < n) {
//             System.out.println("i value before entering the loop: "+i);
//             if (arr[i] == 1) {
//                 // c=0;
//                 arr[i] = 0;
//                 if (num_zeroes == n - 2) {
//                     System.out.println("last element to zero: " + num_zeroes);
//                     return i+1;
//                 }
//                 num_zeroes++;

//             }
//             else if(arr[i]==0)
//             {
//                 while(arr[i]!=0)
//                 {
//                     i++;
//                 }
//                 System.out.println("we encountered i value as 0 so next i is : "+i);
                
//             }
//             i=i+k-num_zeroes -1 ;

//             System.out.println("the updated i value: "+i);

//             if (i >=n) {
//                 i = i-n;
//             } 
//         }

//         return 0;

//     }
// }

// // 1  3   
// // 0  2  
// 1 2 3 4 5 6
// 0 1 2 3 4 5

// // 4 3 5 1 2 0