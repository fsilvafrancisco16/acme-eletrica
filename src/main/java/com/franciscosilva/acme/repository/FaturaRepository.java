package com.franciscosilva.acme.repository;

import com.franciscosilva.acme.domain.Fatura;
import com.franciscosilva.acme.domain.Instalacao;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    public Optional<Fatura> findByCodigo(String codigo);

    public List<Fatura> findByInstalacao(Instalacao instalacao);

}
