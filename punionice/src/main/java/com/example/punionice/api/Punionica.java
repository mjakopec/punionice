package com.example.punionice.api;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Punionica {
	
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Id 
	private Long pk_id;
	private Long ID;
	private String UUID;
	private String Latitude;
    private String Longitude;
	
	public Long getID() {return ID;}
	public String getUUID() {return UUID;}
	public String getLatitude() {return Latitude;}
	public String getLongitude() {return Longitude;}
	public void setID(Long iD) {ID = iD;}
	public void setUUID(String Uuid) {UUID = Uuid;}
	public void setLatitude(String LAtitude) {Latitude = LAtitude;}
	public void setLongitude(String LOngitude) {Longitude = LOngitude;}
	/*private Long ID;
	private String UUID;
	private String latitude;
    private String longitude;
	*/
	/*private Long Id;
	private String UIID;
    private String latitude;
    private String longitude;
	@Embedded
	private Address address;
	@Embedded
	private Connections connections;
*/

	/*public Long getID() {return ID;}
	public String getUUID() {return UUID;}
	public String getLatitude() {return latitude;}
	public String getLongitude() {return longitude;}
	
	//public void setID(Long iD) {ID = iD;}
	public void setUUID(String uUID) {UUID = uUID;}
	public void setLatitude(String latitude) {this.latitude = latitude;}
	public void setLongitude(String longitude) {this.longitude = longitude;}
	*/
	public Punionica() {}
}
