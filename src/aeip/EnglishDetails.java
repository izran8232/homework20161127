
package aeip;

public class EnglishDetails extends English implements Course{
   
    private int _creditHours;
    
    public int getCreditHours(){
        return _creditHours;
    }
    public void setCreditHours(int creditHours){
        _creditHours = creditHours;
    }
    
    public String assistantName(){
      return "Mr. Azhar";
   }
}
