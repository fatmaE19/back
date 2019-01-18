package fr.edf.miniZoomBack.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.edf.miniZoomBack.entities.Tranche;
import fr.edf.miniZoomBack.service.TrancheService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/tranches")
@Api(description = "API pour es opérations CRUD sur les tranches.")

public class TrancheController {
    @Autowired
	TrancheService trancheService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public  Tranche add(@RequestBody Tranche tranche) {
		return this.trancheService.add(tranche);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Tranche tranche) {
		this.trancheService.update(tranche);
	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public  List<Tranche> getAll() {
		return this.trancheService.getAll();
	}	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathParam(value="id") Long id) {
		this.trancheService.deleteById(id);
	}	
	
}
