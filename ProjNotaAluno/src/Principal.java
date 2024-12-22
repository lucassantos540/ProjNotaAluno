import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Aluno aluno=new Aluno();
        
        String nome=JOptionPane.showInputDialog("Nome do aluno: ");
        double nt1=Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));
        double nt2=Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
        
        aluno.CadastrarAluno(nome, nt1, nt2);
        aluno.ExibirAluno();
        
        double med=aluno.CalcularMedia();
        aluno.ExibirSituacao(med);
        
    }
    
}
