package assignment;

import java.security.InvalidParameterException;

/**
 * Implement the immutable class intSet using an array to represent 
 * a set of integers in the range 1-1000. It should support public methods like  
 * isMember(int x), size(), isSubSet(intSet s), getComplement()union( intSet s)
 * @author Abhinav
 *
 */

public class IntSetClass {
	
    private final boolean[] arrIntSet;
    private int sizeCount;

    /**Constructer used to define save the values in the arrIntSet
     * @param arr takes the input and to define values in the arrIntSet
     * @throws AssertionError throws when set is empty or size is greater than 1000
     */
    public IntSetClass(int arr[]) throws AssertionError {
        if (arr.length == 0) {
            throw new AssertionError("Set should not be empty");
        }
        if (arr.length > 1000) {
            throw new AssertionError("Set should not be greater then 1000");
        }
        sizeCount = arr.length;
        arrIntSet = new boolean[1001];
        for (int index = 0; index < sizeCount; index++) {
            if (arr[index] < 1 || arr[index] > 1000) {
                throw new InvalidParameterException("Set value should be in between 1 - 1000");
            }
            arrIntSet[arr[index]] = true;
        }

    }

    private IntSetClass() {

        arrIntSet = new boolean[1001];

    }

    /**returning the immutable array
     * @return the array that is private
     */
    public int[] getIntArr() {
        int[] outputArr = new int[sizeCount];
        int count = 0;
        for (int index = 0; index <= 1000; index++) {
            if (arrIntSet[index]) {
                outputArr[count++] = index;
            }

        }
        return outputArr;
    }

    /**
     * method to find that is input is present in the array or not
     * @param x input to check its availibility in the array
     * @return true or false if the input is avialable in array or not
     */
    Boolean isMember(int x) {
        if (x < 1 || x > 1000) {
            throw new InvalidParameterException("Set value should be in between 1 - 1000");
        }
        return arrIntSet[x];
    }

    /**
     * function used to return teh size of immutable array
     * @return the size of the immutable array
     */
    int size() {
        return sizeCount;
    }

    /**check whether s is a subset of the set
     * @param subset is the array to be checked in the main array
     * @return true or false whether s is a subset of the set
     */
    Boolean isSubSet(IntSetClass subset) {
        if (subset.sizeCount > sizeCount) {
            return false;
        }
        int count = 0;
        for (int index = 0; index <= 1000; index++) {
            if (subset.arrIntSet[index] && arrIntSet[index])
                count++;
        }

        return count == subset.sizeCount;
    }

    /**return the union set of both array
     * @param subset an array that is to be find as union with first array 
     * @return array which is the union of both array
     */
    IntSetClass union(IntSetClass subset) {
        IntSetClass outputset = new IntSetClass();
        int count = 0;
        for (int index = 0; index <= 1000; index++) {
            if (subset.arrIntSet[index] || arrIntSet[index]) {
                count++;
                outputset.arrIntSet[index] = true;
            }
        }
        outputset.sizeCount = count;
        return outputset;
    }

    /**Set of members that belong to both the first set "and" second set.
     * @param subset the array which is to be find as the intesection with immutable array
     * @return the intersection of both array as an array
     */
    IntSetClass intersection(IntSetClass subset) {

        IntSetClass outputset = new IntSetClass();
        int count = 0;
        for (int index = 0; index <= 1000; index++) {
            if (subset.arrIntSet[index] && arrIntSet[index]) {
                count++;
                outputset.arrIntSet[index] = true;
            }
        }
        outputset.sizeCount = count;
        return outputset;
    }

    /**Set of members that belong to the first set "and not" the second set
     * @param subset the array which is to be find as the difference with immutable array
     * @return the array which is difference of both array
     */
    IntSetClass difference(IntSetClass subset) {
        IntSetClass outputset = new IntSetClass();
        int count = 0;
        for (int index = 0; index <= 1000; index++) {
            if (!subset.arrIntSet[index] && arrIntSet[index]) {
                count++;
                outputset.arrIntSet[index] = true;

            }
        }
        outputset.sizeCount = count;
        return outputset;
    }

    /**Set of members that belong to the second (universal) set 
     * "and not" the first set. 
     * @param subset the array which is to be find as the difference with immutable array
     * @return the array which is complement of both array
     */
    IntSetClass complement(IntSetClass subset) {
        IntSetClass outputset = new IntSetClass();
        int count = 0;
        for (int index = 0; index <= 1000; index++) {
            if (subset.arrIntSet[index] && !arrIntSet[index]) {
                count++;
                outputset.arrIntSet[index] = true;
            }
        }
        outputset.sizeCount = count;
        return outputset;
    }
}
