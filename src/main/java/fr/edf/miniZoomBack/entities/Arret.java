package fr.edf.miniZoomBack.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arret")
public class Arret implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private int semaineDebutArret;
	@Column
	private int anneeDebutArret;
	@Column
	private float dureeArret;
	@Column
	private int prolongationArret;
	@Column
	private Date dateRéelArret;
	@OneToOne(mappedBy = "arret")
	private Cycle cycle;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeDebutArret;
		result = prime * result + ((cycle == null) ? 0 : cycle.hashCode());
		result = prime * result + ((dateRéelArret == null) ? 0 : dateRéelArret.hashCode());
		result = prime * result + Float.floatToIntBits(dureeArret);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + prolongationArret;
		result = prime * result + semaineDebutArret;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arret other = (Arret) obj;
		if (anneeDebutArret != other.anneeDebutArret)
			return false;
		if (cycle == null) {
			if (other.cycle != null)
				return false;
		} else if (!cycle.equals(other.cycle))
			return false;
		if (dateRéelArret == null) {
			if (other.dateRéelArret != null)
				return false;
		} else if (!dateRéelArret.equals(other.dateRéelArret))
			return false;
		if (Float.floatToIntBits(dureeArret) != Float.floatToIntBits(other.dureeArret))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (prolongationArret != other.prolongationArret)
			return false;
		if (semaineDebutArret != other.semaineDebutArret)
			return false;
		return true;
	}

	public Arret(int semaineDebutArret, int anneeDebutArret, float dureeArret, int prolongationArret,
			Date dateRéelArret, Cycle cycle) {
		super();
		this.semaineDebutArret = semaineDebutArret;
		this.anneeDebutArret = anneeDebutArret;
		this.dureeArret = dureeArret;
		this.prolongationArret = prolongationArret;
		this.dateRéelArret = dateRéelArret;
		this.cycle = cycle;
	}

	public Arret() {
		super();
	}

	@Override
	public String toString() {
		return "Arret [id=" + id + ", semaineDebutArret=" + semaineDebutArret + ", anneeDebutArret=" + anneeDebutArret
				+ ", dureeArret=" + dureeArret + ", prolongationArret=" + prolongationArret + ", dateRéelArret="
				+ dateRéelArret + ", cycle=" + cycle + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSemaineDebutArret() {
		return semaineDebutArret;
	}

	public void setSemaineDebutArret(int semaineDebutArret) {
		this.semaineDebutArret = semaineDebutArret;
	}

	public int getAnneeDebutArret() {
		return anneeDebutArret;
	}

	public void setAnneeDebutArret(int anneeDebutArret) {
		this.anneeDebutArret = anneeDebutArret;
	}

	public float getDureeArret() {
		return dureeArret;
	}

	public void setDureeArret(float dureeArret) {
		this.dureeArret = dureeArret;
	}

	public int getProlongationArret() {
		return prolongationArret;
	}

	public void setProlongationArret(int prolongationArret) {
		this.prolongationArret = prolongationArret;
	}

	public Date getDateRéelArret() {
		return dateRéelArret;
	}

	public void setDateRéelArret(Date dateRéelArret) {
		this.dateRéelArret = dateRéelArret;
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

}
