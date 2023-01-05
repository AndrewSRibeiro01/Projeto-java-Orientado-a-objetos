
public class TestaBanco {

	public static void main(String[] args) {
		Cliente Andrew = new Cliente();
		Andrew.nome = "Andrew Souza";
		Andrew.cpf = "333.333.333.33";
		Andrew.profissao = "Programador";

		Conta contaDoAndew = new Conta();
		contaDoAndew.deposita(100);
		
		contaDoAndew.titular = Andrew;
		System.out.println(contaDoAndew.titular.nome);
	}
}
