
package lab1_part2;

public class Izdatelstva {
    
    private String nazvanieIzdatelstva;
    private String gorod;
    
    public Izdatelstva(String nazvanieIzdatelstva, String gorod){
        setNazvanieIzdatelstva(nazvanieIzdatelstva);
        setGorod(gorod);
    }
    
    
    
    public String getNazvanieIzdatelstva(){
        return nazvanieIzdatelstva;
    }
    
    public String getGorod(){
        return gorod;
    }
    
    
    public void setNazvanieIzdatelstva(String nazvanieIzdatelstva){
         if (nazvanieIzdatelstva != null && !nazvanieIzdatelstva.trim().isEmpty()) {this.nazvanieIzdatelstva=nazvanieIzdatelstva;} 
         else {throw new IllegalArgumentException();}   
    }
    
    public void setGorod(String gorod){
         if (gorod != null && !gorod.trim().isEmpty()) {this.gorod=gorod;} 
         else {throw new IllegalArgumentException();}   
    }
}
