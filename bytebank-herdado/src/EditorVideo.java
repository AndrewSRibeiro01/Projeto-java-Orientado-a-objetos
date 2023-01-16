
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Chama o metodo de bonificacao do editor de video");
		return super.getBonificacao() + 100; 
	}
	
	
}
