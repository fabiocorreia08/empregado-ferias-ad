package br.com.cmb.efad.service;

import java.util.List;

import br.com.cmb.efad.model.EmpregadoAd;

public interface EmpregadoAdService {
	
	public List<EmpregadoAd> getAll();
	
	public EmpregadoAd getById(long id); 
	
	public void saveOrUpdate(EmpregadoAd empregadoAd); 
		
	public void delete(long id);


}
