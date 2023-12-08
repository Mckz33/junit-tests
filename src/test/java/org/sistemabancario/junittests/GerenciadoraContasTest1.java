package org.sistemabancario.junittests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * sobre contas, realizadas pela classe {@link GerenciadoraContas}
 * 
 * @author Clayton Chagas
 * @date 25/08/2023
 * 
 */
public class GerenciadoraContasTest1 {
	
	/**
	 * Função para fazer o teste básico de transferência bancária de um valor de uma conta
	 * de origem para uma conta de destino
	 * 
	 * @author Clayton Chagas
	 * @date 25/08/2023
	 */
	@Test
	public void testTransfereValor(){
		/*=====Montagem do cenário de teste=====*/
		ContaCorrente conta01 = new ContaCorrente(1, 200, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		List<ContaCorrente> contasDoBanco = new ArrayList<ContaCorrente>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		/*========Preparação para execução========*/
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		/*========Execução da regra de negócio a ser testada========*/
		boolean resultadoTranferencia =  gerContas.transfereValor(1, 50, 2);
		
		/*=====Execução dos testes pelo JUnit para Análises e Verificações=====*/
		//assertThat(resultadoTranferencia, is(true)); //é a mesma coisa que a linha 48
		assertTrue(resultadoTranferencia);
		assertThat(conta01.getSaldo(), is(150.0));
		assertThat(conta02.getSaldo(), is(50.0));
		
		
		
		
		
		
		
		
	}

}
