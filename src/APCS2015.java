/**
 * Created by Dave on 5/1/17.
 */

// I wrote this code for my hero sam boardman

public class APCS2015 {

    public static void main(String[] args) {
        start();
    }

    // PROBLEM # 26
    public static void changeIt(int [] arr, int val, String word) {

        System.out.print("Arr before: ");

        for (int i: arr) {
            System.out.println(i);
        }

        arr = new int[5];
        // what happened to arr ^^^ ?
        System.out.print("Arr after: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // formatting

        System.out.println("Value before it was redeclared: " + val);

        val = 0; // same thing happened to value

        System.out.println("Value after it was redeclared: " + val);


        word = word.substring(0, 5); // same thing again

        for (int k = 0; k < arr.length; k++) {
            arr[k] = 0;
        }

    }

    public static void start() {
        int[] nums = {1, 2, 3, 4, 5};
        int value = 6;
        String name = "Blackboard";

        changeIt(nums, value, name); // does this change anything?

        for (int k = 0; k < nums.length; k++){
            System.out.print(nums[k] + " ");
        }

        System.out.print(value + " ");
        System.out.print(name);
    }
}
