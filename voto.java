import java.time.LocalDate;

public class Voto {
   LocalDate myObj;
    
   private float Voto;
private String Materia;
  
   public Voto (float Voto,int gg, int mm, int aa){
       setVoto (Voto);
       setData(aa,mm,gg);
       
       
   }
   public void setVoto (float Voto){
       this.Voto=Voto;
       
   }
public void setData (int gg, int mm, int aa){
       myObj=LocalDate.of(aa, mm, gg);
       
   }
    public float getVoto(){
    return Voto;
}
}
