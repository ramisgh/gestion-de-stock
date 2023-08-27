package com.sgh.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.sgh.gestiondestock.model.LigneVentes;
import com.sgh.gestiondestock.model.Ventes;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {

	  private Integer id;
	  
	  private String code;

	  private Instant dateVente;

	  private String commentaire;
	  
	  public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	private Integer idEntreprise;
	
	  private List<LigneVentesDto> ligneVentes;

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

	public Instant getDateVente() {
		return dateVente;
	}

	public void setDateVente(Instant dateVente) {
		this.dateVente = dateVente;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public List<LigneVentesDto> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVentesDto> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
	  
	
	public static VentesDto fromEntity(Ventes vente) {
	    if (vente == null) {
	      return null;
	    }
	    return VentesDto.builder()
	        .id(vente.getId())
	        .code(vente.getCode())
	        .commentaire(vente.getCommentaire())
	        .idEntreprise(vente.getIdEntreprise())
	        .build();
	  }

	  public static Ventes toEntity(VentesDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    Ventes ventes = new Ventes();
	    ventes.setId(dto.getId());
	    ventes.setCode(ventes.getCode());
	    ventes.setCommentaire(dto.getCommentaire());
	    ventes.setIdEntreprise(dto.getIdEntreprise());
	    return ventes;
	  }
}
