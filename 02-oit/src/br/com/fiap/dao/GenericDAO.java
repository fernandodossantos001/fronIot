package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.excepiton.CodigoInvalidoException;
import br.com.fiap.excepiton.CommitException;

public interface GenericDAO<T,K> {
	
	void cadastrar(T entidade);
	void alterar(T entidade);
	T buscar(K id) throws CodigoInvalidoException;
	void remover (K id) throws CodigoInvalidoException;
	void commit()throws CommitException;
	List<T> listar();
	
	
}	
