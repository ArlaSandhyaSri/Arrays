import java.util.*;
import java.io.*;
class SortedRotated{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(checking(arr,n));
    }
    static boolean checking(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return rotate(arr,i+1,n);
            }
        }
        return true;
    }
    static boolean rotate(int arr[],int index,int n){
        for(int i=index;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        if(arr[n-1]>arr[0]){
            return false;
        }
        return true;
    }
}