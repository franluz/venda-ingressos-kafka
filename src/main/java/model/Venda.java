package model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Venda {

	private Long operacao;
	private Long cliente;
	private Integer quantidadeIngressos;
	private BigDecimal valorTotal;
	private String status;
	
 
	
	public Venda(Long operacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal) {
		this.operacao = operacao;
		this.cliente = cliente;
		this.quantidadeIngressos = quantidadeIngressos;
		this.valorTotal = valorTotal;
	}
	
}
