package fundamentos.interfacebase;

//Declaração de realização/implementação de uma interface
public class Terrestre implements ITerrestre
{	
	private String nome;
	
    public Terrestre(String nome) 
    {
        this.nome = nome;
    }       
    
    // a classe é obrigada a implementar os métodos da interface
    public String informar()       
    {
  		return nome;
  	}
    
    // a classe é obrigada a implementar os métodos da interface
  	public String viverEmTerra() 
  	{
  		return "vive em terra";
    } 
}
