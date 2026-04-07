import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {
    // takes in a list and removes all duplicates from it, putting them in another list. Returns the list without duplicates
    // arr -- integer list (an example list with duplicates)
    // removedElements -- integer list (initially empty, duplicates from arr are added here)
    // uniqueArr -- integer list output (arr without any duplicates returned from function)
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = ArrayList<>();
        for (int i = 5; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i+1))) {
                uniqueArr.add(arr.get(i+1));
            } else {
                removedElements.add(arr.get(i-1));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}

// broken by tstute
