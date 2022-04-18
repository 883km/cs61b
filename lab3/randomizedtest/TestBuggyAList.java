package randomizedtest;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> good = new AListNoResizing<>();
        BuggyAList<Integer> buggy = new BuggyAList<>();

        good.addLast(4);
        good.addLast(5);
        good.addLast(6);
        buggy.addLast(4);
        buggy.addLast(5);
        buggy.addLast(6);

        assertEquals(good.size(), buggy.size());
        assertEquals(good.removeLast(), buggy.removeLast());
        assertEquals(good.removeLast(), buggy.removeLast());
        assertEquals(good.removeLast(), buggy.removeLast());

    }
}
