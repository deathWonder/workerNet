import java.util.Random;

public class Worker {

    private OnTaskDoneListener callback;

    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        Random r = new Random();
        int caseWithWorker = r.nextInt(2) + 1;
        if (caseWithWorker == 1) {
            for (int i = 1; i <= 100; i++) {
                callback.onDone("Task " + i + " is done");
            }
        } else {
            for (int i = 1; i <= 100; i++) {
                errorCallback.onError(i);
            }
        }
    }
}
