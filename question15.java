/* Question 15 :- Find the k-th smallest element in a sorted matrix. Write its algorithm, program. Find its
time and space complexities. Explain with suitable example.
 */

//Algorithm: 
//1. Create an empty list to store the elements of the matrix.
//2. Iterate through each row and column of the matrix, adding each element to the list.
//3. Sort the list.
//4. Return the k-1th smallest element from the sorted list.
import java.util.*;
public class question15 {
    public static int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res.add(matrix[i][j]);
            }
        }
        Collections.sort(res);
        return res.get(k-1);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 2;
        int result = kthSmallest(matrix, k);
        System.out.println(result);
    }
}

//TimeComplexity : O(n^2log(n^2)) - The algorithm iterates through the matrix to collect elements, which takes O(n^2) time, and then sorts the list of elements, which takes O(n^2log(n^2)) time.

//SpaceComplexity : O(n^2) - The algorithm uses additional space to store the elements of the matrix in a list, which takes O(n^2) space.