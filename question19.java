/* Question 19 :- How to find the maximum product subarray. Write its algorithm, program. Find its time
and space complexities. Explain with suitable example.
 */

 //You are given an integer array nums. You need to find the contiguous subarray within an array (containing at least one number) which has the largest product, and return the product.
 
 //Algorithm: 
 //1. Initialize a variable maxi to store the maximum product found so far, and a variable product to store the current product.
 //2. Iterate through the array from left to right, multiplying the current element with the product. If the product becomes zero, reset it to 1.
 //3. Update the maxi variable with the maximum of the current product and maxi.
//4. Repeat the process from right to left to account for negative numbers that may affect the product.
//5. Return the maximum product found.

public class question19 {
    public static int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int product=1;
        for (int j = 0; j <= nums.length - 1; j++) {
            product *= nums[j];
            maxi = Math.max(product, maxi);
            if(product==0){
                product=1;
            }
        }
        product=1;
        for(int j=nums.length-1;j>=0;j--){
            product *=nums[j];
            maxi = Math.max(product, maxi);
            if(product==0){
                product=1;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int []nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}

//Time Complexity: O(n) - The algorithm iterates through the array a constant number of times.
//Space Complexity: O(1) - The algorithm uses a constant amount of space for the variables.