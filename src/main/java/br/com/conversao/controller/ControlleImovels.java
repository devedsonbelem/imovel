package br.com.conversao.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conversao.entity.ImovelCertidao;
import br.com.conversao.io.ImovelCertidaoRead;
@CrossOrigin("*")
@RestController
@RequestMapping("api/data/imovels")
public class ControlleImovels {
	
	
	
	@GetMapping("/leitura")
	 public ResponseEntity<?> exibe(){
		 try {
			 ImovelCertidao ic = ImovelCertidaoRead.ler();
		return ResponseEntity.status(200).body(ic);
		 }catch(Exception ex) {
			 ex.printStackTrace();
	   return ResponseEntity.status(200).body("error" + ex.getMessage());
		 }
	 }

	
}
