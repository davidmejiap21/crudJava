package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.Persona;

@Repository
public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	Optional<Persona> listarId();
	
}
