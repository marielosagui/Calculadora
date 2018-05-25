/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import calculab1.AbstractFactory;
import conversion.Convertor;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements AbstractFactory {

    @Override
    public Aritmetica getAritmetica(String type) {
        switch (type){
            case "suma":
                return new sumar();
            case "resta":
                return new restar();
            case "multiplicacion":
                return new multiplicar();
            case "division":
                return new dividir();
        }
        return null;
    }

    @Override
    public Convertor getConvertor(int c ) {
       return null; //To change body of generated methods, choose Tools | Templates.
    }

}
