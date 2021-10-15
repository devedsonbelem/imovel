package br.com.conversao.repository;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.conversao.entity.ImovelCertidao;
import br.com.conversao.interfaces.ImovelsJoinMunicipio;
import br.com.conversao.interfaces.MunicipioImovelsJoin;

 	

@Repository
public interface ImovelCertidaoRepository extends JpaRepository<ImovelCertidao, Long>  {

 
}

 
