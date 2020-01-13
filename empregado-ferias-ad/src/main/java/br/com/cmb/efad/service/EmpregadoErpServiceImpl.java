package br.com.cmb.efad.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cmb.efad.model.EmpregadoErp;
import br.com.cmb.efad.repository.EmpregadoErpRepository;

@Service
@Transactional
public class EmpregadoErpServiceImpl implements EmpregadoErpService{
	
	@Autowired
	EmpregadoErpRepository empregadoErpRepository;

	@Override
	public List<EmpregadoErp> getAll() {
		return (List<EmpregadoErp>) empregadoErpRepository.findAll();
	}

	@Override
	public EmpregadoErp getById(long id) {
		return empregadoErpRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(EmpregadoErp article) {
		empregadoErpRepository.save(article);		
	}

	@Override
	public void delete(long id) {
		empregadoErpRepository.deleteById(id);		
	}

}