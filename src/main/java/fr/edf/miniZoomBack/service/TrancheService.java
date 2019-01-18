package fr.edf.miniZoomBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.edf.miniZoomBack.entities.Tranche;
import fr.edf.miniZoomBack.repositories.TrancheRepository;

@Service
public class TrancheService {

	@Autowired
	TrancheRepository trancheRepository;

	public   Tranche add(Tranche tranche) {
		return this.trancheRepository.save(tranche);
	}

	public List<Tranche> getAll() {
		return this.trancheRepository.findAll();
	}

	public Tranche update(Tranche tranche) {
		return this.trancheRepository.saveAndFlush(tranche);
	}

	public void deleteById(Long id) {
		this.trancheRepository.deleteById(id);
	}
}
