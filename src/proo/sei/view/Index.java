package proo.sei.view;

import java.sql.SQLException;

public class Index {

	public static void main(String[] args) throws SQLException { 
		Sessao sessaoVO = new Sessao();
		
		boolean statusSessao;
		
		do {
			statusSessao = sessaoVO.iniciarSessao();
			
			if (statusSessao) {
				sessaoVO.getSessaoBO().getUsuarioBOAtual().menu(sessaoVO.getSessaoBO().getConexao());
			}
		} while (statusSessao);
	}
}
