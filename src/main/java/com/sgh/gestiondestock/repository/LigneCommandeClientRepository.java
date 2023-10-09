package com.sgh.gestiondestock.repository;

import com.sgh.gestiondestock.model.ligneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<ligneCommandeClient, Integer> {
}
