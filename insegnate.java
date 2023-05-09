public class Insegnante extends Utente {
     private int idInsegnante;
  
    private String materia;
    
    public Insegnante (int idInsegnante, String materia,String nome,String cognome,String email,String password){
    super(nome,cognome,email,password);{
         super(nome,cognome,email,password);
        setIdInsegnante(idInsegnante);
    
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
