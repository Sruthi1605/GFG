//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int n){
      
        if (n <= 1) return 0;
        if (n == 2) return 1;
        if (n % 2 == 0) return 0;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return 0;
        }

        return 1;
    }

}