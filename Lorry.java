
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    public Lorry( int numberOfPallets, int trailers , String licensePlate){
      super(licensePlate);
      this.numberOfPallets = numberOfPallets;
      this.trailers = trailers ;
      setLicensePlate(licensePlate);
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public int getNumberOfTrailers(){
        return trailers;
    }
    
    public void setNumberOfTrailers(int trailers){
        this.trailers = trailers;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        
        sb.append(String.format("%15s: %s\n", "Número de Paletes", this.numberOfPallets));
        sb.append(String.format("%15s: %s\n", "Reboque", this.trailers));
        return sb.toString();
   
    }
}
