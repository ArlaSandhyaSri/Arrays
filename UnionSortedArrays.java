import java.util.*;
import java.io.*;
class UnionSortedArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        sorting(arr1,arr2,m,n);

    }
    static void sorting(int arr1[],int arr2[],int m,int n){
        int i=0;
        int j=0;
        ArrayList<Integer> ar=new ArrayList<>();
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                if(ar.isEmpty() || ar.get(ar.size()-1)!=arr1[i]){
                    ar.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(ar.isEmpty() || ar.get(ar.size()-1)!=arr2[j]){
                    ar.add(arr2[j]);
                }
                j++;
            }
            else{
                if(ar.isEmpty() || ar.get(ar.size()-1)!=arr1[i]){
                    ar.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<m){
            if(ar.isEmpty() || ar.get(ar.size()-1)!=arr1[i]){
                ar.add(arr1[i]);
            }
            i++;
        }
        while(j<n){
            if(ar.isEmpty() || ar.get(ar.size()-1)!=arr2[j]){
                ar.add(arr2[j]);
            }
            j++;
        }

        for(int k=0;k<ar.size();k++){
            System.out.print(ar.get(k));
        }

    }
}
