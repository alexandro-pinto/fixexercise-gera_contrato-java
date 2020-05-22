package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Dados do Contrato");
		System.out.print("Numero: ");
		int numContrato = sc.nextInt();
		System.out.print("Data (dd/mm/aaaa) : ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Digite o numero de parcelas: ");
		int qtdParcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(numContrato, data, valor, qtdParcelas);
		
		System.out.println();
		System.out.println("Parcelas");
		for (Parcela parc : contrato.getParcelas()) {
			System.out.println( sdf.format(parc.getData()) + " - " + String.format("%.2f", parc.getParcela()));
		}
		
		sc.close();
	}
}
