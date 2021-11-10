public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;


	public  Conta(int agencia, int numero){
		Conta.total ++;
		System.out.println("O TOTAL DE CONTAS É " +total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou Criando uma conta" + this.numero);
	}


	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {

		if (numero <=0 ){
			System.out.println("Erro o valor não pode ser menor do que 0");
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0 ){
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}

		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public int getTotal(){
		return Conta.total;
	}
}