/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.swing.JOptionPane;
/**
 *
 * @author conec
 */

@WebService(endpointInterface = "tre.Inadiplente")
public class CadastraTitulo implements Inadiplente {
 
    @WebMethod
    @Override
    public boolean verifica(String texto){
        boolean foi = false;  
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:TRE.db");
            ResultSet rs = con.prepareStatement("SELECT titulo FROM inadiplencia WHERE titulo = '" + texto + "';").executeQuery();
            CadastraTitulo titulo = new CadastraTitulo();
            if(rs.next()){
                 foi = true;
            }else{
                foi = false;
            }
            con.close();
        }catch ( Exception ex ) {
            System.out.println(ex.getMessage());
        }
        
        return foi;
    }
    
    
}
