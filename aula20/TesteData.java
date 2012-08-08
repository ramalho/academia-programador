public class TesteData {
	public static void main(String[] args) {
		Data d1 = new Data(1, 1, 2011);
		System.out.println(d1 + " bissexto: " + d1.ehAnoBissexto());

		d1 = new Data(1, 1, 2012);
		System.out.println(d1 + " bissexto: " + d1.ehAnoBissexto());

		d1 = new Data(1, 1, 2000);
		System.out.println(d1 + " bissexto: " + d1.ehAnoBissexto());

		d1 = new Data(1, 1, 1900);
		System.out.println(d1 + " bissexto: " + d1.ehAnoBissexto());
	}
}
