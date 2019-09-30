package nameclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class NameClient {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://172.20.3.173:9870/nome?wsdl");
        QName serviceQname = new QName("http://nameserver/", "NameServerImplService");
        Service service = Service.create(url, serviceQname);
        QName portQname = new QName("http://nameserver/", "NameServerImplPort");
        NameServer objeto = service.getPort(portQname, NameServer.class);
        System.out.println(objeto.getNome());
    }

}
