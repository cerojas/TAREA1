// recibe numeros y los ordena
import java.util.*;
public class OrdenaNumeros
{
	public static void main(String[] args)
	{
		
		
		
		Scanner lee = new Scanner(System.in);
		
		
		
		boolean salir= true;

		while(salir)
		{
		
			System.out.println("ingrese un numero: ");
			String opcion = lee.next();
		
		
			if(opcion.toLowerCase().equals("s"))
			{
				salir= false;
			}
			else
			{
				try
				{
					int numero= Integer.parseInt(opcion);
					System.out.println("valor numerico "+numero);
				}
				catch(NumberFormatException e)
				{
					System.out.println("digite una opcion valida! ");
				}
				
			}
		}
			
		
		
	}
}