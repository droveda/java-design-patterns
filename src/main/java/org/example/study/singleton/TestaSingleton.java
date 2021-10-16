package org.example.study.singleton;

public class TestaSingleton {

    public static void main(String[] args) {
        EmpresaSingleton instance = EmpresaSingleton.getInstance();
        EmpresaSingleton instance2 = EmpresaSingleton.getInstance();
        EmpresaSingleton instance3 = EmpresaSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
    }

}
