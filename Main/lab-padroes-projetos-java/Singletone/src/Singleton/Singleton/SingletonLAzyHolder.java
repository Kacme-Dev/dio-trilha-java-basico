<<<<<<<< HEAD:Main/lab-padroes-projetos-java/Singletone/src/Singleton/Singleton/SingletonLAzyHolder.java
package Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kleber Moreno
 */
public class SingletonLAzyHolder {

    private static class InstanceHolder {
         public static SingletonLAzyHolder instancia = new SingletonLAzyHolder();
    }
   
    private SingletonLAzyHolder() {
        super();
    }

    public static SingletonLAzyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
========
package Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kleber Moreno
 */
public class SingletonLAzyHolder {

    private static class InstanceHolder {
         public static SingletonLAzyHolder instancia = new SingletonLAzyHolder();
    }
   
    private SingletonLAzyHolder() {
        super();
    }

    public static SingletonLAzyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
>>>>>>>> dd2548aeb807dc5ee8ca900af54f639b97facbfb:Main/lab-padroes-projetos-java/Singletone/src/Singleton/SingletonLAzyHolder.java
}