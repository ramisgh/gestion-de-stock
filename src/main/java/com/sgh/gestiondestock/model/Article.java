package com.sgh.gestiondestock.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "article")
public class Article extends AbstractEntity{

	  @Column(name = "codearticle")
	  private String codeArticle;

	  @Column(name = "designation")
	  private String designation;

	  @Column(name = "prixunitaireht")
	  private BigDecimal prixUnitaireHt;

	  @Column(name = "tauxtva")
	  private BigDecimal tauxTva;

	  @Column(name = "prixunitairettc")
	  private BigDecimal prixUnitaireTtc;

	  @Column(name = "photo")
	  private String photo;

	  @Column(name = "identreprise")
	  private Integer idEntreprise;

	  @ManyToOne
	  @JoinColumn(name = "idcategory")
	  private Catogorie category;

	  @OneToMany(mappedBy = "article")
	  private List<LigneVentes> ligneVentes;

	  @OneToMany(mappedBy = "article")
	  private List<ligneCommandeClient> ligneCommandeClients;

	  @OneToMany(mappedBy = "article")
	  private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

	  @OneToMany(mappedBy = "article")
	  private List<Mvtstock> mvtStks;

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHt() {
		return prixUnitaireHt;
	}

	public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public BigDecimal getPrixUnitaireTtc() {
		return prixUnitaireTtc;
	}

	public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
		this.prixUnitaireTtc = prixUnitaireTtc;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public Catogorie getCategory() {
		return category;
	}

	public void setCategory(Catogorie category) {
		this.category = category;
	}

	public List<LigneVentes> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVentes> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}

	public List<ligneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<ligneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}

	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}

	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}

	public List<Mvtstock> getMvtStks() {
		return mvtStks;
	}

	public void setMvtStks(List<Mvtstock> mvtStks) {
		this.mvtStks = mvtStks;
	}
}
