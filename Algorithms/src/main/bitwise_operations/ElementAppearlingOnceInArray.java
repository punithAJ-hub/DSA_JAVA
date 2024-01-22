
/** We know that a XOR a = 0 so we can apply it to array and xor all elements the remaining result will be the element that appears only once **/

public class ElementAppearlingOnceInArray {
    public static void main(String[] args) {

        int[] nums = {1,2,1,3,4,2,4,3,5,6,6}; // ans 5 : it appears only once
        int ans=0;
        for(int num : nums){
            ans=ans^num;
        }
        System.out.println(ans);
    }
}
