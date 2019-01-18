package fr.edf.miniZoomBack.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.edf.miniZoomBack.entities.Cycle;
import fr.edf.miniZoomBack.service.CycleService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/cycles")
@Api( description="API pour es opérations CRUD sur les cycles.")
public class CycleController {
	@Autowired
	CycleService cycleService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public   Cycle add(@RequestBody Cycle cycle) {
		return this.cycleService.add(cycle);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Cycle cycle) {
		  this.cycleService.update(cycle);
	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public   List<Cycle> getAll() {
		return this.cycleService.getAll();
	}	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathParam(value="id") Long id) {
		this.cycleService.deleteById(id);
	}	
	
}
