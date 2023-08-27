package com.sgh.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.sgh.gestiondestock.model.CommandeFournisseur;
import com.sgh.gestiondestock.model.Fournisseur;
import com.sgh.gestiondestock.model.LigneCommandeFournisseur;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {
	
	  private Integer id;
	  private String code;

	  private Instant dateCommande;



	  private Integer idEntreprise;

	  private FournisseurDto fournisseur;


	  private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Instant getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(Instant dateCommande) {
		this.dateCommande = dateCommande;
	}


	public Integer getIdEntreprise() {
		return idEntreprise;
	}


	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}


	public FournisseurDto getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(FournisseurDto fournisseur) {
		this.fournisseur = fournisseur;
	}


	public List<LigneCommandeFournisseurDto> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}


	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}

	
	public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
	    if (commandeFournisseur == null) {
	      return null;
	    }
	    return CommandeFournisseurDto.builder()
	        .id(commandeFournisseur.getId())
	        .code(commandeFournisseur.getCode())
	        .dateCommande(commandeFournisseur.getDateCommande())
	        .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
	        .idEntreprise(commandeFournisseur.getIdEntreprise())
	        .build();
	  }

	  public static CommandeFournisseur toEntity(CommandeFournisseurDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
	    commandeFournisseur.setId(dto.getId());
	    commandeFournisseur.setCode(dto.getCode());
	    commandeFournisseur.setDateCommande(dto.getDateCommande());
	    commandeFournisseur.setFournisseur(FournisseurDto.toEntity(dto.getFournisseur()));
	    commandeFournisseur.setIdEntreprise(dto.getIdEntreprise());
	    return commandeFournisseur;
	  }
}
