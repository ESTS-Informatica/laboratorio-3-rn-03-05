
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private static final double FEES = 3.0;
    private String licensePlate;
    
     public GroundTransportation(String licensePlate) {
         super();
         this.licensePlate = licensePlate;
         setFees(FEES);
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        
        sb.append(String.format("%15s: %s\n", "Matrícula", this.licensePlate));
        return sb.toString();
   
    }
}
