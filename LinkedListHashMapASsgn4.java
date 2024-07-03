class Tester {
    public static void main(String args[]) {
        Queue queue = new Queue(5);

        queue.enqueue("Emily");
        queue.enqueue("Lily");
        queue.enqueue("Rachel");
        queue.enqueue("Rose");

        queue.dequeue();
        queue.dequeue();

        System.out.println("Current Queue: " + queue.getQueue());
    }
}
