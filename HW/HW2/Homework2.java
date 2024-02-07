/**
 * Christopher Oh
 * SJSU CS 146
 * HW 2 - Java
 */

public class Homework2 {
    /**
     * Finds the first bad version in an ordered set of products
     * @param arr
     * @return index of first bad version
     */
    public static int findBadVersion (int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        //essentially binary search
        while (min != max) {
            if (isBadVersion(arr[mid])) { //is bad version
                max = mid;
            } else { //version is ok
                min = mid + 1;
            }
            mid = (min + max) / 2;
        }

        return max;
    }

    //place holder method
    public static boolean isBadVersion (Object version) {
        return false;
    }

    public static boolean isBadVersion (int version) {
        return version >= 603;
    }

    public static void main(String[] args) {
        int[] versions = new int[10000];
        for (int i = 0; i < versions.length; i++) {
            versions[i] = i;
        }
        System.out.println(findBadVersion(versions));
    }
}
