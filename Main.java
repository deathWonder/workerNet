public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener badListener = System.out::println;


        Worker worker = new Worker(listener, badListener);
        worker.start();
    }
}