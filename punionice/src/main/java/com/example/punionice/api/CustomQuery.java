package com.example.punionice.api;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomQuery extends CrudRepository<Punionica,Long>{
/*@Query(value="SELECT p FROM punionica p WHERE (p.postcode = :city "
		+ "OR p.town = :city) and (p.powerkw>avg(p.powerkw) or not(:power))",nativeQuery = true)*/

	/*ovo radi
	 * @Query("SELECT p FROM Punionica p WHERE p.pk_id < 20")
	 */
		
	/* i ovo radi*/
	  @Query("SELECT p.pk_id,p.UUID,p.AddressInfo.town, c.PowerKW "
			+ " FROM Punionica p  JOIN p.Connections c "
			+ "WHERE (p.AddressInfo.postcode = '52424' OR p.AddressInfo.town='52424' OR 1=1) "
			+ "and (c.PowerKW > (SELECT avg(c.PowerKW) FROM Punionica p  JOIN p.Connections c)) ")
	Iterable<Punionica> list_specific();
}