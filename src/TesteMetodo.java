
public class TesteMetodo {

	public static void main(String[] args) {
		Conta contaDoAndrew = new Conta();
		contaDoAndrew.saldo = 100;
		contaDoAndrew.deposita(50);
		System.out.println(contaDoAndrew.saldo);
		
		boolean conseguiuRetirar = contaDoAndrew.saca(20);
		System.out.println(contaDoAndrew.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaBia = new Conta();
		contaDaBia.deposita(1000);
		
		if (contaDaBia.transfere(300, contaDoAndrew)) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaBia.saldo);
		System.out.println(contaDoAndrew.saldo);

		contaDoAndrew.titular = "Andrew de Souza";
		System.out.println(contaDoAndrew.titular);		
		
	}


}
