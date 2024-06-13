using System;

public class Program
{
	public static int somaImpar(int inicio, int fim)
	{
		int sum = 0;
		for (int i = inicio; i <= fim; i++)
			if (i % 2 != 0)
				sum += i;
		return sum;
	}
	
	public static void Main()
	{
		int soma = somaImpar(100, 200);
		Console.WriteLine(soma);
	}
}
