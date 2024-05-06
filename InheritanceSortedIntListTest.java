package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntListTest {

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    /**
     * Called before each test.
     */
    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    /**
     * Tests for the add() method.
     */
    @Test
    public void testAdd() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertEquals(5, list1.getTotalAdded());
    }

    /**
     * Tests for the addAll() method.
     */
    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertEquals(5, list1.getTotalAdded());

        list2.add(3);
        list2.add(0);

        assertEquals(2, list2.getTotalAdded());

        list2.addAll(list1);

        assertEquals(7, list2.getTotalAdded());
    }

    /**
     * Tests for add() and addAll() methods together.
     */
    @Test
    public void testAddAndAddAllTogether() {
        // Adding to list1
        list1.add(1);
        list1.add(3);
        list1.add(2);

        // Adding to list2
        list2.add(4);
        list2.add(2);
        list2.add(6);

        assertEquals(3, list1.getTotalAdded());
        assertEquals(3, list2.getTotalAdded());

        // Merging lists
        list2.addAll(list1);

        // After merging, list2 should contain 6 elements
        assertEquals(6, list2.getTotalAdded());
    }

    /**
     * Tests that getTotalAdded() returns 0 for an empty list.
     */
    @Test
    public void testGetTotalAddedForEmptyList() {
        assertEquals(0, list1.getTotalAdded());
    }
}
