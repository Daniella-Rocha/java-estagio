/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.polimorfismo;

/**
 *
 * @author danie
 */
public class ClientePJ extends Cliente {

    String cnpj;

    public ClientePJ(String name, String adress, String cnpj) {
        super(name, adress);
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
        
    public String showInfo(){
        return super.showInfo() + " - " + "Cnpj: " + cnpj; 
    }
}
