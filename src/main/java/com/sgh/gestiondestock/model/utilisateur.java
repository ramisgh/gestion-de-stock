package com.sgh.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "utilisateur")
public class utilisateur extends AbstractEntity{

	  @Column(name = "nom")
	  private String nom;

	  @Column(name = "prenom")
	  private String prenom;

	  @Column(name = "email")
	  private String email;

	  @Column(name = "datedenaissance")
	  private Instant dateDeNaissance;

	  @Column(name = "motdepasse")
	  private String moteDePasse;

	  @Embedded
	  private Adresse adresse;

	  @Column(name = "photo")
	  private String photo;
	  @ManyToOne
	  @JoinColumn(name = "identreprise")
	  private Entreprise entreprise;
	  
	  @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
	  @JsonIgnore
	  private List<Role> roles;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instant getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Instant dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getMoteDePasse() {
		return moteDePasse;
	}

	public void setMoteDePasse(String moteDePasse) {
		this.moteDePasse = moteDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	  

}
