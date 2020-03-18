package org.loja.controller.subcontroller.jogo;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;

public class FinalizarCompra implements ModelAndView {

	@Override
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String logado = (String) request.getSession().getAttribute("logado");
		if (Objects.nonNull(logado)) {
			return "META-INF/paginas/loja/finalizarcadastro.jsp";
		} else {
			return "META-INF/paginas/autenticacao/authentication.jsp";
		}
		
	}

}
