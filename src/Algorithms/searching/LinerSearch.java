package Algorithms.searching;

public class LinerSearch {
    /*

procedure linerSearch(A:List of elements,T: Target Element)
    for i from 0 to n-1
        if A[i] is equals to target than
            return i
        end if
    end for
    return -1
end procedure

Time Complexity O(n)

 */
    public static void main(String[] args) {

        int nums[] ={5,6,7,8,9};
        int target =6;

        int result = linerSearch(nums,target);

        if(result!=-1) {
            System.out.println("Element found at Index : " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }

    public static int linerSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
