public class Insegnante extends Utente {
     private int idInsegnante;
  
    private String materia;
    
    public Insegnante (int idInsegnante, String materia){
        setIdInsegnante(idInsegnante);
        super(nome,cognome,email,password);
      
    }

    public  void setIdInsegnante(int idInsegnante) {
        this.idInsegnante=idInsegnante;
    }
     public int getIdInsegnante() {
     
         return idInsegnante;
    }      
 public  void setMateria(String materia) {
        this.materia=materia;
    }
   public String getMateria() {
     
         return materia;
   }
}
