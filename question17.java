/* Question 17 :- Calculate how much water can be trapped between the bars of a histogram. Write its
algorithm, program. Find its time and space complexities. Explain with suitable
example */

//In this problem, we are given an array of integers representing the height of bars in a histogram. We need to calculate how much water can be trapped between the bars after raining.

//Algorithm:
//1. We will apply two pointers approach, left and right, at the beginning and end of the array respectively.
////2. We will maintain two variables, lMax and rMax, to keep track of the maximum height of bars from the left and right sides respectively.
//3. We will also maintain a variable total to keep track of the total amount of water trapped.
//4. We will iterate through the array until the left pointer is less than the right pointer.
//5. In each iteration, we will compare the heights at the left and right pointers.
//6. If the height at the left pointer is less than or equal to the height at the right pointer, we will check if lMax is greater than the height at the left pointer. If it is, we will add the difference to total. Otherwise, we will update lMax with the height at the left pointer. Finally, we will move the left pointer to the right by one position.
//7. If the height at the right pointer is less than the height at the left pointer, we will check if rMax is greater than the height at the right pointer. If it is, we will add the difference to total. Otherwise, we will update rMax with the height at the right pointer. Finally, we will move the right pointer to the left by one position.
//8. We will continue this process until the left pointer is less than the right pointer.
//9. Finally, we will return the total amount of water trapped.


public class question17 {
    public static int trap(int[] height) {
        int n= height.length;
        int lMax =0;
        int rMax= 0; 
        int total =0;
        int l=0;
        int r =n-1;
        while(l<r){
            if(height[l] <= height[r]){
                if(lMax > height[l]){
                    total += lMax - height[l];
                }else{
                    lMax = height[l];
                }
                l = l+1;
            }
            else{
                if(rMax > height[r]){
                    total += rMax-height[r];
                }
                else rMax = height[r];
                r = r-1;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}

//Time Complexity: O(n) - The algorithm iterates through the array once, making it linear in time complexity.
//Space Complexity: O(1) - The algorithm uses a constant amount of space for the pointers and temporary variables.