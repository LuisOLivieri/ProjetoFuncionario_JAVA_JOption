//Objeto "algo que vou manipular"
package Entities;

public class Funcionarios { //Classe poara a manipulação dos dados do funcionário, quais informaçoes vou manipular (reajuste, impostos);
//Definir os atributos e quais informaçoes serão cadastradas;
//Atributos privados, só serão acessados na class atual (encapsulamento);
//Atributos da classe:
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;

//Contrutor padrão: ***mesmo nome da classe
    public Funcionarios() {

    }

//Método setter: incluir coisas no objeto.
    public void setMatricula(String matricula){ //Pega o valor recebido e aloca na área
        this.matricula = matricula; //Pega o valor recebibo(roxo) e guarda no this.matricula(matricula objeto funcionario)
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//Metódos getter: tirar os valores no objeto.

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    
    public double getSalario() {
        return salario;
    }

    //Métodos personalizados: 
    public void reajustarSalario() { //Void, pois ele vai alterar o salário.
        if(this.cargo.equalsIgnoreCase("Gerente")){
            this.salario = this.salario * 1.10; //10%
        } else if (this.cargo.equalsIgnoreCase("Junior")) {
            this.salario = this.salario * 1.05; //5%
        } else {
            this.salario = this.salario * 1.01; //1%
        }
    }


}
