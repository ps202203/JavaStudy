import java.util.PriorityQueue;

public class Pc_PriorityQueue {
    public static void main(String args[]) {
        //낮은 숫자가 우선 순위인 int형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();

        //높은 숫자가 우선 순위인 int형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>();


        priorityQueueLowest.add(1);
        priorityQueueLowest.add(10);
        priorityQueueLowest.add(100);


        priorityQueueHighest.add(1);
        priorityQueueHighest.add(10);
        priorityQueueHighest.add(100);

        priorityQueueHighest.peek();

    }
}