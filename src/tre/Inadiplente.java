/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tre;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService (name = "CadastraTitulo")
@SOAPBinding(style = Style.RPC)
public interface Inadiplente {
    @WebMethod boolean verifica(String texto);    
}
