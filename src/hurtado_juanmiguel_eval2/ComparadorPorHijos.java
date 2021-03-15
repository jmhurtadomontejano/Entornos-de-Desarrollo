/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurtado_juanmiguel_eval2;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author usutarde
 */
public class ComparadorPorHijos implements Comparator, Serializable {

    @Override
    public int compare(Object o1, Object o2) {
    int resul = 1;
        Ciudadano c1, c2;
        c1 = (Ciudadano) o1;
        c2 = (Ciudadano) o2;
        if (c1.getNhijos() > c2.getNhijos()) {
            resul = -1;
        }
        if (c1.getNhijos() == c2.getNhijos()) {
            resul = 0;
        }
        return resul;
    }

}
