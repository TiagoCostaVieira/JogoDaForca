import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[] palavras = {"java", "programacao", "computador", "algoritmo", "desenvolvedor"};
        String palavraSorteada = palavras[(int) (Math.random() * palavras.length)];
        
        char[] letrasCertas = new char[palavraSorteada.length()];
        for (int i = 0; i < letrasCertas.length; i++) {
            letrasCertas[i] = '_';
        }
        
        int erros = 0;
        
        while (erros < 6) {
            System.out.println("Palavra: " + String.valueOf(letrasCertas));
            System.out.print("Digite uma letra: ");
            String letraDigitada = scanner.nextLine();
            
            if (palavraSorteada.contains(letraDigitada)) {
                for (int i = 0; i < palavraSorteada.length(); i++) {
                    if (palavraSorteada.charAt(i) == letraDigitada.charAt(0)) {
                        letrasCertas[i] = letraDigitada.charAt(0);
                    }
                }
            } else {
                erros++;
                System.out.println("Você errou! Tentativas restantes: " + (6 - erros));
            }
            
            if (String.valueOf(letrasCertas).equals(palavraSorteada)) {
                System.out.println("Parabéns, você ganhou!");
                return;
            }
        }
        
        System.out.println("Você perdeu! A palavra era " + palavraSorteada);
    }

}
