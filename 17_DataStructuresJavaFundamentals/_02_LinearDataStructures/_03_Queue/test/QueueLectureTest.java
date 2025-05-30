package implementations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueLectureTest {
    private QueueLecture<String> queue;

    @Before
    public void setUp() {
        this.queue = new QueueLecture<>();
        for (int i = 0; i < 100; i++) {
            queue.offer(String.valueOf(i));
        }
    }

    @Test
    public void testPushShouldAddAtTheEnd() {
        queue.offer("Slayer");
        assertEquals("0", queue.peek());
    }

    @Test
    public void testPopShouldRemoveAndReturnTopElement() {
        assertEquals("0", queue.poll());
        assertEquals(99, queue.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopShouldThrowWhenEmpty() {
        new QueueLecture<>().poll();
    }

    @Test
    public void testPeekShouldReturnAndNotRemove() {
        assertEquals("0", queue.peek());
        assertEquals(100, queue.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekShouldThrowWhenEmpty() {
        new QueueLecture<>().peek();
    }

    @Test
    public void testSize() {
        assertEquals(100, queue.size());
        assertEquals(0, new QueueLecture<>().size());
    }


    @Test
    public void testIsEmpty() {
        assertTrue(new QueueLecture<>().isEmpty());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIteratorShouldTraversItemsFromBeginToEnd() {
        int last = 0;
        for (String s : queue) {
            assertEquals(String.valueOf(last++), s);
        }
    }
}