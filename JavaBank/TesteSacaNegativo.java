
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta alemao = new Conta();
		alemao.deposita(100);
		System.out.println(alemao.saca(101));
		
		alemao.saca(101);
		
		System.out.println(alemao.getSaldo());
		
		
	}
}
