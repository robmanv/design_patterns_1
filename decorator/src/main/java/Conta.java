import java.util.Date;

public class Conta {
	private String titular;
	private double saldo;
	private Date dataAbertura;

	public Conta() {

	}

	public Conta(String titular, double saldo, Date dataAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {

		return this.saldo;
	}

	public String getTitular() {

		return titular;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	@Override
	public String toString() {
		return "Conta{" +
				"titular='" + titular + '\'' +
				", saldo=" + saldo +
				", dataAbertura=" + dataAbertura +
				'}';
	}
}