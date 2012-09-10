// recibe numeros y los ordena

import java.util.*;

public class OrdenaNumeros
{
	public static void main(String[] args)
	{
		
		Scanner lee = new Scanner(System.in);
		
		List<Integer> lista =new ArrayList<Integer>();
		
		
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
				
				if(IsNumero.IsInt(opcion))
				{
					lista.add(Integer.parseInt(opcion));
				}
				else
				{
					System.out.println("no es numerico ");
				}
			
			
			
			}
			
			
		}
		
		Collections.sort(lista);
		
		for(int a=0; a<lista.size(); a++)
		{
			System.out.println(lista.get(a));
		}
		
		String opcion=lee.next();
		
		
	}
}

