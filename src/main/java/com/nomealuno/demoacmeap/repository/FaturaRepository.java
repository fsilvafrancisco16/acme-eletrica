package com.nomealuno.demoacmeap.repository;

import com.nomealuno.demoacmeap.domain.Fatura;
import com.nomealuno.demoacmeap.domain.Instalacao;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    public Optional<Fatura> findByCodigo(String codigo);

    public List<Fatura> findByInstalacao(Instalacao instalacao);

}
