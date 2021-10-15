package br.com.conversao.service;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

 
import br.com.conversao.entity.ImovelCertidao;
import br.com.conversao.repository.ImovelCertidaoRepository;

@Service
public class ImovelCertidaoService {


    @Autowired
    ImovelCertidaoRepository imovelCertidaoRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    ImovelCertidaoRepository repository;

 

    
    public List<ImovelCertidao> getAll(){
        List<ImovelCertidao> retorno = null;
        retorno = imovelCertidaoRepository.findAll();
        return retorno;
    }

    public ImovelCertidao getById(Long id){
        Optional<ImovelCertidao> retorno = null;
        retorno = imovelCertidaoRepository.findById(id);
        return retorno.get();
    }

    public List<ImovelCertidao> listarTodos(Pageable pageable){
        List<ImovelCertidao> imovels = null;
        imovels = imovelCertidaoRepository.findAll(pageable).getContent();

        return imovels;

    }

    
    public Integer deletar(Integer pID){
        Optional<ImovelCertidao> imovelDeletado =  imovelCertidaoRepository.findById(Long.valueOf(pID));
        if ( imovelDeletado.isPresent()) {
            imovelCertidaoRepository.delete(imovelDeletado.get());
            return 1;
        }
        return 0;
    }
    
}
