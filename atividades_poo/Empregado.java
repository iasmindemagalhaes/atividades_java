public class Empregado {

    private String nome;
    private String sobrenome;
    private double salario;

	public Empregado(String nome, String sobrenome, float salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if(salario > 0) {
			this.salario = salario;
		} else {
			this.salario = 0.0;
		}
	}

	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
	    if(salario > 0) {
		    this.salario = salario;
	    } else {
		    this.salario = 0.0;
	    }
    }

	public double salarioAnual(){
		return this.salario * 12;
	}

	public double aumentaSalario(){
		this.salario *= 1.1;
		return this.salarioAnual();
	}

}
