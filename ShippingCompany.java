import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String name){
      this.name= name;
      inService = new ArrayList<Transport> ();
    }
    
    public String getName() {
        return name;
    }
    
}

