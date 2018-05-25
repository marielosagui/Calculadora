/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import calculab1.AbstractFactory;
import operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class FactoryConvertor implements AbstractFactory {

    @Override
    public Aritmetica getAritmetica(String type) {
       return null;
    }

    @Override
    public Convertor getConvertor(int c) {
        return new binario();
       
    } 
}
