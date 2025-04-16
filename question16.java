/* Question 16 :- Find the majority element in an array that appears more than n/2 times. Write its
algorithm, program. Find its time and space complexities. Explain with suitable
example. */

//Algorithm:
// 1. Take two counters which will be used to count the occurrences of the current element and the majority element.
//2. Iterate through the array and for each element, check if the count is zero. If it is, set the current element as the majority element and increment the count.
//3. If the current element is equal to the majority element, increment the count. Otherwise, decrement the count.

public class question16 {
    public static  int majorityElement(int[] nums) {
        int count=0;
        int count2=0;
        for( int num : nums){
            if(count==0){
                count2=num;
            }
            if(num == count2){
                count++;
            }else{
                count--;
            }
        }
        return count2;
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,4,4,3,2,2,0,1};
        System.out.println(majorityElement(arr));
    }
}

//Time Complexity: O(n) - The algorithm iterates through the array once, making it linear in time complexity.
//Space Complexity: O(1) - The algorithm uses a constant amount of space.