import java.util.ArrayList;



/** Manages an insieme of numeri with arrayLists
 * @author Jag
 * @version 24.12.2024
 * */
public class InsiemeDiNumeriList {
    ArrayList<Integer> arrayList;



    public InsiemeDiNumeriList() {
        arrayList = new ArrayList<Integer>();
    }


    /** Check if insieme contains all the numbers in given insieme
     * @param insieme   The insieme you want to check for
     * @return true if array contains all the numbers
     * */
    public boolean containsAll(InsiemeDiNumeriList insieme) {
        return arrayList.containsAll(insieme.arrayList);
    }


    /** Adds all elements from given insieme
     * @param insieme the insieme you want to add
     * */
    public void addAll(InsiemeDiNumeriList insieme) {
        arrayList.addAll(insieme.arrayList);
    }

    /** Remove all numbers in given insieme
     * @param insieme The insieme you want to remove
     * */
    public void removeAll(InsiemeDiNumeriList insieme) {
        arrayList.removeAll(insieme.arrayList);
    }

    /** Keeps only the numbers that are contained in given insieme
     * @param insieme the insieme you want to compare to
     * */
    public void retainAll(InsiemeDiNumeriList insieme) {
        arrayList.retainAll(insieme.arrayList);
    }

    /** Converts the object to an array of Integers
     * @return a copy of the array
     * */
    public Integer[] toArray(){
        return (Integer[]) arrayList.toArray();
    }


    /** Get how many values are in the array
     * @return how many numbers
     * */
    public int size() {
        return arrayList.size();
    }

    /** Clears the array
     * */
    public void clear() {
        arrayList = new ArrayList<Integer>();
    }

    /** Check if array is empty
     * @return true if empty
     * */
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }



    /** Adds a number to array
     * @param n     The number you want to add
     * */
    public void add(int n) {
        arrayList.add(n);
    }

    /** Removes a number to array
     * @param n     The number you want to remove
     * */
    public void remove(int n) {
        arrayList.remove(n);
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }

    /** Check if array contains number
     * @param n     The number you want to look for
     * @return true if contained
     * */
    public boolean contains(int n) {
        return arrayList.contains(n);
    }



}
