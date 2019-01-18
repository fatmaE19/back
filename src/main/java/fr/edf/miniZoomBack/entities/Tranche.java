package fr.edf.miniZoomBack.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tranche")
public class Tranche implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id; 
	@Column 
	private String nomTranche; 
	@Column
	private String codeTranche; 
	@Column
	private String trigramme;
	@Column
	private String palier; 
	@Column
	private int numTranche; 
	@Column
	private int semaineMsi;
	
	   @OneToMany(
			   	mappedBy = "tranche",
		        cascade = CascadeType.ALL,
		        orphanRemoval = true
		    )
	private List<Cycle> cycles;

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeTranche == null) ? 0 : codeTranche.hashCode());
		result = prime * result + ((cycles == null) ? 0 : cycles.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomTranche == null) ? 0 : nomTranche.hashCode());
		result = prime * result + numTranche;
		result = prime * result + ((palier == null) ? 0 : palier.hashCode());
		result = prime * result + semaineMsi;
		result = prime * result + ((trigramme == null) ? 0 : trigramme.hashCode());
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
		Tranche other = (Tranche) obj;
		if (codeTranche == null) {
			if (other.codeTranche != null)
				return false;
		} else if (!codeTranche.equals(other.codeTranche))
			return false;
		if (cycles == null) {
			if (other.cycles != null)
				return false;
		} else if (!cycles.equals(other.cycles))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomTranche == null) {
			if (other.nomTranche != null)
				return false;
		} else if (!nomTranche.equals(other.nomTranche))
			return false;
		if (numTranche != other.numTranche)
			return false;
		if (palier == null) {
			if (other.palier != null)
				return false;
		} else if (!palier.equals(other.palier))
			return false;
		if (semaineMsi != other.semaineMsi)
			return false;
		if (trigramme == null) {
			if (other.trigramme != null)
				return false;
		} else if (!trigramme.equals(other.trigramme))
			return false;
		return true;
	}

	public Tranche(String nomTranche, String codeTranche, String trigramme, String palier, int numTranche,
			int semaineMsi, List<Cycle> cycles) {
		super();
		this.nomTranche = nomTranche;
		this.codeTranche = codeTranche;
		this.trigramme = trigramme;
		this.palier = palier;
		this.numTranche = numTranche;
		this.semaineMsi = semaineMsi;
		this.cycles = cycles;
	}

		public Tranche() {
			super();
		}

		@Override
		public String toString() {
			return "Tranche [id=" + id + ", nomTranche=" + nomTranche + ", codeTranche=" + codeTranche + ", trigramme="
					+ trigramme + ", palier=" + palier + ", numTranche=" + numTranche + ", semaineMsi=" + semaineMsi
					+ ", cycles=" + cycles + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNomTranche() {
			return nomTranche;
		}

		public void setNomTranche(String nomTranche) {
			this.nomTranche = nomTranche;
		}

		public String getCodeTranche() {
			return codeTranche;
		}

		public void setCodeTranche(String codeTranche) {
			this.codeTranche = codeTranche;
		}

		public String getTrigramme() {
			return trigramme;
		}

		public void setTrigramme(String trigramme) {
			this.trigramme = trigramme;
		}

		public String getPalier() {
			return palier;
		}

		public void setPalier(String palier) {
			this.palier = palier;
		}

		public int getNumTranche() {
			return numTranche;
		}

		public void setNumTranche(int numTranche) {
			this.numTranche = numTranche;
		}

		public int getSemaineMsi() {
			return semaineMsi;
		}

		public void setSemaineMsi(int semaineMsi) {
			this.semaineMsi = semaineMsi;
		}

		public List<Cycle> getCycles() {
			return cycles;
		}

		public void setCycles(List<Cycle> cycles) {
			this.cycles = cycles;
		}
	   
	   
	   
	   
	
}
