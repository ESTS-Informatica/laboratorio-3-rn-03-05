
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private static final double FEES = 4.0;
    
    private String name;
    private int numberOfContainers;
    
    
    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.numberOfContainers = numberOfContainers;
        this.name = name;
        setFees(FEES);
    }
    
    public int getNumberOfContainers() {
        return numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTransportType(){
        return "Transporte Aéreo";
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        
        sb.append(String.format("%15s: %s\n", "Número de Contentores", this.numberOfContainers));
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        return sb.toString();
    }
}



