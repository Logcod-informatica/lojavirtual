package org.loja.controller.subcontroller.pessoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.loja.controller.subcontroller.ModelAndView;
import org.loja.entity.Pessoa;
import org.loja.repository.RepositoryPessoa;

public class EditarPessoa implements ModelAndView {
   RepositoryPessoa rp = new RepositoryPessoa();
	@Override
	public String setViewName(HttpServletRequest request, HttpServletResponse response) {
		Integer idPessoa = Integer.valueOf(request.getParameter("idPessoa"));
		Pessoa pessoa = rp.getPessoa(idPessoa);
		request.setAttribute("pessoa", pessoa);
		return "META-INF/paginas/pessoas/formpessoa.jsp";
	}

}
