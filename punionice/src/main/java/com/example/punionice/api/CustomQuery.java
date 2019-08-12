package com.example.punionice.api;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomQuery extends CrudRepository<Punionica,Long>{
	  @Query("SELECT p.pk_id,p.UUID,p.AddressInfo.town, c.PowerKW "
			+ "FROM Punionica p  JOIN p.Connections c "
			+ "WHERE (p.AddressInfo.postcode = :city OR p.AddressInfo.town= :city) "
			+ "AND ((c.PowerKW > (SELECT avg(c.PowerKW) FROM Punionica p  JOIN p.Connections c)) OR (:power > 0))")
	Iterable<Punionica> list_specific(String city,Integer power);
}