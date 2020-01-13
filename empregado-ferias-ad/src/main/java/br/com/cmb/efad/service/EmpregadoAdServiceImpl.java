package br.com.cmb.efad.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cmb.efad.model.EmpregadoAd;
import br.com.cmb.efad.repository.EmpregadoAdRepository;

@Service
@Transactional
public class EmpregadoAdServiceImpl implements EmpregadoAdService{
	
	@Autowired
	EmpregadoAdRepository empregadoAdRepository;

	@Override
	public List<EmpregadoAd> getAll() {
		return (List<EmpregadoAd>) empregadoAdRepository.findAll();
	}

	@Override
	public EmpregadoAd getById(long id) {
		return empregadoAdRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(EmpregadoAd empregadoAd) {
		empregadoAdRepository.save(empregadoAd);		
	}

	@Override
	public void delete(long id) {
		empregadoAdRepository.deleteById(id);		
	}

}