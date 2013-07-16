package net.sas.model.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class DepenseOrdreTravail extends Depense{
	
	@OneToOne(orphanRemoval=true)
	@JoinColumn(name="ordreTravail_id", unique=true)
	@Cascade (value={CascadeType.SAVE_UPDATE,CascadeType.DELETE})
	private OrdreTravail ordreTravail;

	public OrdreTravail getOrdreTravail() {
		return ordreTravail;
	}

	public void setOrdreTravail(OrdreTravail ordreTravail) {
		this.ordreTravail = ordreTravail;
	}
}
