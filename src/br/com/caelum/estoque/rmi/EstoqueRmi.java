package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;

public interface EstoqueRmi {

	public ItemEstoque getItemEstoque(String codigoProduto)
			throws RemoteException;
}
