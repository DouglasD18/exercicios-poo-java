public class Main {
  public static String solution(String input) {
		// Inicialização da classe sem atributos no construtor.
		// Para o exercício, deve ser necessário criar o construtor COM PARÂMETROS,
		// mas mantendo o nome da variável como nf.
		private int nf;
		private String desc = new String();
		private int qtde;
		private double precoUnitario;

		

		NotaFiscal nf = new NotaFiscal();

		// Não alterar a linha abaixo:
		return nf.nf_to_string();
	}

	public class NotaFiscal {

		private int nf;
		private String desc;
		private int qtde;
		private double precoUnitario;

		public NotaFiscal(
			int nf,
			String desc,
			int qtde,
			double precoUnitario
		) {
			this.nf = nf;
			this.desc = desc;
			this.qtde = qtde;
			this.precoUnitario = precoUnitario;
		}

		// Insira seu código aqui
		public String nf_to_string() {
			// Insira seu código aqui

			return new String(this.nf + "|" + this.desc + "|" + this.qtde + "|" + this.precoUnitario);
		}
	}
}