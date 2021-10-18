package br.com.conversao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.conversao.entity.ImovelCertidao;

 	

@Repository
public interface ImovelCertidaoRepository extends JpaRepository<ImovelCertidao, Long>  {

 
}

 
