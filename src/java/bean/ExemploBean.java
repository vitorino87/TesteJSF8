/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploBean {
    private String texto;
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto=texto;
    }
}
