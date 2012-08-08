class Pessoa {
	long rg;
	String nome;
	String sobrenome;
	String dataNasc;
	String[] telefones;
	
	int qtdTelefones() {
		return telefones.length;
	}
	
	String nomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	void exibir() {
		System.out.println("Nome: " + nomeCompleto());
		System.out.println("Data nasc.: " + dataNasc);
		System.out.println("RG: " + rg);
		System.out.println("Telefones (" + qtdTelefones() + "):");
		for (int i=0; i<telefones.length; i++) {
			System.out.println("\t" + telefones[i]);
		}
	}
}
