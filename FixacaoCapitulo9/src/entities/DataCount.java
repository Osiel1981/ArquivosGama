package entities;

public class DataCount {
	private final int NUMEROCONTA;
	private String nomeCliente;
	private double saldo;
	
	public DataCount(int NUMEROCONTA, String nomeCliente, double depositoInicial) {
		this.NUMEROCONTA = NUMEROCONTA;
		this.nomeCliente = nomeCliente;
		this.saldo = (depositoInicial);
		
		}

	public DataCount(int NUMEROCONTA, String nomeCliente) {
		this.NUMEROCONTA = NUMEROCONTA;
		this.nomeCliente = nomeCliente;
		}
	
	
	public int getNUMEROCONTA() {
		return NUMEROCONTA;
	}
	
		
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void getDeposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= saque + 5.00;
	}

	public String toString() {
		return "Dados da conta:" 
			+ "Numero conta: "
			+ getNUMEROCONTA()
			+ " Nome cliente: " 
			+ getNomeCliente() 
			+ ", Saldo: $" 
			+ String.format("%.2f", getSaldo());
	}
	
}
