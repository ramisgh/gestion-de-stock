package com.sgh.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Adresse;
import com.sgh.gestiondestock.model.CommandeFournisseur;
import com.sgh.gestiondestock.model.Fournisseur;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDto {

	  private Integer id;
	  private String nom;

	  private String prenom;


	  private AdresseDto adresse;

	  private String photo;

	  private String mail;

	  private String numTel;
	  
	  private Integer idEntreprise;
	  @JsonIgnore
	  private List<CommandeFournisseurDto> commandeFournisseurs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public AdresseDto getAdresse() {
		return adresse;
	}
	public void setAdresse(AdresseDto adresse) {
		this.adresse = adresse;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public Integer getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public List<CommandeFournisseurDto> getCommandeFournisseurs() {
		return commandeFournisseurs;
	}
	public void setCommandeFournisseurs(List<CommandeFournisseurDto> commandeFournisseurs) {
		this.commandeFournisseurs = commandeFournisseurs;
	}
	

	  public static FournisseurDto fromEntity(Fournisseur fournisseur) {
	    if (fournisseur == null) {
	      return null;
	    }
	    return FournisseurDto.builder()
	        .id(fournisseur.getId())
	        .nom(fournisseur.getNom())
	        .prenom(fournisseur.getPrenom())
	        .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
	        .photo(fournisseur.getPhoto())
	        .mail(fournisseur.getMail())
	        .numTel(fournisseur.getNumTel())
	        .idEntreprise(fournisseur.getIdEntreprise())
	        .build();
	  }

	  public static Fournisseur toEntity(FournisseurDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    Fournisseur fournisseur = new Fournisseur();
	    fournisseur.setId(dto.getId());
	    fournisseur.setNom(dto.getNom());
	    fournisseur.setPrenom(dto.getPrenom());
	    fournisseur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
	    fournisseur.setPhoto(dto.getPhoto());
	    fournisseur.setMail(dto.getMail());
	    fournisseur.setNumTel(dto.getNumTel());
	    fournisseur.setIdEntreprise(dto.getIdEntreprise());

	    return fournisseur;
	  }
}
