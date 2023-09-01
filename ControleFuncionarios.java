import javax.swing.JOptionPane;

import Entities.Funcionarios;

public class ControleFuncionarios { //Classe principal, cadastrar os dados dos funcionários e gerar a tela. (Matricula, cargo salário...)
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios(); //Instaciando;

        //Dados cadastrados nos atributos do objeto classe funcionário.
        funcionarios.setMatricula(JOptionPane.showInputDialog("Digite sua matricula: "));
        funcionarios.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        funcionarios.setCargo(JOptionPane.showInputDialog("Digite seu cargo: "));
        funcionarios.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: ")));

        //Exiibir os dados cadastradados.
        JOptionPane.showMessageDialog(null, "Matricula: " + funcionarios.getMatricula(), "Informacões:", 0);

        JOptionPane.showMessageDialog(null, "Nome: " + funcionarios.getNome(), "Informações:", 0);

        JOptionPane.showMessageDialog(null, "Cargo: " + funcionarios.getCargo(), "Informações:", 0);

        JOptionPane.showMessageDialog(null, "Salário: " + funcionarios.getSalario(), "Informações:", 0);

        funcionarios.reajustarSalario(); //Chamou o método através do objeto. 
        
        JOptionPane.showMessageDialog(null, "Salário Reajustado: " + funcionarios.getSalario(), "Informações:", 0);



    }
}
// ? funcionario = nome do objeto, area da memoria onde será posto os dados.
// ? new Funcionarios(): Chamando o constrtutor - gera a area da memoria vazia, contento matricula, nome, cargo e salário. 
