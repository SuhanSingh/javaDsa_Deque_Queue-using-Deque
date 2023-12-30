import java.util.*;
import java.util.LinkedList;
public class Classroom {
    static class Queue {
		Deque<Integer> deque = new LinkedList<>();
        
        public void add(int data) { //O(1)
            deque.addLast(data);
        }

        public int remove() { //O(1)
            return deque.removeFirst();
        }

        public int peek() { //O(1)
            return deque.getFirst();
        }
	}

    public static void main(String args[]) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);

		System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
// peek = 1
// 1
// 2
// 3