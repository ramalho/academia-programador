class Data {
	long rg;
	int dia;
	int mes;
	int ano;
	
	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}
	
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}
