import java.util.Arrays;
import java.util.Scanner;

//Write a java program to input 10 integers into an array and find the second
//minimum and second maximum number.
public class Program_020 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array:");
        n= scanner.nextInt();
        //Create an array
        int[] arr=new int[n];

        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" element:");
            arr[i]=scanner.nextInt();
        }
        //Array sorting
        Arrays.sort(arr);

        for (int num:arr){
            System.out.print(num+"  ");
        }
        System.out.println(" ");
        //print the second minimum
        System.out.println("Second minimum:"+arr[1]);
        System.out.println("Second maximum:"+arr[arr.length-2]);

    }
}
