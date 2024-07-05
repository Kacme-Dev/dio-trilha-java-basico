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
}