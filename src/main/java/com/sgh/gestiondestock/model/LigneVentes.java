package com.sgh.gestiondestock.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "lignevente")
public class LigneVentes extends AbstractEntity {

	  @ManyToOne
	  @JoinColumn(name = "idvente")
	  private Ventes vente;

	  @ManyToOne
	  @JoinColumn(name = "idarticle")
	  private Article article;
	  
	  @Column(name = "quantite")
	  private BigDecimal quantite;

	  @Column(name = "prixunitaire")
	  private BigDecimal prixUnitaire;

	  @Column(name = "identreprise")
	  private Integer idEntreprise;

	public Ventes getVente() {
		return vente;
	}

	public void setVente(Ventes vente) {
		this.vente = vente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
}
