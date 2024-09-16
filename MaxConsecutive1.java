import java.util.*;
public class MaxConsecutive1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(checking(arr,n));
    }
    static int checking(int arr[],int n){
        int count=0;
        int max_count=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                max_count=Math.max(max_count,count);
                count=0;
            }
        }
        return Math.max(max_count,count);
    }

    
}
