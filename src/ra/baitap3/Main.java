package ra.baitap3;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enqueue(3);
        solution.enqueue(8);
        solution.enqueue(7);
        solution.enqueue(6);
        solution.enqueue(4);
        solution.enqueue(-1);
        solution.enqueue(-10);
        solution.enqueue(9);
        solution.display();
        System.out.println("xoá phần tử");
        solution.dequeue();
        System.out.println("danh sách sau khi xoá");
        solution.display();
        solution.dequeue();
        solution.dequeue();
        solution.dequeue();
        solution.dequeue();
        System.out.println("danh sách sau khi xoá 4 phần tử");
        solution.display();
    }
}
