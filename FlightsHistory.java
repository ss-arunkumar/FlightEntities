package com.flight_info_sys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "flighthistory")
public class FlightsHistory {

	@EmbeddedId
	private FlightKey flightkeyfh;

	@Column(name = "departure_time")
	private String arivaltimefh;

	@Column(name = "arrival_date")
	private String arraivaldate_fh;

	@Column(name = "arrival_time")
	private String arraivaltimefh;

	@Column(name = "duration_in_minutes")
	private int duration;

	@Column(name = "aircraft")
	private String aircraft_fh;

	@Column(name = "remarks")
	private String remarks;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="flightno",insertable = false,updatable = false)
	private Flight flightflighthistory;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "fromcity", referencedColumnName = "code")
	private City fcityfh;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "tocity", referencedColumnName = "code")
	private City tcityfh;

	public FlightKey getFlightkeyfh() {
		return flightkeyfh;
	}

	public void setFlightkeyfh(FlightKey flightkeyfh) {
		this.flightkeyfh = flightkeyfh;
	}

	
	public String getArivaltimefh() {
		return arivaltimefh;
	}

	public void setArivaltimefh(String arivaltimefh) {
		this.arivaltimefh = arivaltimefh;
	}

	public String getArraivaldate_fh() {
		return arraivaldate_fh;
	}

	public void setArraivaldate_fh(String arraivaldate_fh) {
		this.arraivaldate_fh = arraivaldate_fh;
	}

	

	public String getArraivaltimefh() {
		return arraivaltimefh;
	}

	public void setArraivaltimefh(String arraivaltimefh) {
		this.arraivaltimefh = arraivaltimefh;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getAircraft_fh() {
		return aircraft_fh;
	}

	public void setAircraft_fh(String aircraft_fh) {
		this.aircraft_fh = aircraft_fh;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

	public Flight getFlightflighthistory() {
		return flightflighthistory;
	}

	public void setFlightflighthistory(Flight flightflighthistory) {
		this.flightflighthistory = flightflighthistory;
	}

	public City getFcityfh() {
		return fcityfh;
	}

	public void setFcityfh(City fcityfh) {
		this.fcityfh = fcityfh;
	}

	public City getTcityfh() {
		return tcityfh;
	}

	public void setTcityfh(City tcityfh) {
		this.tcityfh = tcityfh;
	}

	
	

}
