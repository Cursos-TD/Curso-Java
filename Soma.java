import static javax.swing.JOptionPane.*;

public class Soma
{
	public static void main(String[] args)
	{
		String primeiroValor = showInputDialog("Digite o primeiro valor.");
		String segundoValor  = showInputDialog("Digite o segundo valor.");

		int primeiro = Integer.parseInt(primeiroValor);
		int segundo  = Integer.parseInt(segundoValor);

		int soma = primeiro + segundo;

		showMessageDialog(null,"O resultado é:" + soma);
	}
}