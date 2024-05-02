package br.com.minhaloja.main;
import java.util.Scanner;
import br.com.minhaloja.model.Aluno;
import br.com.minhaloja.model.Compra;
import br.com.minhaloja.model.Cupom;
import br.com.minhaloja.model.Disciplina;


public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: "); 
        String nome = scanner.nextLine();
		System.out.print("Digite o documento do aluno: "); 
        String doc = scanner.nextLine(); 
        System.out.print("Digite o nome da disciplina: "); 
        String nome_disciplina = scanner.nextLine();
		System.out.print("Digite o codigo da disciplina : "); 
        int cod_disciplina = scanner.nextInt(); 
        scanner.nextLine(); 
        scanner.close(); 
        var aluno = new Aluno(nome,doc);
        var disciplina = new Disciplina(nome_disciplina, cod_disciplina);
		disciplina.setAluno(aluno); 
        System.out.println(disciplina);
		var cupom = new Cupom(5.0, 111);
		var compra = new Compra("Caderno", 39.99, 1);
		compra.finalizar(cupom);
        scanner.close();
    }
}
