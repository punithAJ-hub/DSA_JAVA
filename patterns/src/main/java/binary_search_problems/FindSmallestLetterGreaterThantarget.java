package binary_search_problems;

public class FindSmallestLetterGreaterThantarget {
    public static void main(String[] args) {
      char[] letters = {'c','f','j'};
      char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end =letters.length-1;


        while(start<=end){
            int mid=(start+end)/2;
            if(target <letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        // when end > start that means at start index we will be having the element greater than the given character
        // ex : c f j
        //mid=f now target c < mid so end will be mid-1 = 0 now c not less than c so start = 0+1=1 i.e end>start hence start has the next char > than target
        return letters[start % letters.length];

    }
}
