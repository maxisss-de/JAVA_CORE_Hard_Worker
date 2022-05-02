package com.company;

@FunctionalInterface
// @FunctionalInterface следит, чтобы был, только один метод, если будет больше, будет показывать ошибку
public interface OnTaskErrorListener {  // Тут может быть только один метод и всё.
    void onError(String result);
}
