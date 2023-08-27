package com.sgh.gestiondestock.model;

import java.math.BigDecimal;
import java.time.Instant;

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
@Table(name = "mvtStock")
public class Mvtstock extends AbstractEntity{
	  @Column(name = "datemvt")
	  private Instant dateMvt;

	  @Column(name = "quantite")
	  private BigDecimal quantite;

	  @ManyToOne
	  @JoinColumn(name = "idarticle")
	  private Article article;
	  
	  @Column(name = "identreprise")
	  private Integer idEntreprise;

	public Instant getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Instant dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	  
}
