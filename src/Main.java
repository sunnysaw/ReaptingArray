import java.util.Scanner;
/*
In this section we will see how to find any repeating number in array :
________________________________________________________________________
Question : Given an array 'a' consisting of integer. Return the first value that is repeating in
           array in no value is repeating return ans = -1
 */
public class Main {
    static int triplet(int arr[]){
        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i +1; j < arr.length;j++){
                if (arr[i] == arr[j]){
                    ans = arr[i];
                }
                else {
                    ans = -1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First enter the length of array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value you want to put in array : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("printing the value of array : " + arr[i]);
        }
        System.out.println("Printing the first value which is repeating in array : " + triplet(arr));
    }
}