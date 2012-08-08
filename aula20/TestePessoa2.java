class TestePessoa2 {
	public static void main(String [] args) {
		Pessoa2 p = new Pessoa2();
		p.nome = "Rodrigo";
		p.sobrenome = "Monteiro";
		p.dataNasc = new Data();
		p.dataNasc.inicializar(25, 12, 1975);
		p.rg = 11111;
		String osTelefones[] = {"1234567", "987654321"};
		p.telefones = osTelefones;
		p.exibir();
	}
}
