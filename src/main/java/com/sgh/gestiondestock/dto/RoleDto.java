package com.sgh.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgh.gestiondestock.model.Role;
import com.sgh.gestiondestock.model.utilisateur;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {
	  private Integer id;

	  private String roleName;

	  @JsonIgnore
	  private UtilisateurDto utilisateur;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public UtilisateurDto getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(UtilisateurDto utilisateur) {
		this.utilisateur = utilisateur;
	}
	

	  public static RoleDto fromEntity(Role roles) {
	    if (roles == null) {
	      return null;
	    }
	    return RoleDto.builder()
	        .id(roles.getId())
	        .roleName(roles.getRoleName())
	        .build();
	  }

	  public static Role toEntity(RoleDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    Role roles = new Role();
	    roles.setId(dto.getId());
	    roles.setRoleName(dto.getRoleName());
	    roles.setUtilisateur(UtilisateurDto.toEntity(dto.getUtilisateur()));
	    return roles;
	  }

}
