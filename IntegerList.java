package edu.cmu.cs.cs214.rec04;

import java.util.NoSuchElementException;

/**
 * IntegerList - A list of integers.
 *
 * @author Nora Shoemaker
 */
public interface IntegerList {

    /**
     * Adds the specified integer to the list.
     *
     * @param num the integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    boolean add(int num);

    /**
     * Adds all of the elements of the specified IntegerList to this list.
     *
     * @param list the IntegerList containing elements to be added to this list
     * @return true if this list changed as a result of the call
     */
    boolean addAll(IntegerList list);

    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    int get(int index) throws IndexOutOfBoundsException;

    /**
     * Removes the first occurrence of the specified element from the list, if it is present.
     *
     * @param num the integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    boolean remove(int num);

    /**
     * Removes from this list all of its elements that are contained in the specified IntegerList.
     *
     * @param list the IntegerList containing elements to be removed from this list
     * @return true if this list changed as a result of the call
     */
    boolean removeAll(IntegerList list);

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    int size();

}
