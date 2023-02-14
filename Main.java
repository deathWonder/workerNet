public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener badListener = x -> {
            if (x == 33) {
                System.out.println("Task " + x + " is failed");
            } else {
                System.out.println("Task " + x + " is done");
            }
        };


        Worker worker = new Worker(listener, badListener);
        worker.start();
    }
}