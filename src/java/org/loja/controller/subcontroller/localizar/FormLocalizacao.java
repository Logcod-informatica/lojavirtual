package org.loja.controller.subcontroller.localizar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;

public class FormLocalizacao implements ModelAndView {

	@Override
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		
		return "META-INF/paginas/enderecos/form-localizacao.jsp";
	}

}
