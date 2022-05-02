package com.company;

@FunctionalInterface
// @FunctionalInterface следит, чтобы был, только один метод, если будет больше, будет показывать ошибку
public interface OnTaskDoneListener {  // Тут может быть только один метод и всё.
    void onDone(String result);
}
