package teste;

import infra.DAO;
import modelo.Jogos;

public class JogosTeste {
	public static void main(String[] args) {
		
		DAO<Jogos> dao = new DAO(Jogos.class);
		
		Jogos jogo = dao.obterPorId(1L);
		
		
		System.out.printf("Nome do jogo: %s \n ID: %d \n", jogo.getNome(), jogo.getId());
		
		dao.fecharT();
		dao.fechar();
	}
}
