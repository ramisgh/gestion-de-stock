package com.sgh.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Catogorie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CatogorieDto {

	  private Integer id;
	  private String code;
	  private Integer idEntreprise;
	  public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	private String designation;
	  @JsonIgnore
	  private List<ArticleDto> articles;
	  
	  
	  
	  public static CatogorieDto fromEntity(Catogorie category) {
		    if (category == null) {
		      return null;
		      // TODO throw an exception
		    }

		    return CatogorieDto.builder()
		    		.id(category.getId())
		            .code(category.getCode())
		            .designation(category.getDesignation())
		            .idEntreprise(category.getIdEntreprise())
		            .build();
		  }
	  
	  public static Catogorie toEntity(CatogorieDto categoryDto) {
		    if (categoryDto == null) {
		      return null;
		      // TODO throw an exception
		    }

		    Catogorie category = new Catogorie();
		    category.setId(categoryDto.getId());
		    category.setCode(categoryDto.getCode());
		    category.setDesignation(categoryDto.getDesignation());
		    category.setIdEntreprise(categoryDto.getIdEntreprise());
		    

		    return category;
		  }

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<ArticleDto> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleDto> articles) {
		this.articles = articles;
	}
	
}
