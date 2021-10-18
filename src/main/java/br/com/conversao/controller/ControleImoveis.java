package br.com.conversao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conversao.entity.ImovelCertidao;
import br.com.conversao.io.ImovelCertidaoJson;
import br.com.conversao.repository.ImovelCertidaoRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/data/imoveis")
public class ControleImoveis {
	
	@Autowired
	ImovelCertidaoRepository repository;
	public static List<ImovelCertidao> lista = new ArrayList<ImovelCertidao>();
	
	//27251
	@GetMapping("/leituraPontaGrossaum")
	 public ResponseEntity<?> exibe(){
		 try {
			 ImovelCertidao ic = ImovelCertidaoJson.ler27251pontgrossaparana();
			 lista.add(ic);
		return ResponseEntity.status(200).body(ic);
		 }catch(Exception ex) {
			 ex.printStackTrace();
	   return ResponseEntity.status(500).body("error" + ex.getMessage());
		 }
	 }
	
 //88006
	@GetMapping("/leituraPontaGrossadois")
	 public ResponseEntity<?> exibe2(){
		 try {
			 ImovelCertidao ic =  ImovelCertidaoJson.ler88006pontgrossaparana();
			 lista.add(ic);
		return ResponseEntity.status(200).body(lista);
		 }catch(Exception ex) {
			 ex.printStackTrace();
	   return ResponseEntity.status(500).body("error" + ex.getMessage());
		 }
	 }
	
	@PostMapping("/saveAll")
	 public ResponseEntity<?> save(@RequestBody ImovelCertidao[] imovelCertidoes){
		 try {
			 ImovelCertidao  imoveis[] = imovelCertidoes;
				Map<String,Object> mapa= new HashMap<>();
				int i=0;
			for(ImovelCertidao ic : imoveis ) {
				i++;
				ImovelCertidao resp= repository.save(ic);
		          if (resp==null) {
		        	  throw new Exception("Nao Gravado");
		          }
		          mapa.put("imovel-"+i, resp);
			}
		return ResponseEntity.status(200).body(mapa);
		 }catch(Exception ex) {
			 ex.printStackTrace();
	   return ResponseEntity.status(500).body("error" + ex.getMessage());
		 }
	}
	
}
