class TestePessoa {
	public static void main(String [] args) {
		Pessoa p = new Pessoa();
		p.nome = "Rodrigo";
		p.sobrenome = "Monteiro";
		p.dataNasc = "25/12/1975";
		p.rg = 11111;
		String osTelefones[] = {"1234567", "987654321"};
		p.telefones = osTelefones;
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data nasc.: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones:");
		for (int i=0; i<p.telefones.length; i++) {
			System.out.println("\t" + p.telefones[i]);
		}
	}
}
