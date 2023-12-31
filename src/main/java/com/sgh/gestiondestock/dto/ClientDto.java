package com.sgh.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Adresse;
import com.sgh.gestiondestock.model.Client;
import com.sgh.gestiondestock.model.CommandeClient;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.*;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ClientDto {

	  private Integer id;

	  private String nom;

	  private String prenom;

	  private AdresseDto adresse;

	  private String photo;

	  private String mail;

	  private String numTel;

	  private Integer idEntreprise;
	  
	  @JsonIgnore
	  private List<CommandeClientDto> commandeClients;

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

	
	 public static ClientDto fromEntity(Client client) {
		    if (client == null) {
		      return null;
		    }
		    return ClientDto.builder()
		        .id(client.getId())
		        .nom(client.getNom())
		        .prenom(client.getPrenom())
		        .adresse(AdresseDto.fromEntity(client.getAdresse()))
		        .photo(client.getPhoto())
		        .mail(client.getMail())
		        .numTel(client.getNumTel())
		        .idEntreprise(client.getIdEntreprise())
		        .build();
		  }

		  public static Client toEntity(ClientDto dto) {
		    if (dto == null) {
		      return null;
		    }
		    Client client = new Client();
		    client.setId(dto.getId());
		    client.setNom(dto.getNom());
		    client.setPrenom(dto.getPrenom());
		    client.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
		    client.setPhoto(dto.getPhoto());
		    client.setMail(dto.getMail());
		    client.setNumTel(dto.getNumTel());
		    client.setIdEntreprise(dto.getIdEntreprise());
		    return client;
		  }


}
