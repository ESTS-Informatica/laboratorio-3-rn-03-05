
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages; 
    
    public Van (int packages, String licensePlate){
      super(licensePlate);
      this.packages = packages;
      setLicensePlate(licensePlate);
    }
    
    public int getNumberOfPackages() {
        return packages;
    }
    
    public void setNumberOfPackages(int packages) {
        this.packages = packages;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        
        sb.append(String.format("%15s: %s\n", "Pacotes", this.packages));
        return sb.toString();
   
    }
}
