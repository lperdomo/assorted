using System;

public class Program
{
	public static (int, int) somaMult(int valor1, int valor2)
	{
		int soma = valor1 + valor2;
		int mult = valor1 * valor2;
		return (soma, mult);
	}
	
	public static void Main()
	{
		var resultados = somaMult(5, 4);
		Console.WriteLine(resultados.Item1);
		Console.WriteLine(resultados.Item2);
	}
}
