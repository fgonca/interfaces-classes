package fundamentos.interfacebase;

//Declaração de realização/implementação de duas interfaces
public class Anfibio implements ITerrestre, IAquatico
{
	private String nome;
	
    public Anfibio(String nome) 
    {
    	this.nome = nome;
    }  
    
    // a classe é obrigada a implementar os métodos da interface
    public String informar() 
    {
		return nome;
	}
    
    // classe é obrigada a implementar os métodos da interface
	public String viverNaAgua() 
	{
		return "vive na água";
    } 
	
	// a classe é obrigada a implementar os métodos da interface
	public String viverEmTerra() 
	{
		return "vive em terra";
	}
}
