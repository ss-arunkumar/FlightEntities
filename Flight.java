package com.flight_info_sys.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@Column(name = "flightno")
	private String flightno;

	@Column(name = "duration_in_minutes")
	private int duration;

	@Column(name = "departure_time")
	private String deptime;

	@Column(name = "Arraival_time")
	private String artime;

	@Column(name = "aircraft")
	private String aircraft;
	
	@Column(name="fromcity")
	private String fromcity;
	
	@Column(name="tocity")
	private String tocity;

	public String getFromcity() {
		return fromcity;
	}

	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}

	public String getTocity() {
		return tocity;
	}

	public void setTocity(String tocity) {
		this.tocity = tocity;
	}

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "fromcity",
	referencedColumnName = "code",
	insertable = false,updatable = false)
	private City fcity_flight;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "tocity",
	referencedColumnName = "code",
	insertable = false,updatable = false)
	private City tcity_flight;

	@OneToMany(mappedBy = "schflight")
	@JsonIgnore
	private List<ScheduledFlight> schfli_f;

	@OneToMany(mappedBy = "flightflighthistory")
	@JsonIgnore
	private List<FlightsHistory> fhf;

	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDeptime() {
		return deptime;
	}

	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}

	public String getArtime() {
		return artime;
	}

	public void setArtime(String artime) {
		this.artime = artime;
	}

	public void setSchfli_f(List<ScheduledFlight> schfli_f) {
		this.schfli_f = schfli_f;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public City getFcity_flight() {
		return fcity_flight;
	}

	public void setFcity_flight(City fcity_flight) {
		this.fcity_flight = fcity_flight;
	}

	public City getTcity_flight() {
		return tcity_flight;
	}

	public void setTcity_flight(City tcity_flight) {
		this.tcity_flight = tcity_flight;
	}

	public List<ScheduledFlight> getSchfli_f() {
		return schfli_f;
	}

	public void sdeptimeetSchfli_f(List<ScheduledFlight> schfli_f) {
		this.schfli_f = schfli_f;
	}

	public List<FlightsHistory> getFhf() {
		return fhf;
	}

	public void setFhf(List<FlightsHistory> fhf) {
		this.fhf = fhf;
	}

	
	

}
