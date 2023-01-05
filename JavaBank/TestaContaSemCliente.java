
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaBia = new Conta();
		System.out.println(contaDaBia.getSaldo());
		
		contaDaBia.titular = new Cliente();
		
		
		contaDaBia.titular.nome = "Bianca";
		System.out.println(contaDaBia.titular.nome);
			
	}
}
