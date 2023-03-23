package ra.baitap3;

public class Solution {

    Queue queue;

    public Solution() {
        queue = new Queue();
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (queue.getFront() == null){
            queue.setFront(newNode);
            queue.setRear(newNode);
        }else {
            queue.getRear().link= newNode;
            queue.setRear(newNode);
        }
    }
    public void dequeue(){
        if (queue.getFront() == null){
            throw new IllegalStateException("Hàng đợi null");
        }
        if(queue.getRear() == queue.getFront()){
            System.out.println(queue.getFront().data);
            queue.setRear(null);
            queue.setFront(null);
        }else {
            System.out.println(queue.getFront().data);
            queue.setFront(queue.getFront().link);
        }
    }
    public void display() {
        Node temp = queue.getFront();
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
