/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author i-kom
 */
public class TestResult {

    public static void main(String[] args) {
     Exercise obj = new Exercise();
     obj.setMessage("This is some text");
     System.out.println("Ключ (Діаметр стержня)");
     obj.setKey(4);
     obj.cipher();   
     System.out.println("Зашифровка: " + obj.getScytaleMessage());
     obj.decrypt();
     System.out.println("Розшифровка: " + obj.getMessage());
    }
}
