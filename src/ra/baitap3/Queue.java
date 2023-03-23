package ra.baitap3;

public class Queue {
    private  Node front, rear;
    // node đầu và node cuối

    public Queue() {
        front= rear= null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }
}
