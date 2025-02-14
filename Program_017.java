import java.util.Scanner;

/*
    Write a program to create an array of 10 integers. Accept values from the user in that
    array. Input another number from the user and find out how many numbers are equal to the number
    passed, how many are greater and how many are less than the number passed
 */
public class Program_017 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int SIZE=10;
        int num;
        int numberOfEqual=0,numberOfGreater=0,numberOfLess=0;
        int[] arr=new int[SIZE];

        System.out.print("Enter element of this array:");
        for(int i=0;i<SIZE;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter target number:");
        num=sc.nextInt();

        for(int i=0;i<SIZE;i++){
            if(num==arr[i]){
                numberOfEqual++;
            } else if (num>arr[i]) {
                numberOfLess++;
            }else{
                numberOfGreater++;
            }
        }

        System.out.print(num+" Number of equal="+numberOfEqual+".\nNumber of grater="+numberOfGreater+".\nNumber of lesser="+numberOfLess);

    }
}
