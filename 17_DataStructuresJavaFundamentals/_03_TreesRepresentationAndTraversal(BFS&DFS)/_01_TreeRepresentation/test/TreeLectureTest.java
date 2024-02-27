package implementations;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TreeLectureTest {
    private TreeLecture<Integer> tree;

    @Before
    public void setUp() {
        this.tree =  new TreeLecture<>(7,
                new TreeLecture<>(19,
                        new TreeLecture<>(1),
                        new TreeLecture<>(12),
                        new TreeLecture<>(31)),
                new TreeLecture<>(21),
                new TreeLecture<>(14,
                        new TreeLecture<>(23),
                        new TreeLecture<>(6))
        );
    }

    @Test
    public void testTreeConstructor() {
        assertNotNull(tree);
    }

    @Test
    public void testTreeBfs() {
        Integer[] expected = {7, 19, 21, 14, 1, 12, 31, 23, 6};
        int index = 0;

        for (Integer num : tree.orderBfs()) {
            assertEquals(expected[index++], num);
        }
    }

    @Test
    public void testTreeDfs() {
        Integer[] expected = {1, 12, 31, 19, 21, 23, 6, 14, 7};
        int index = 0;

        for (Integer num : tree.orderDfs()) {
            assertEquals(expected[index++], num);
        }
    }

    @Test
    public void testTreeStackDfs() {
        Integer[] expected = {1, 12, 31, 19, 21, 23, 6, 14, 7};
        int index = 0;

        for (Integer num : tree.orderStackDfs()) {
            assertEquals(expected[index++], num);
        }
    }

    @Test
    public void testAddTree() {
        tree.addChild(1, new TreeLecture<>(-1, new TreeLecture<>(-2), new TreeLecture<>(-3)));
        Integer[] expected = {-2, -3, -1, 1, 12, 31, 19, 21, 23, 6, 14, 7};
        int index = 0;

        for (Integer num : tree.orderDfs()) {
            assertEquals(expected[index++], num);
        }
    }
	
	@Test
    public void testRemoveNode() {
        tree.removeNode(19);
        Integer[] expected = {7, 21, 14, 23, 6};

        List<Integer> integers = tree.orderBfs();
        assertEquals(expected.length, integers.size());
        int index = 0;

        for (Integer num : integers) {
            assertEquals(expected[index++], num);
        }
    }
	
	@Test
    public void testSwap() {
        tree.swap(19, 14);
        Integer[] expected = {7, 14, 21, 19, 23, 6, 1, 12, 31};

        List<Integer> integers = tree.orderBfs();
        assertEquals(expected.length, integers.size());
        int index = 0;
        
        for (Integer num : integers) {
            assertEquals(expected[index++], num);
        }
    }
}