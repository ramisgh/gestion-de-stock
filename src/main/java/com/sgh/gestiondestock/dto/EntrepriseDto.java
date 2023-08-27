package com.sgh.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Adresse;
import com.sgh.gestiondestock.model.Entreprise;
import com.sgh.gestiondestock.model.utilisateur;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EntrepriseDto {
	  private String nom;
	  private Integer id;

	  private String description;

	
	  private AdresseDto adresse;

	  private String codeFiscal;

	  private String photo;

	  private String email;

	  private String numTel;

	  private String steWeb;
	  @JsonIgnore
	  private List<UtilisateurDto> utilisateurs;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AdresseDto getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseDto adresse) {
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

	public List<UtilisateurDto> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<UtilisateurDto> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	

	  public static EntrepriseDto fromEntity(Entreprise entreprise) {
	    if (entreprise == null) {
	      return null;
	    }
	    return EntrepriseDto.builder()
	        .id(entreprise.getId())
	        .nom(entreprise.getNom())
	        .description(entreprise.getDescription())
	        .adresse(AdresseDto.fromEntity(entreprise.getAdresse()))
	        .codeFiscal(entreprise.getCodeFiscal())
	        .photo(entreprise.getPhoto())
	        .email(entreprise.getEmail())
	        .numTel(entreprise.getNumTel())
	        .steWeb(entreprise.getSteWeb())
	        .build();
	  }

	  public static Entreprise toEntity(EntrepriseDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    Entreprise entreprise = new Entreprise();
	    entreprise.setId(dto.getId());
	    entreprise.setNom(dto.getNom());
	    entreprise.setDescription(dto.getDescription());
	    entreprise.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
	    entreprise.setCodeFiscal(dto.getCodeFiscal());
	    entreprise.setPhoto(dto.getPhoto());
	    entreprise.setEmail(dto.getEmail());
	    entreprise.setNumTel(dto.getNumTel());
	    entreprise.setSteWeb(dto.getSteWeb());

	    return entreprise;
	  }
}
