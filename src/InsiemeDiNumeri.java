import java.lang.String;



/** Manages an insieme of numeri with an Integer array. When you want to remove an element, the pointer gets just
 * set to null. This improves performances in large data sets, but creates memory gaps
 * @author Jag
 * @version 24.12.2024
 * */
public class InsiemeDiNumeri {

    private Integer[] array;
    private int lastE;
    private int nullE;



    /** Check if insieme contains all the numbers in given insieme
     * @param insieme   The insieme you want to check for
     * @return true if array contains all the numbers
     * */
    public boolean containsAll(InsiemeDiNumeri insieme) {
        int count = 0;
        for(int i = 0; i < insieme.getLastE(); i++) {
            if(insieme.array[i] != null && contains(insieme.array[i])) count++;
        }
        return insieme.lastE - insieme.nullE == count;

    }

    /** Adds all elements from given insieme
     * @param insieme the insieme you want to add
     * */
    public void addAll(InsiemeDiNumeri insieme) {
        for(int i = 0; i < insieme.getLastE(); i++) {
            if(insieme.array[i] != null) {
                add(insieme.array[i]);
            }
        }
    }

    /** Remove all numbers in given insieme
     * @param insieme The insieme you want to remove
     * */
    public void removeAll(InsiemeDiNumeri insieme) {
     for(int i = 0; i < insieme.getLastE(); i++) {
            if(insieme.array[i] != null) {
                remove(insieme.array[i]);
            }
        }
    }

    /** Keeps only the numbers that are contained in given insieme
     * @param insieme the insieme you want to compare to
     * */
    public void retainAll(InsiemeDiNumeri insieme) {
        for (int i = 0; i < lastE; i++) {
            if(array[i] != null && !insieme.contains(array[i])) array[i] = null;
        }
    }

    /** Converts the object to an array of Integers
     * @return a copy of the array
     * */
    public Integer[] toArray(){
        Integer[] output = new Integer[lastE-nullE];
        int j = 0;
        for(int i = 0; i < lastE; i++) {
            if(array[i] != null) {
                output[j] = array[i];
                j++;
            }
        }
        return output;

    }


    public InsiemeDiNumeri() {
        array = new Integer[10000];
    }


    /** Get how many values are in the array
     * @return how many numbers
     * */
    public int size() {
        return lastE - nullE;
    }

    /** Clears the array
     * */
    public void clear() {
        array = new Integer[10000];
        nullE = 0;
        lastE = 0;
    }

    /** Check if array is empty
     * @return true if empty
     * */
    public boolean isEmpty() {
        return (nullE >= lastE-1);
    }



    /** Adds a number to array
     * @param n     The number you want to add
     * */
    public void add(int n) {
        for (Integer i : array) {
            if(i!= null && n==i) return;
        }
        array[lastE] = n;
        lastE++;
    }

    /** Removes a number to array
     * @param n     The number you want to remove
     * */
    public void remove(int n) {
     for (int i = 0; i < lastE; i++) {
        if(array[i] != null && array[i] == n) {
             array[i] = null;
             nullE++;
        }
     }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < lastE; i++) if (array[i] != null) output.append(array[i]).append("\n");
        return output.toString();
    }

    /** Check if array contains number
     * @param n     The number you want to look for
     * @return true if contained
     * */
    public boolean contains(int n) {
        for(int i = 0; i < lastE; i++) {
            if(array[i] != null && array[i]==n) return true;
        }
        return false;
    }


    private int getLastE() {
        return lastE;
    }

    

}
