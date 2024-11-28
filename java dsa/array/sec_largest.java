
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        
        int largest = -1;
        int seclargest = -1;
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                seclargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > seclargest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args){           //ther is alread a main 
        int[] arr = {12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
}

//better code is

// Java program to find the second largest element in an array

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

class Solution {

    public static int getSecondLargest(int[] arr) {
        int n = arr.length;

        // Edge case: If the array has fewer than 2 elements, return -1
        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;      // Update second largest
            }
        }

        // Use a conditional statement to determine the result
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}

