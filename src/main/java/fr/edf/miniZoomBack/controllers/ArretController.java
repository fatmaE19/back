package fr.edf.miniZoomBack.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.edf.miniZoomBack.entities.Arret;
import fr.edf.miniZoomBack.service.ArretsService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/arrets")
@Api( description="API pour es opérations CRUD sur les arrets.")
public class ArretController {

	@Autowired
	ArretsService arretsService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public   Arret add(@RequestBody Arret arret) {
		return this.arretsService.add(arret);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Arret arret) {
		  this.arretsService.update(arret);
	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public   List<Arret> getAll() {
		return this.arretsService.getAll();
	}	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathParam(value="id") Long id) {
		this.arretsService.deleteById(id);
	}	
	
	
}

 
 
 