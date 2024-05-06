package edu.cmu.cs.cs214.rec04;

/**
 * AbstractIntList -- a list of integers.
 *
 * @author Nora Shoemaker
 */
public abstract class AbstractIntList implements IntegerList {

    /**
     * Adds all of the elements of the IntegerList to the list.
     * Calls add() on each element of list. Can be overwritten
     * for more specific behavior.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    public boolean addAll(IntegerList list) {
        boolean listChanged = false;
        for (int i = 0; i < list.size(); i++) {
            if (this.add(list.get(i))) {
                listChanged = true;
            }
        }
        return listChanged;
    }
}
