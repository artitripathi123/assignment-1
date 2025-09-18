//reverse a aaray
// import java.util.*;
// public class aaraypractice {
//     public static void main(String[]  args){
//         int[] a= {1 ,2,3,4,5};
//         for(int i =0; i < a.length /2;i++ ){
//             int temp =a[i];
//             a[i]= a[a.length -1-i];
//             a[a.length -1 - i] = temp;
//         }
        
//             System.out.println(Arrays.toString(a));
//         }
//     }



//Find the maximum and minimum element in the array
// import java.util.*;
// public class aaraypractice {
//     public static void main(String[]  args){
//         int[] arr = {3 ,5, 1, 8 ,-2};

//         int max = arr[0];
//         int min = arr[0];
//         for(int i= 1;i<arr.length;i++){
//             if (arr[i]>max){
//                 max= arr[i];

//             }
//             if(arr[i]<min){
//                 min= arr[i];
//             }
//         }
//         System.out.println("max = "+max);
//         System.out.println("min ="+min);

//     }
    

// }




//Find the kth minimum and maximum element of an aaray

// import java.util.*;

// public class aaraypractice {

//     public static void main(String[] args) {
//         int[] arr = {7, 10, 4, 3, 20, 15};
//         int k = 3;

      
//         Arrays.sort(arr);

        
//         System.out.println("Sorted Array: " + Arrays.toString(arr));

        
//         int kthMin = arr[k - 1];

//         int kthMax = arr[arr.length - k];

//         System.out.println(k + "rd Min = " + kthMin + ", " + k + "rd Max = " + kthMax);
//     }
// }




// //sort 0s and 1s
// import java.util.Arrays;

// public class aaraypractice{
//     public static void main(String[] args) {
//         int[] arr = {0, 2, 1, 2, 0};

//         int low = 0, mid = 0, high = arr.length - 1;

//         while (mid <= high) {
//             switch (arr[mid]) {
//                 case 0:
                   
//                     int temp0 = arr[low];
//                     arr[low] = arr[mid];
//                     arr[mid] = temp0;
//                     low++;
//                     mid++;
//                     break;
//                 case 1:
//                     mid++;
//                     break;
//                 case 2:
                    
//                     int temp2 = arr[mid];
//                     arr[mid] = arr[high];
//                     arr[high] = temp2;
//                     high--;
//                     break;
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }








//  Move to all negative elements to one side
// import java.util.Arrays;

// public class arraypractice {
//     public static void main(String[] args) {
//         int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

//         int j = 0; 
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < 0) {
                
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }






// import java.util.*;

// public class arraypractice {
//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 4, 5};
//         int[] arr2 = {2, 3, 5, 6};

//         List<Integer> union = new ArrayList<>();
//         List<Integer> intersection = new ArrayList<>();

//         int i = 0, j = 0;

//         while (i < arr1.length && j < arr2.length) {
//             if (arr1[i] < arr2[j]) {
//                 union.add(arr1[i++]);
//             } else if (arr1[i] > arr2[j]) {
//                 union.add(arr2[j++]);
//             } else {
//                 union.add(arr1[i]);
//                 intersection.add(arr1[i]);
//                 i++;
//                 j++;
//             }
//         }

        
//         while (i < arr1.length) union.add(arr1[i++]);
//         while (j < arr2.length) union.add(arr2[j++]);

//         System.out.println("Union = " + union);
//         System.out.println("Intersection = " + intersection);
//     }
// }





 //Cyclically rotate an aaray by one
// import java.util.Arrays;

// public class RotateArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         int n = arr.length;
//         int last = arr[n - 1];  
        
//         for (int i = n - 1; i > 0; i--) {
//             arr[i] = arr[i - 1];
//         }

//         arr[0] = last;  
//         System.out.println(Arrays.toString(arr));
//     }
// }




// public class arrayypractice {
//     public static void main(String[] args) {
//         int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

//         int maxSoFar = arr[0];
//         int currentMax = arr[0];

//         int start = 0, end = 0, tempStart = 0;

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > currentMax + arr[i]) {
//                 currentMax = arr[i];
//                 tempStart = i;
//             } else {
//                 currentMax += arr[i];
//             }

//             if (currentMax > maxSoFar) {
//                 maxSoFar = currentMax;
//                 start = tempStart;
//                 end = i;
//             }
//         }

//         System.out.println("Max Sum = " + maxSoFar);
//         System.out.print("Subarray: [");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + (i < end ? ", " : ""));
//         }
//         System.out.println("]");
//     }
// }

