
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumber());
		
		Cliente Andrew = new Cliente();
		
		Andrew.setNome("Andrew Souza");
		
		conta.setTitular(Andrew);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
	}
}
