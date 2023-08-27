package com.sgh.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ventes")
public class Ventes extends AbstractEntity{

	 @Column(name = "code")
	  private String code;

	  @Column(name = "datevente")
	  private Instant dateVente;

	  @Column(name = "commentaire")
	  private String commentaire;

	  @Column(name = "identreprise")
	  private Integer idEntreprise;

	  @OneToMany(mappedBy = "vente")
	  private List<LigneVentes> ligneVentes;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Instant getDateVente() {
		return dateVente;
	}

	public void setDateVente(Instant dateVente) {
		this.dateVente = dateVente;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public List<LigneVentes> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVentes> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}

}
