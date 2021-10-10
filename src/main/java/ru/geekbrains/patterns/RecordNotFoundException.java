package ru.geekbrains.patterns;

public class RecordNotFoundException extends Throwable {
    public RecordNotFoundException(Integer id) {
        System.err.println("ЗАПИСЬ ПОД С ID " + id + " НЕ НАЙДЕНА");
    }
}
