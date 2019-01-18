package fr.edf.miniZoomBack.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cycle")
public class Cycle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private int numCycle;
	@Column
	private float deltaRechargeRef;
	@Column
	private int deltaCap;
	@Column
	private String typeFlex;
	@Column
	private float lnatCycle;
	@Column
	private float modulation;
	@Column
	private int semaineBoreNul;
	@Column
	private int anneeBoreNul;
	@Column
	private float stockFinal;
	@Column
	private float energieProduiteDebutEtude;
	@Column
	private boolean isCycleCourant;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tranche_id")
	private Tranche tranche;
	@OneToOne
	private Arret arret;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeBoreNul;
		result = prime * result + ((arret == null) ? 0 : arret.hashCode());
		result = prime * result + deltaCap;
		result = prime * result + Float.floatToIntBits(deltaRechargeRef);
		result = prime * result + Float.floatToIntBits(energieProduiteDebutEtude);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isCycleCourant ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(lnatCycle);
		result = prime * result + Float.floatToIntBits(modulation);
		result = prime * result + numCycle;
		result = prime * result + semaineBoreNul;
		result = prime * result + Float.floatToIntBits(stockFinal);
		result = prime * result + ((tranche == null) ? 0 : tranche.hashCode());
		result = prime * result + ((typeFlex == null) ? 0 : typeFlex.hashCode());
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
		Cycle other = (Cycle) obj;
		if (anneeBoreNul != other.anneeBoreNul)
			return false;
		if (arret == null) {
			if (other.arret != null)
				return false;
		} else if (!arret.equals(other.arret))
			return false;
		if (deltaCap != other.deltaCap)
			return false;
		if (Float.floatToIntBits(deltaRechargeRef) != Float.floatToIntBits(other.deltaRechargeRef))
			return false;
		if (Float.floatToIntBits(energieProduiteDebutEtude) != Float.floatToIntBits(other.energieProduiteDebutEtude))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCycleCourant != other.isCycleCourant)
			return false;
		if (Float.floatToIntBits(lnatCycle) != Float.floatToIntBits(other.lnatCycle))
			return false;
		if (Float.floatToIntBits(modulation) != Float.floatToIntBits(other.modulation))
			return false;
		if (numCycle != other.numCycle)
			return false;
		if (semaineBoreNul != other.semaineBoreNul)
			return false;
		if (Float.floatToIntBits(stockFinal) != Float.floatToIntBits(other.stockFinal))
			return false;
		if (tranche == null) {
			if (other.tranche != null)
				return false;
		} else if (!tranche.equals(other.tranche))
			return false;
		if (typeFlex == null) {
			if (other.typeFlex != null)
				return false;
		} else if (!typeFlex.equals(other.typeFlex))
			return false;
		return true;
	}

	public Cycle(int numCycle, float deltaRechargeRef, int deltaCap, String typeFlex, float lnatCycle, float modulation,
			int semaineBoreNul, int anneeBoreNul, float stockFinal, float energieProduiteDebutEtude,
			boolean isCycleCourant, Tranche tranche, Arret arret) {
		super();
		this.numCycle = numCycle;
		this.deltaRechargeRef = deltaRechargeRef;
		this.deltaCap = deltaCap;
		this.typeFlex = typeFlex;
		this.lnatCycle = lnatCycle;
		this.modulation = modulation;
		this.semaineBoreNul = semaineBoreNul;
		this.anneeBoreNul = anneeBoreNul;
		this.stockFinal = stockFinal;
		this.energieProduiteDebutEtude = energieProduiteDebutEtude;
		this.isCycleCourant = isCycleCourant;
		this.tranche = tranche;
		this.arret = arret;
	}

	public Cycle() {
		super();
	}

	@Override
	public String toString() {
		return "Cycle [id=" + id + ", numCycle=" + numCycle + ", deltaRechargeRef=" + deltaRechargeRef + ", deltaCap="
				+ deltaCap + ", typeFlex=" + typeFlex + ", lnatCycle=" + lnatCycle + ", modulation=" + modulation
				+ ", semaineBoreNul=" + semaineBoreNul + ", anneeBoreNul=" + anneeBoreNul + ", stockFinal=" + stockFinal
				+ ", energieProduiteDebutEtude=" + energieProduiteDebutEtude + ", isCycleCourant=" + isCycleCourant
				+ ", tranche=" + tranche + ", arret=" + arret + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumCycle() {
		return numCycle;
	}

	public void setNumCycle(int numCycle) {
		this.numCycle = numCycle;
	}

	public float getDeltaRechargeRef() {
		return deltaRechargeRef;
	}

	public void setDeltaRechargeRef(float deltaRechargeRef) {
		this.deltaRechargeRef = deltaRechargeRef;
	}

	public int getDeltaCap() {
		return deltaCap;
	}

	public void setDeltaCap(int deltaCap) {
		this.deltaCap = deltaCap;
	}

	public String getTypeFlex() {
		return typeFlex;
	}

	public void setTypeFlex(String typeFlex) {
		this.typeFlex = typeFlex;
	}

	public float getLnatCycle() {
		return lnatCycle;
	}

	public void setLnatCycle(float lnatCycle) {
		this.lnatCycle = lnatCycle;
	}

	public float getModulation() {
		return modulation;
	}

	public void setModulation(float modulation) {
		this.modulation = modulation;
	}

	public int getSemaineBoreNul() {
		return semaineBoreNul;
	}

	public void setSemaineBoreNul(int semaineBoreNul) {
		this.semaineBoreNul = semaineBoreNul;
	}

	public int getAnneeBoreNul() {
		return anneeBoreNul;
	}

	public void setAnneeBoreNul(int anneeBoreNul) {
		this.anneeBoreNul = anneeBoreNul;
	}

	public float getStockFinal() {
		return stockFinal;
	}

	public void setStockFinal(float stockFinal) {
		this.stockFinal = stockFinal;
	}

	public float getEnergieProduiteDebutEtude() {
		return energieProduiteDebutEtude;
	}

	public void setEnergieProduiteDebutEtude(float energieProduiteDebutEtude) {
		this.energieProduiteDebutEtude = energieProduiteDebutEtude;
	}

	public boolean isCycleCourant() {
		return isCycleCourant;
	}

	public void setCycleCourant(boolean isCycleCourant) {
		this.isCycleCourant = isCycleCourant;
	}

	public Tranche getTranche() {
		return tranche;
	}

	public void setTranche(Tranche tranche) {
		this.tranche = tranche;
	}

	public Arret getArret() {
		return arret;
	}

	public void setArret(Arret arret) {
		this.arret = arret;
	}

}
