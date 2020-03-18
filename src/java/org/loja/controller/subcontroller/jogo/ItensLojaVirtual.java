package org.loja.controller.subcontroller.jogo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.carro.MeuCarro;
import org.loja.controller.subcontroller.ModelAndView;
import org.loja.repository.RepositoryJogo;

public class ItensLojaVirtual implements ModelAndView {
	RepositoryJogo rj = new RepositoryJogo();
	@Override
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		try {
			String filtro = request.getParameter("filtro");
	       	request.setAttribute("jogos", rj.getJogos(filtro));
	       	return "META-INF/paginas/loja/loja.jsp";
		} catch (Exception e) {
			return "META-INF/paginas/loja/loja.jsp";
			
		}
        
		
	}

}
