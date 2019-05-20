package br.com.fiap.test;

import br.com.fiap.dao.IotDAO;
import br.com.fiap.dao.impl.IotDAOImpl;
import br.com.fiap.entity.Iot;
import br.com.fiap.excepiton.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Test {
	public static void main(String argsp[]) {
		IotDAO dao = new IotDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());
		
		Iot iot = new Iot("80%", "23º");
		Iot iot2 = new Iot("40%", "28º");
		Iot iot3 = new Iot("95%", "10º");
		Iot iot4 = new Iot("10%", "35º");
		dao.cadastrar(iot);
		dao.cadastrar(iot2);
		dao.cadastrar(iot3);
		dao.cadastrar(iot4);
		try {
			dao.commit();
		} catch (CommitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
