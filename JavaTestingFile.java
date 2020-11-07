import Queue.LinkedQueue;

class JavaTestingFile { 
    public static void main (String[] param) {
        QueueTesting();
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
} 
