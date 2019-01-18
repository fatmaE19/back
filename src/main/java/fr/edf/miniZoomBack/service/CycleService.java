package fr.edf.miniZoomBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.edf.miniZoomBack.entities.Cycle;
import fr.edf.miniZoomBack.repositories.CycleRepository;

@Service
public class CycleService {
	@Autowired
	CycleRepository cycleRepository;

	public   Cycle add(Cycle cycle) {
		return this.cycleRepository.save(cycle);
	}

	public List<Cycle> getAll() {
		return this.cycleRepository.findAll();
	}

	public Cycle update(Cycle cycle) {
		return this.cycleRepository.saveAndFlush(cycle);
	}

	public void deleteById(Long id) {
		this.cycleRepository.deleteById(id);
	}
}
