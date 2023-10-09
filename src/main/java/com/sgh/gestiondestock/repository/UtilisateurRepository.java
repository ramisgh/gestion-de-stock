package com.sgh.gestiondestock.repository;

import com.sgh.gestiondestock.model.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<utilisateur, Integer> {
}
