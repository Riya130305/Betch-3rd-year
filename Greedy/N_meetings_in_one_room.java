// import java.util.Comparator;
import java.util.*;
public class N_meetings_in_one_room {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int ans=maxMeetings(start,end);
        System.out.println("ans-->"+ans);
    }
    public static int maxMeetings(int start[], int end[]) {
        // add your code here
        int count=1;
        int n=start.length;
        // tie up start and end array in 2d array for comparision
        int[][] meeting=new int[n][2];
        for(int i=0;i<n;i++)
        {
            meeting[i][0]=start[i];
            meeting[i][1]=end[i];
        }
        // Sort using comparator on the basis of end time
        Arrays.sort(meeting,new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return a[1]-b[1];
            }
            
        });
        
        int lastEnd=meeting[0][1];
        for(int i=1;i<n;i++)
        {
            if(lastEnd<meeting[i][0])
            {
                count++;
                lastEnd=meeting[i][1];
            }
        }
        return count;
    }
}
