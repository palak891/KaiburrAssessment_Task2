package com.kaiburr.Ankit.controller;

import java.util.List;
import java.util.Optional;

import com.kaiburr.Ankit.model.Server;
import com.kaiburr.Ankit.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServerController {

	@Autowired
	private ServerService serverService;

	@GetMapping("/getServers")
	public ResponseEntity<List<Server>> getAllServers() {
		return serverService.getAllServers();
	}

	@GetMapping("/getServers/{id}")
	public ResponseEntity<Optional<Server>> getServerById(@PathVariable("id") long id) {
		return serverService.getServerById(id);
	}

	@PostMapping("/addServer")
	public ResponseEntity<String> addServer(@RequestBody Server server) {
		return addServer(server);
	}

	@DeleteMapping("/deleteServer/{id}")
	public ResponseEntity<String> deleteServer(@PathVariable("id") long id) {
		return deleteServer(id);
	}

	@GetMapping("/getServer/{name}")
	public ResponseEntity<List<Server>> getServer(@PathVariable("name") String name) {
		return serverService.getServerByName(name);
	}
}
