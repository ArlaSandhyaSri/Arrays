import java.util.*;
import java.io.*;
public class RotateArrayRight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotateArray(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotateArray(int arr[],int n,int k){
        rotate(arr,n,0,n-1);
        rotate(arr,n,0,k-1);
        rotate(arr,n,k,n-1);
    }
    static void rotate(int arr[],int n,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}
