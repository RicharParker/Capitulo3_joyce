/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author ARCHV
 */
public class Test {
    public static void main(String[] args) {
        BankAccount usuario = new BankAccount(343434,"Angel",1233.44);
        System.out.println(usuario.getAccount());
        System.out.println(usuario.getName());
        System.out.println(usuario.getBalance());
    }
}
