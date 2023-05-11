public final class Insegnante extends Utente {
     private int idInsegnante;
  
    private Associazione Classe;
    
    public Insegnante (int idInsegnante, String materia,String nome,String cognome,String email,String password){
    super(nome,cognome,email,password);{
         
        setIdInsegnante(idInsegnante);
    
    }

    public  void setIdInsegnante(int idInsegnante) {
        this.idInsegnante=idInsegnante;
    }
          public  Associazione Classe(Associazione Classe) {
        this.Classe=Classe;
          }
     public int getIdInsegnante() {
     
         return idInsegnante;
    }      
         
 public  void setMateria(String materia) {
        this.materia=materia;
    }
         public  Associazione Classe(Associazione Classe) {
        return Classe;
          }
   public String getMateria() {
     
         return materia;
   }
}
