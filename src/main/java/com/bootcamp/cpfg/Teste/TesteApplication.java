package com.bootcamp.cpfg.Teste;

import com.opencsv.CSVReader;
import com.sun.source.tree.TryTree;
import entities.Cpgf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) throws IOException {

		java.lang.String importação;
		double transacaoConvertida = 0;
		double somaT = 0;
		double somaS = 0;

		String path	= "\\C:\\Users\\joaov\\Desktop\\202110_CPGF.csv4.txt";

		List<Cpgf> list = new ArrayList<Cpgf>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			String[] vect = new String[0];
			while (line != null) {

				vect = line.split(";");
				String codigoOrgaoS = vect[0];
				String nomeOrgaoS = vect[1];
				String codigoOrgao = vect[2];
				String nomeOrgao = vect[3];
				String codigoUnidadeG = vect[4];
				String nomeUnidadeG = vect[5];
				String anoExtrato = vect[6];
				String mesExtrato = vect[7];
				String cpfPortador = vect[8];
				String nomePortador = vect[9];
				String cnpjCpfFavorecido = vect[10];
				String nomeFavorecido = vect[11];
				String transacao = vect[12];
				String dataTransacao = vect[13];
				String valorTransacao = vect[14];

				String result = valorTransacao.replaceAll("^[\"']+|[\"']+$", "");
				transacaoConvertida = Double.parseDouble(result.replaceAll(",", "."));

				Cpgf cpgf = new Cpgf(codigoOrgaoS, nomeOrgaoS, codigoOrgao, nomeOrgao, codigoUnidadeG, nomeUnidadeG, anoExtrato, mesExtrato, cpfPortador, nomePortador, cnpjCpfFavorecido, nomeFavorecido, transacao, dataTransacao, valorTransacao);
				list.add(cpgf);

				line = br.readLine();

				somaT = transacaoConvertida + somaT;

				System.out.println(vect[9]);

			}

			//K) Soma total das movimentações:
			System.out.println("K) – Qual a soma total das movimentações utilizando o CPGF? ");
			System.out.println("A soma de todas movimentações é: " + somaT);
			System.out.println("======================================================");
			//L) Soma das movimentações sigilosas:
			System.out.println("L) - Qual a soma das movimentações sigilosas ?");
			System.out.println("A soma das movimentações sigilosas é: " + somaS);


			//System.out.println("CPGF: ");
			//for (Cpgf c : list) {
				//System.out.println(c);
			//}

		}catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}

