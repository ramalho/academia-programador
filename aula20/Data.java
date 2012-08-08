class Data {
	int dia;
	int mes;
	int ano;
	
	/* método construtor */
	Data(int oDia, int oMes, int oAno) {
		dia = oDia;
		mes = oMes;
		ano = oAno;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	boolean ehAnoBissexto() {
		if (((ano % 4 == 0) && !(ano % 100 == 0)) ||
			(ano % 400 == 0))
			return true;
		else
			return false;
	}
	
}
