import java.util.*;

public class Program_021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find duplicates using a HashMap
       HashMap<Integer,Integer> frqmap=new HashMap<>();
        for (int num : arr){
            frqmap.put(num,frqmap.getOrDefault(num,0)+1);
        }

        System.out.println("Duplicate numbers in array:");
        for (Map.Entry<Integer,Integer> entry : frqmap.entrySet() ){
            System.out.println(entry.getKey()+" appears("+ entry.getValue()+")");
        }
    }
}
