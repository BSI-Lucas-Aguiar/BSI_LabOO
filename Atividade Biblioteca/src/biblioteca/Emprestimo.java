package biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Emprestimo extends DomainObject{

	private Date inicio;
	private Date previsaoEntrega;
	private Date entrega;
	
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public Emprestimo(long id, Date inicio, Date previsaoEntrega, Date entrega) {
		super(id);
		this.inicio = inicio;
		this.previsaoEntrega = previsaoEntrega;
		this.entrega = entrega;
	}
	
	public int obterDiasEmAtraso() {
		int diasEmAtraso;
		
		String dataInicio = dateFormat.format(this.inicio);
		String dataPrevisaoEntrega = dateFormat.format(this.previsaoEntrega);
		
		LocalDate inicio = LocalDate.parse(dataInicio);
		LocalDate previsaoEntrega = LocalDate.parse(dataPrevisaoEntrega);
		
		diasEmAtraso = (int) ChronoUnit.DAYS.between(inicio, previsaoEntrega);
		
		return diasEmAtraso;
	}
}
