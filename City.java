package com.flight_info_sys.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//city entity for flight information system
@Entity
@Table(name = "city")
public class City {

	@Id
	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Column(name = "minutes_from_utc")
	private Integer minute;

	@Column(name = "country")
	private String country;

	@OneToMany(mappedBy = "tcity_flight")
	@JsonIgnore
	private List<Flight> flightst;

	@OneToMany(mappedBy = "fcity_flight")
	@JsonIgnore
	private List<Flight> flightsf;

	@OneToMany(mappedBy = "tocitysf")
	@JsonIgnore
	private List<ScheduledFlight> tocity;

	@OneToMany(mappedBy = "fromcitysf")
	@JsonIgnore
	private List<ScheduledFlight> fromcity;

	@OneToMany(mappedBy="tcityfh")
	@JsonIgnore
	private List<FlightsHistory> fhc_to;
	
	@OneToMany(mappedBy = "fcityfh")
	@JsonIgnore
	private List<FlightsHistory> fhc_from;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Flight> getFlightst() {
		return flightst;
	}

	public void setFlightst(List<Flight> flightst) {
		this.flightst = flightst;
	}

	public List<Flight> getFlightsf() {
		return flightsf;
	}

	public void setFlightsf(List<Flight> flightsf) {
		this.flightsf = flightsf;
	}

	public List<ScheduledFlight> getTocity() {
		return tocity;
	}

	public void setTocity(List<ScheduledFlight> tocity) {
		this.tocity = tocity;
	}

	public List<ScheduledFlight> getFromcity() {
		return fromcity;
	}

	public void setFromcity(List<ScheduledFlight> fromcity) {
		this.fromcity = fromcity;
	}

	public List<FlightsHistory> getFhc_to() {
		return fhc_to;
	}

	public void setFhc_to(List<FlightsHistory> fhc_to) {
		this.fhc_to = fhc_to;
	}

	public List<FlightsHistory> getFhc_from() {
		return fhc_from;
	}

	public void setFhc_from(List<FlightsHistory> fhc_from) {
		this.fhc_from = fhc_from;
	}

	
}
