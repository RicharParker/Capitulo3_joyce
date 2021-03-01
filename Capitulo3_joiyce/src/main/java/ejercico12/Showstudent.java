/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico12;

/**
 *
 * @author ARCHV
 */
public class Showstudent {
    public static void main(String[] args) {
        Student estudiante = new Student();
        estudiante.setId(9999);
        System.out.println(estudiante.getId());
        estudiante.setCreditHours(3);
        System.out.println(estudiante.getCreditHours());
        estudiante.setPoints(12);
        System.out.println(estudiante.getPoints());
    }
}
