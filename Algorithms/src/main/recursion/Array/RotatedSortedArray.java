package Array;

public class RotatedSortedArray {

    // find in rotates sorted array using recursion
    public static void main(String[] args) {
        int[] a = new int[]{7,8,9,0,1,2,3,4};
        int target=2;
        int index = find_element(a,0,a.length-1,target);
        System.out.println(index);
    }

    private static int find_element(int[] a, int s, int e, int target) {
        int mid= (s+e)/2;

        // if my target is in the middle return mid
        if(target==a[mid])
            return mid;

        if(a[s]<a[mid]){
            if(target<=a[mid]  && target>=a[s] )
                return find_element(a, s,mid-1,target);
            else
                return find_element(a, s,mid+1,target);
        }
        if( target>=a[mid] && target<=a[e]){
            return find_element(a, mid+1 , e, target);
        }
        return find_element(a,s,mid-1,target);

    }
}
