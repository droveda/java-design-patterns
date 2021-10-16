package org.example.study.singleton;

public class EmpresaSingleton {

    private static EmpresaSingleton instance;

    private EmpresaSingleton() {
    }

    public static EmpresaSingleton getInstance() {
        if (instance == null) {
            instance = new EmpresaSingleton();
        }
        return instance;
    }

}
