import javax.swing.JOptionPane;

public class Aluno {
    private String nome_aluno;
    private double nota1;
    private double nota2;
    
    public void CadastrarAluno(String nm, double n1, double n2) {
        this.nome_aluno=nm;
        this.nota1=n1;
        this.nota2=n2;
        JOptionPane.showMessageDialog(null, "Dados Cadastrados Com Sucesso!");
    }
    
    public void ExibirAluno(){
        JOptionPane.showMessageDialog(null,"Nome do Aluno: "+this.nome_aluno+"\nNota1: "+this.nota1+"\nNota2: "+this.nota2);
    }
    
    public double CalcularMedia(){
        double media=(this.nota1+this.nota2)/2;
        JOptionPane.showMessageDialog(null, "A media do aluno é: "+media);
        return media;
    }
    
    public void ExibirSituacao(double media){
        if(media>=5){
            JOptionPane.showMessageDialog(null,"Aluno Aprovado!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Aluno Reprovado!");
        }
    }
    
}
