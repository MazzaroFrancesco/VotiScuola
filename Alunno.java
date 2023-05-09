public class Alunno extends Utente
{
private int idAlunno;

public Alunno(int idAlunno){
    setIdAlunno(idAlunno);
    super(nome,cognome,email,password);
   
}
public void setIdAlunno(int idAlunno){
    this.idAlunno=idAlunno;
}
public int getIdAlunno(){
    return idAlunno;
}
}