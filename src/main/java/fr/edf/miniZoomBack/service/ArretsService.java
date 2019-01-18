package fr.edf.miniZoomBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.edf.miniZoomBack.entities.Arret;
import fr.edf.miniZoomBack.repositories.ArretRepository;

@Service
public class ArretsService {
	@Autowired
	ArretRepository arretRepository;

	public   Arret add(Arret arret) {
		return this.arretRepository.save(arret);
	}

	public List<Arret> getAll() {
		return this.arretRepository.findAll();
	}

	public Arret update(Arret arret) {
		return this.arretRepository.saveAndFlush(arret);
	}

	public void deleteById(Long id) {
		this.arretRepository.deleteById(id);
	}
}
