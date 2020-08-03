package com.nomealuno.demoacmeap.repository;

import com.nomealuno.demoacmeap.domain.Cliente;
import com.nomealuno.demoacmeap.domain.Instalacao;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

    public Optional<Instalacao> findByCodigo(String codigo);

    public List<Instalacao> findByCliente(Cliente cliente);

}
