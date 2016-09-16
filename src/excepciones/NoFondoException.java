/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones;

/**
 *
 * @author jparedes2
 */
public class NoFondoException extends Exception{
    public NoFondoException(){
            super ("La cuenta tiene fondos insuficientes para realziar el retiro pedido");
                    }
}
