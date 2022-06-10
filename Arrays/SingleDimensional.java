package Arrays;

// Class
public class SingleDimensional {
    // Create an array & initialize with  null values
    int[] arr = null;

    // Create Constructor
    public SingleDimensional(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
        for (int i=0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Array Insertion
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Array Traversal
    public void traversal() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    // Search for an element in the given Array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // Delete index from Array
    public void deleteValue(int deleteIndex) {
        try {
            arr[deleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Create an object of Single Dimensional Class
        SingleDimensional singleDimensional = new SingleDimensional(3);

        // Insertion
        singleDimensional.insert(0,10);
        singleDimensional.insert(1,20);
        singleDimensional.insert(2,30);

        // Traversal
        singleDimensional.traversal();

        // Searching
        singleDimensional.searchInArray(20);

        // Deletion
        singleDimensional.deleteValue(1);
    }
}


