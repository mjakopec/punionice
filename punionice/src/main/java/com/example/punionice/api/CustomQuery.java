package com.example.punionice.api;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;;

public interface CustomQuery extends CrudRepository<Punionica,Long>{
@Query(value="SELECT * FROM punionica p WHERE (p.postcode = :city "
		+ "OR p.town = :city) and (p.powerkw>avg(p.powerkw) or not(:power))",nativeQuery = true)
Iterable<Punionica> findBySpecial(String city,boolean power);
}