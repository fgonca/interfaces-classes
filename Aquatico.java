package fundamentos.interfacebase;

//Declaração de realização/implementação de uma interface
public class Aquatico implements IAquatico
{
	private String nome;
	
    public Aquatico(String nome) 
    {
    	this.nome = nome;
    }
    
    // a classe é obrigada a implementar os métodos da interface
    public String informar() 
    {
		return nome;
	}
    
    // a classe é obrigada a implementar os métodos da interface
	public String viverNaAgua() 
	{
		return "vive na água";
    } 

}
