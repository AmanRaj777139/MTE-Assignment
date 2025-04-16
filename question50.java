/* Question 50 :- Explain the concept of equilibrium index and its applications in array problems. */

//Equilibrium Index: The equilibrium index of an array is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.
// For example, in the array [1, 2, 3, 4, 6], the equilibrium index is 3 because the sum of elements to the left (1 + 2 + 3) is equal to the sum of elements to the right (6).


//Code example
public class question50 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("Equilibrium Index: " + findEquilibriumIndex(arr));
    }

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1; 
    }
}
