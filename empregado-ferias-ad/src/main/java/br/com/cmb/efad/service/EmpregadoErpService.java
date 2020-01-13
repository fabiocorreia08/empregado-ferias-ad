package br.com.cmb.efad.service;

import java.util.List;

import br.com.cmb.efad.model.EmpregadoErp;

public interface EmpregadoErpService {
	
	public List<EmpregadoErp> getAll();
	
	public EmpregadoErp getById(long id); 
	
	public void saveOrUpdate(EmpregadoErp article); 
		
	public void delete(long id);


}
