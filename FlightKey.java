package com.flight_info_sys.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FlightKey implements Serializable {

	@Column(name = "flightno")
	private String flightno;

	@Column(name = "departure_date")
	private String depdate;

	
	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}


	public String getDepdate() {
		return depdate;
	}

	public void setDepdate(String depdate) {
		this.depdate = depdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depdate, flightno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightKey other = (FlightKey) obj;
		return Objects.equals(depdate, other.depdate) && Objects.equals(flightno, other.flightno);
	}

	
}
