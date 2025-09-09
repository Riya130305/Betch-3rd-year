package Recursion;
import java.io.*;
import java.util.*;
class AddElement {
    
    
    public static  void print1_N (int N, ArrayList<Integer> res){
        
        if(N>=1)
        {
            // print then call to print reverse
            // res.add(N);
            // print1_N(N-1,res);
            print1_N(N-1,res);
            res.add(N);//Backtreck here first go till last the pop out the element form the stack 
        }
    }
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine().trim());
            
            ArrayList<Integer> res = new ArrayList<>();
			print1_N(n,res);
			
			
			for(Integer i: res){
			    System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
