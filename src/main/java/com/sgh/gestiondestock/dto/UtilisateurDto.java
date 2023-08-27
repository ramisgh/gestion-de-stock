package com.sgh.gestiondestock.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Adresse;
import com.sgh.gestiondestock.model.Role;
import com.sgh.gestiondestock.model.utilisateur;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	  private Integer id;
	 
	  private String nom;


	  private String prenom;

	
	  private String email;

	 
	  private Instant dateDeNaissance;

	
	  private String moteDePasse;

	
	  private AdresseDto adresse;

	 
	  private String photo;
	  
	  private EntrepriseDto entreprise;
	
	  public EntrepriseDto getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(EntrepriseDto entreprise) {
		this.entreprise = entreprise;
	}

	private List<RoleDto> roles;


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


	public List<RoleDto> getRoles() {
		return roles;
	}


	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}
	  
	public static UtilisateurDto fromEntity(utilisateur utilisateur) {
	    if (utilisateur == null) {
	      return null;
	    }

	    return UtilisateurDto.builder()
	        .id(utilisateur.getId())
	        .nom(utilisateur.getNom())
	        .prenom(utilisateur.getPrenom())
	        .email(utilisateur.getEmail())
	        .moteDePasse(utilisateur.getMoteDePasse())
	        .dateDeNaissance(utilisateur.getDateDeNaissance())
	        .adresse(AdresseDto.fromEntity(utilisateur.getAdresse()))
	        .photo(utilisateur.getPhoto())
	        .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
	        .roles(
	            utilisateur.getRoles() != null ?
	                utilisateur.getRoles().stream()
	                    .map(RoleDto::fromEntity)
	                    .collect(Collectors.toList()) : null
	        )
	        .build();
	  }

	  public static utilisateur toEntity(UtilisateurDto dto) {
	    if (dto == null) {
	      return null;
	    }

	    utilisateur utilisateur = new utilisateur();
	    utilisateur.setId(dto.getId());
	    utilisateur.setNom(dto.getNom());
	    utilisateur.setPrenom(dto.getPrenom());
	    utilisateur.setEmail(dto.getEmail());
	    utilisateur.setMoteDePasse(dto.getMoteDePasse());
	    utilisateur.setDateDeNaissance(dto.getDateDeNaissance());
	    utilisateur.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
	    utilisateur.setPhoto(dto.getPhoto());
	    utilisateur.setEntreprise(EntrepriseDto.toEntity(dto.getEntreprise()));

	    return utilisateur;
	  }
}
