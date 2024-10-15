package BinarySearchCode;
/*
Question 3: Find the smallest letter greater than the target.
    Given ch array, non-decreasing order
    -> Return the smallest ch that is larger than target.
    -> Same as Ceiling question, targets are wrap around.
    eg, if target= 'j' arr=[c, f, j] -> ans=c -> Wrap around.
    -> only used for greater, don't include the ==.
*/
public class SmallestLetter {
    public static void main(String[] args){
        char[] arr = {'a','f', 'g', 'l', 'm'};
                  // {0,  1,  2 , 3,  4};
        char ans = nextGreatestLetter(arr, 'z');
        System.out.println("Ans: "+ ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
        // most important -> if wrap around array modulate with array length.
    }
}
