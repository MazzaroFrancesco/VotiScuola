public class Segreteria  extends Utente{
  
    private int idSegreteria;
  
   
    
    public Segreteria (int idSegreteria){
        setIdSegreteria(idSegreteria);
      super(nome,cognome,email,password);
    }

    public  void setIdSegreteria(int idSegreteria) {
        this.idSegreteria=idSegreteria;
    }
     public int getIdSegreteria() {
     
         return idSegreteria;
    }      

  
}