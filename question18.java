/* Question 18 :- Find the maximum XOR of two numbers in an array. Write its algorithm, program.
Find its time and space complexities. Explain with suitable example. */

//XOR: The XOR (exclusive OR) operation is a binary operation that takes two bits and returns 1 if the bits are different, and 0 if they are the same. For example, 5 XOR 3 = 6 because in binary, 5 is 101 and 3 is 011, and their XOR is 110, which is 6 in decimal.

//Algorithm(brute force):
//1. Initialize a variable to store the maximum XOR value found so far, starting at 0.
//2. Iterate through each pair of numbers in the array using two nested loops.
//3. For each pair, calculate the XOR of the two numbers and update the maximum XOR value if the current XOR is greater than the maximum found so far.
//4. Return the maximum XOR value found.

public class question18 {
    public static int findMaximumXOR(int[] nums) {
        int xor=0;
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                xor = Math.max(xor , nums[i] ^ nums[j]);
            }
        }
        return xor;
    }
    public static void main(String[] args) {
        int []nums={3,10,5,25,2,8};
        System.out.println(findMaximumXOR(nums));
    }
}

//Time Complexity: O(n^2) - The algorithm uses two nested loops to iterate through all pairs of numbers in the array, resulting in a quadratic time complexity.
//Space Complexity: O(1) - The algorithm uses a constant amount of space for the variables used to store the maximum XOR value and the loop indices