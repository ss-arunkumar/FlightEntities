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
@Table(name = "scheduledflight")
public class ScheduledFlight {

	@EmbeddedId
	private FlightKey flightkeysf;

	@Column(name = "departure_time")
	private String deptime;

	@Column(name = "arrival_date")
	private String arrdate_sf;

	@Column(name = "arrival_time")
	private String arrtime_sf;

	@Column(name = "duration_in_minutes")
	private int sf_duration;

	@Column(name = "fromcity")
	private String fromcity;

	@Column(name = "tocity")
	private String tocity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "fromcity", insertable = false, updatable = false)
	private City fromcitysf;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "tocity", insertable = false, updatable = false)
	private City tocitysf;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "flightno", insertable = false, updatable = false)
	private Flight schflight;

	public FlightKey getFlightkeysf() {
		return flightkeysf;
	}

	public void setFlightkeysf(FlightKey flightkeysf) {
		this.flightkeysf = flightkeysf;
	}

	public String getDeptime() {
		return deptime;
	}

	public void setDeptime(String deptime) {
		this.deptime = deptime;
	}

	public String getArrdate_sf() {
		return arrdate_sf;
	}

	public void setArrdate_sf(String arrdate_sf) {
		this.arrdate_sf = arrdate_sf;
	}

	public String getArrtime_sf() {
		return arrtime_sf;
	}

	public void setArrtime_sf(String arrtime_sf) {
		this.arrtime_sf = arrtime_sf;
	}

	public int getSf_duration() {
		return sf_duration;
	}

	public void setSf_duration(int sf_duration) {
		this.sf_duration = sf_duration;
	}

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

	public City getFromcitysf() {
		return fromcitysf;
	}

	public void setFromcitysf(City fromcitysf) {
		this.fromcitysf = fromcitysf;
	}

	public City getTocitysf() {
		return tocitysf;
	}

	public void setTocitysf(City tocitysf) {
		this.tocitysf = tocitysf;
	}

	public Flight getSchflight() {
		return schflight;
	}

	public void setSchflight(Flight schflight) {
		this.schflight = schflight;
	}

}
