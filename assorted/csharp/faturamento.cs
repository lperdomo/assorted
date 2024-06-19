using System;
using System.Collections.Generic;
using System.Linq;
					
public class Program
{
	public static float menorFaturamentoAno(List<float> faturamentoAno)
	{
		return faturamentoAno.Min();
	}
	
	public static float maiorFaturamentoAno(List<float> faturamentoAno)
	{
		return faturamentoAno.Max();
	}
	
	public static int totalDiasSuperiorMediaFaturamentoAno(List<float> faturamentoAno)
	{
		List<float> faturamentoAnoMedia = faturamentoAno.Where(i => i != 0).ToList();
		float media = faturamentoAnoMedia.Average();
		List<float> faturamentoAnoAcimaMedia = faturamentoAnoMedia.Where(i => i > media).ToList();
		return faturamentoAnoAcimaMedia.Count;
	}
	
	public static void Main()
	{
		List<float> faturamentoAno = new List<float>() {5, 10, 6, 3, 2, 0, 0, 4, 8, 5, 7, 3, 0};
		Console.WriteLine(Program.menorFaturamentoAno(faturamentoAno));
		Console.WriteLine(Program.maiorFaturamentoAno(faturamentoAno));
		Console.WriteLine(Program.totalDiasSuperiorMediaFaturamentoAno(faturamentoAno));
	}
}
