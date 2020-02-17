
package projetotrabalhadores;


public class Trabalhador {
    private String cpf, nome, endereco;
    private int idade;
    private char sexo;
    private float salario;

    public Trabalhador() {
    }

    public Trabalhador(String cpf, String nome, String endereco, int idade, char sexo, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "cpf=" + getCpf() + ", nome=" + getNome() + ", endereco=" + getEndereco() + ", idade=" + getIdade() + ", sexo=" + getSexo() + ", salario=" + getSalario() + '}';
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    
}
