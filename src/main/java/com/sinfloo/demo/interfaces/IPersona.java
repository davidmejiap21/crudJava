package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.sinfloo.demo.modelo.Persona;

public interface IPersona extends CrudRepository <Persona, Integer> {

}
