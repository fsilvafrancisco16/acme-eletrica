package com.franciscosilva.acme.repository;

import com.franciscosilva.acme.domain.Cliente;
import com.franciscosilva.acme.domain.Instalacao;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

    public Optional<Instalacao> findByCodigo(String codigo);

    public List<Instalacao> findByCliente(Cliente cliente);

}
