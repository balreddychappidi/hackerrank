import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.editde
    static int minimumSwaps(int[] arr) {
    	int minSwaps = 0;
       for(int i = 0;i<arr.length;i++){
    	   int j = i+1;
    	   if(arr[i] != i+1){
    		   minSwaps++;
    		   for (; j < arr.length; j++) {
			     if(arr[j] == i+1){
			    	 int k = arr[i];
		        	  arr[i] = arr[j];
		        	  arr[j] = k;
			    	  break;
			     }
			 }
    		  
    	   }
    	  
    	   
       }
       return minSwaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            System.out.println("======== "+arrItem);
        }

        int res = minimumSwaps(arr);
        System.out.println("result is ++++++ "+res);

       // bufferedWriter.write(String.valueOf(res));
       // bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
