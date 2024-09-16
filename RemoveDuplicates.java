import java.util.*;
class RemoveDuplicates{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(check(arr,n));
    }
    static int check(int arr[],int n){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i+1;

    }
}
