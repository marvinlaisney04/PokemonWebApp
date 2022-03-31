/**
 * 
 */
package com.pokemon.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.app.model.Pokemon;

/**
 * @author marvin
 *
 */
@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long>{

}
