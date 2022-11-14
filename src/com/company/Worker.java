package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) { // Конструктор
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " did not work");
                /* break;*/
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
