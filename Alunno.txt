public class Alunno extends Utente
{
private int idAlunno;

public Alunno(int idAlunno,String nome,String cognome,String email,String password){
    super(nome,cognome,email,password);
    setIdAlunno(idAlunno);
   
}
public void setIdAlunno(int idAlunno){
    this.idAlunno=idAlunno;
}
public int getIdAlunno(){
    return idAlunno;
}
}
