import Queue.LinkedQueue;
import java.util.*;

class JavaTestingFile { 
    public static void main (String[] param) {
        // QueueTesting();
        dequeTesting();
        System.exit(0);
    }
    public static void QueueTesting() {
        LinkedQueue<Integer> Taren = new LinkedQueue<Integer>();
        Taren.offer(4);
        Taren.offer(5);
        Taren.offer(46);
        Taren.offer(48);

        System.out.println(Taren.peek());
        System.out.println(Taren.poll());
        System.out.println(Taren.peek());
    }

    public static void dequeTesting() {
        Deque deque = new ArrayDeque<>();
        deque.addFirst(2);
        deque.addFirst(2);
        deque.addFirst(2);
        deque.addFirst(2);
        deque.addFirst(5);
        deque.addLast(34);
        deque.addFirst(55);
        deque.addLast(34);
        deque.addLast(34);
        deque.addFirst(55);

        HashMap hashMap = new HashMap<Integer, Integer>();

        for (Object i : deque) {
            if (hashMap.containsKey(i)) { 
                hashMap.put(i, (Integer) hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        System.out.println(hashMap);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);

        System.out.println(arrayList.stream().max(Integer::compare).get());

    }
} 
