/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculab1;

import conversion.Convertor;
import operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica getAritmetica (String type);
    Convertor getConvertor (int c);
    
}
