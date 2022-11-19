import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    //Testing the Unsorted Array Path
    @org.junit.jupiter.api.Test
    void testingUnsortedArray(int array[]) {
        InsertionSort is = new InsertionSort();
        is.insertionSort(array);
//        int size = array.length;
//        for(int step = 1; step < size; step++) {
//            int key = array[step];
//            int j = step - 1;
//            while (j >= 0 && key < array[j]){
//                array[j + 1] = array[j];
//                --j;
//            }
//            array[j + 1] = key;
//        }
    }

    //testing the Sorted Array Path
    @org.junit.jupiter.api.Test
    void testingSortedArray(int array[]) {
        InsertionSort is = new InsertionSort();
        int size = array.length;
        for(int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            while (j >= 0 && key < array[j]){

            }
            array[j + 1] = key;
        }
    }

    //testing the Empty Array Path
    @org.junit.jupiter.api.Test
    void testingEmptyArray() {
        InsertionSort is = new InsertionSort();
    }

}