package exercicio_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Inicio{
	public static void main(String args[]){
	File arquivo = new File("C:\\Rodrigo.txt");
	
	String linha;
	
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));
	while (br.ready()) {  
		linha = br.readLine();  
		System.out.println(linha);
		}  
		br.close();
	}
	catch(Exception e){
		System.out.println("O arquivo não foi localizado");

	}
	int soma;
	soma=1+2+3;
	System.out.println("::"+soma)
}
}

