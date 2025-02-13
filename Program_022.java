import java.util.Scanner;

public class Program_022 {
    public static void main(String[] args){
        int m,n;
        Scanner sc=new Scanner(System.in);
        int[] firstArray=new int[10];
        int[] secondArray=new int[10];
        //Array Size
        System.out.println("Enter first array size:");
        m=sc.nextInt();
        System.out.println("Enter second second array size:");
        n=sc.nextInt();

        //Take array element
        System.out.println("Enter element of first array:");
        for(int i=0;i<m;i++){
            System.out.print("Enter "+i+" element:");
            firstArray[i]=sc.nextInt();
        }
        System.out.println("Enter element of second array:");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" element:");
            secondArray[i]=sc.nextInt();
        }

        //Display array
        System.out.print("First array element:");
        for(int i=0;i<m;i++){
            System.out.print(firstArray[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Second array element:");
        for(int i=0;i<n;i++){
            System.out.print(secondArray[i]+" ");
        }

        //merge two sorted arrays

        int i=0,j=0,k=0;
        int[] mergedArray=new int[m+n];

        while(i<m && j<n){
            if(firstArray[i]<secondArray[j]){
                mergedArray[k]=firstArray[i];
                i++;
            }else{
                mergedArray[k]=secondArray[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mergedArray[k]=firstArray[i];
            i++;
            k++;
        }
        while(j<n){
            mergedArray[k]=secondArray[j];
            j++;
            k++;
        }

        //Display the merged array
        System.out.print("Merged array: ");
        for(int l=0;l<k;l++){
            System.out.print(mergedArray[l]+" ");
        }

    }
}
