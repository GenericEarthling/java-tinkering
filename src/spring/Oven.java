/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author Tender
 */
public class Oven {
    private Pie p;
    public Oven(Pie p) {
        this.p = p;
        // without IoC
        this.p = new Pie();
    }
}
