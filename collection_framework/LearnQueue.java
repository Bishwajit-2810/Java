import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        // implimenting queue
        Queue<Integer> qu = new LinkedList<>();

        // adding in queue
        qu.offer(10);
        qu.offer(20);
        qu.offer(30);
        qu.offer(40);
        qu.add(50);
        System.out.println(qu);

        // remove from the qu
        qu.poll();
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);

        // peeking in queue'
        System.out.println(qu.peek());
        System.out.println(qu.element());

    }

}
