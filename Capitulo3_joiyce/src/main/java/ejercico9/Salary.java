/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico9;

/**
 *
 * @author ARCHV
 */
public class Salary {
    private Integer pay;
    private Integer regularHours;
    private Integer overtimeHours;
    
   public void calcularSalario(double paga, int horas, int extras){
        double salario = horas*paga+((paga*1.5)*extras);      
        System.out.println(" paga semanal : "+salario+" por "+extras+" horas extras.");
    }
}
