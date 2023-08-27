package com.sgh.gestiondestock.dto;

import com.sgh.gestiondestock.model.Adresse;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

	  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	private Integer id;
	
	  private String adresse1;


	  private String adresse2;

	
	  private String ville;

	
	  private String codePostale;

	
	  private String pays;
	  
	  public static AdresseDto fromEntity(Adresse adresse) {
		    if (adresse == null) {
		      return null;
		    }

		    return AdresseDto.builder()
		        .adresse1(adresse.getAdresse1())
		        .adresse2(adresse.getAdresse2())
		        .codePostale(adresse.getCodePostale())
		        .ville(adresse.getVille())
		        .pays(adresse.getPays())
		        .build();
		  }

		  public static Adresse toEntity(AdresseDto adresseDto) {
		    if (adresseDto == null) {
		      return null;
		    }
		    Adresse adresse = new Adresse();
		    adresse.setAdresse1(adresseDto.getAdresse1());
		    adresse.setAdresse2(adresseDto.getAdresse2());
		    adresse.setCodePostale(adresseDto.getCodePostale());
		    adresse.setVille(adresseDto.getVille());
		    adresse.setPays(adresseDto.getPays());
		    return adresse;
		  }
}
