public class Voti {
    
private Voto Voti[];
    private Alunno[] Alunni;

public Voti(Voto Voti[]){
    setVoti(Voti);
}
public void setVoti(Voto Voti[]){
    this.Voti=Voti;
}
public Voto[] getVoti(){
    return Voti;
}
}
