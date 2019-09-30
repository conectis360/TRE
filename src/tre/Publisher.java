/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tre;
import javax.xml.ws.Endpoint;
/**
 *
 * @author conec
 */
public class Publisher {
    public static void main(String[] args)
  {
    Endpoint.publish("http://127.0.0.1:8081/tre",
    new CadastraTitulo());
      System.out.println("Serviço Publicado");
  }
}
