package projetoExceptions;
import java.util.Scanner;

public class SenhaTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Crie uma senha de no minimo 6 caracteres que contenha letras e números : ");
		String senha = input.next();

	        try {
	        	verificarSenha(senha);
	            System.out.println("A senha é valida!");
	        } catch (SenhaInvalidaException e) {
	            System.out.println("A senha é inválida! " + e.getMessage());
	        }
	    }
		
    public static void verificarSenha(String senha) throws SenhaInvalidaException {
        boolean possuiNumeros = false;
        boolean possuiLetras = false;
        boolean tamanhoMin = false;

        for (int i=0; i<senha.length(); i++) {
        	char c = senha.charAt(i);
            if (Character.isDigit(c)) {
                possuiNumeros = true;
            } else if (Character.isLetter(c)) {
                possuiLetras = true;
            }
            if (i>=5) {
            	tamanhoMin = true;
            }
        }

        if (!possuiNumeros || !possuiLetras || !tamanhoMin) {
            throw new SenhaInvalidaException("A senha deve conter números e letras, além de no minimo 6 cacteres.");
        }
    }
    
}











