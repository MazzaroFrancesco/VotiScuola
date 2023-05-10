public class Classe {
public int sezione;
public Alunni Alunni[];
public int Anno;
public Classe (int sezione, Alunni Alunni[], int Anno){
    setSezione(sezione);
    setAlunni (Alunni);
    setAnno (Anno);
  }

    private void setSezione(int sezione) {
        this.sezione=sezione;
    }

    private void setAlunni(Alunni[] Alunni) {
        this.Alunni=Alunni;
    }

    private void setAnno(int Anno) {
       this.Anno=Anno;
    }
private int getSezione() {
        return sezione;
    }
private  Alunni[] getAlunni() {
        return Alunni;
    }
   private int getAnno() {
        return Anno;
    }
