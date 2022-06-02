package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.JogoDAO;
import variaveis.Jogovar;

@ManagedBean
public class jogoBean {
	private Jogovar jogovar = new Jogovar();
	
	
	
	public String Salvar() {
		JogoDAO.salvar(jogovar);
		return null;
	}
	
	public String Editar() {
		JogoDAO.editar(jogovar);
		return null;
	}
	
	public String excluir() {
		JogoDAO.deletar(jogovar);
		return null;
	}
	
}
