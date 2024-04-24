/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Interface
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.interfacebase;

public class Controle 
{

	public static void main(String[] args) 
	{
		
		Terrestre cao = new Terrestre("Cão");
		System.out.printf("%s %s.\n", cao.informar(), cao.viverEmTerra());
		
		Aquatico peixe = new Aquatico("Peixe");
		System.out.printf("%s %s.\n", peixe.informar(), peixe.viverNaAgua());
		
		Anfibio sapo = new Anfibio("Sapo");
		System.out.printf("%s %s e %s.", sapo.informar(), sapo.viverEmTerra(), 
				sapo.viverNaAgua());
	}
}
