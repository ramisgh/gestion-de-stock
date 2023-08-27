package com.sgh.gestiondestock.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "entrprise")
public class Entreprise extends AbstractEntity{

	  @Column(name = "nom")
	  private String nom;

	  public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getCodeFiscal() {
		return codeFiscal;
	}

	public void setCodeFiscal(String codeFiscal) {
		this.codeFiscal = codeFiscal;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getSteWeb() {
		return steWeb;
	}

	public void setSteWeb(String steWeb) {
		this.steWeb = steWeb;
	}

	public List<utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@Column(name = "description")
	  private String description;

	  @Embedded
	  private Adresse adresse;

	  @Column(name = "codefiscal")
	  private String codeFiscal;

	  @Column(name = "photo")
	  private String photo;

	  @Column(name = "email")
	  private String email;

	  @Column(name = "numtel")
	  private String numTel;

	  @Column(name = "siteweb")
	  private String steWeb;

	  @OneToMany(mappedBy = "entreprise")
	  private List<utilisateur> utilisateurs;
}
