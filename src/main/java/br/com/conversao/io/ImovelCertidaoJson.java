package br.com.conversao.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import org.hibernate.internal.build.AllowSysOut;

import br.com.conversao.entity.ImovelCertidao;

public class ImovelCertidaoJson {
	
 
	public  ImovelCertidao  ler() throws Exception{
	    FileReader fr = new FileReader("/home/arquiteto/arquivos/ponta_grossa_pr/21261b.json");
		BufferedReader bf = new BufferedReader(fr); 
		String s = "";
		int i = 0;
		int k=0;
		String pedacos[]=new String[50];
		String linha[]=new String[50];
	      ImovelCertidao ic = new ImovelCertidao();
	      ic.setId(1l);
	      
		while ((s = bf.readLine()) != null) {
		
			String marcas[]=new String[10];
			
		   i++;
		   if (i==4) {
			     
			   StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         pedacos[j++] = token.nextToken().replaceAll("null","");
			     }
			    
			     System.out.println(pedacos[1]);
			   
			  	pedacos[1] += s.replaceAll("null","");
			System.out.println("----------------------");
			  	String partes[] = pedacos[1].split(";");
			  	int z=0;
			  	for (String x : partes) {
			  		z++;
			  		if (z==1) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[1]);
			  			System.out.println(subpartes[2]);
			  			ic.setTitulo(subpartes[2]);
			  		}
			  		if (z==2) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		 ic.setCertidaoNumero(subpartes[1]);
			  		}
			  		if (z==3) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setCodigoAutencidade(subpartes[1]);
			  		}
			  		if (z==4) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setIdentificacaoContribuinteCGCM(subpartes[1]);
			  		}
			  		if (z==4) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setIdentificacaoContribuinteCGCM(subpartes[1]);
			  		}
			  		if (z==5) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setIdentificacaoContribuintecnpjCpf(subpartes[1]);
			  		}
			  		if (z==6) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setIdentificacaoContribuinteCadastroInscricao(subpartes[1]);
			  		   }
			  		if (z==7) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setIdentificacaoContribuinteNome(subpartes[1]);
			  		   }
			  		if (z==8) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		   ic.setIdentificacaoContribuinteEndereco(subpartes[1]);
			  		   }	
			  	 if (z==9) {
			  			String subpartes[]=x.split(":");
			  			System.out.print(subpartes[0]);
			  			System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoContribuinteBairro(subpartes[1]);
			  		   }
			  	if (z==10) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIndetificacaoContribuinteComplemento(subpartes[1]);
		  		   }
			  	if (z==11) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoContribuinteMunicipio(subpartes[1]);
		  		   }
				if (z==12) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoContribuinteUF(subpartes[1]);
		  		   }
				if (z==13) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoContribuinteCep(subpartes[1]);
		  		   }
				if (z==14) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoRequerenteNome(subpartes[1]);
		  		   }
				if (z==15) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoRequerenteFinalidade(subpartes[1]);
		  		   }
				if (z==16) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoRequerenteProtocolo(subpartes[1]);
		  		   }
				if (z==17) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelCadastro(subpartes[1]);
		  		   }
				if (z==18) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelrefCadastral(subpartes[1]);
		  		   }
				if (z==18) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelrefLogradouroNumero(subpartes[1]);
		  		   }
				if (z==19) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelBairro(subpartes[1]);
		  		   }
				if (z==20) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelComplemento(subpartes[1]);
		  		   }
				if (z==21) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelBairro(subpartes[1]);
		  		   }
				if (z==22) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelComplemento(subpartes[1]);
		  		   }
				if (z==23) {
		  			String subpartes[]=x.split(":");
		  			System.out.print(subpartes[0]);
		  			System.out.println(subpartes[1]);
		  		    ic.setIdentificacaoImovelSituacaoFinal(subpartes[1]);
		  		   }
			  	}
			  	
		   }
		}
		 bf.close();
		 return ic;
 }
		
	
	
	public  ImovelCertidao  ler2() throws Exception{
	    FileReader fr = new FileReader("/home/arquiteto/arquivos/ponta_grossa_pr/27251.json");
		BufferedReader bf = new BufferedReader(fr); 
		String s = "";
		int i = 0;
		int k=0;
		String pedacos[]=new String[50];
		String linha[]=new String[50];
	      ImovelCertidao ic = new ImovelCertidao();
	      ic.setId(1l);
	      String linha40="";
	      String linha4="";
	      String parte2="";
		while ((s = bf.readLine()) != null) {
		
			String marcas[]=new String[10];
			
		   i++;
		   if (i==2) {
			   StringTokenizer token = new StringTokenizer(s, ":");
			   int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         pedacos[j++] = token.nextToken().replaceAll("null","");
			     }
			     ic.setDirectory(pedacos[1].replaceAll(",", ""));
		   }
		   if (i==3) {
			   StringTokenizer token = new StringTokenizer(s, ":");
			   int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         pedacos[j++] = token.nextToken().replaceAll("null","");
			     }
			     ic.setFile_name(pedacos[1].replaceAll(",", ""));
		   }
		   if (i==4) {
			   StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         pedacos[j++] = token.nextToken().replaceAll("null","");
			     }
			    
			     
			     
		       linha4 = s.replaceAll("\\\\n",";");
		       linha4 = linha4.replaceAll(";;",";");
		       linha4 = linha4.replaceAll("\"","");
		       linha4= linha4.replaceAll("\\\\f","");
		       linha4= linha4.replaceAll("file_content","titulo");
		       linha4= linha4.replaceAll("  UF:  PR","UF:  PR;");
		       linha4 = linha4.replaceAll("NE 40;PROCURADORIA","NE 40;rodape : PROCURADORIA"); 
		       linha4=linha4.replaceAll("IDENTIFICAÇÃO CONTRIBUINTE;CGCM:   227678 ", "IDENTIFICACAOCONTRIBUINTECGCM: 227678;");
		       linha4 = linha4.replaceAll("PREFEITURA MUNICIPAL DE PONTA GROSSA;PROCURADORIA GERAL DO MUNICÍPIO;CADASTRO ÚNICO DA DIVIDA ATIVA MUNICIPAL;Certidão Negativa de Débitos Imobiliários","PREFEITURA MUNICIPAL DE PONTA GROSSA PROCURADORIA GERAL DO MUNICÍPIO CADASTRO ÚNICO DA DIVIDA ATIVA MUNICIPAL Certidão Negativa de Débitos Imobiliários");
		       linha4 = linha4.replaceAll("IDENTIFICAÇÃO REQUERENTE;Nome","IDENTIFICACAREQUERENTENOME");
		       linha4 = linha4.replaceAll("IDENTIFICAÇÃO DO IMÓVEL;CADASTRO","IDENTIFICACAODOIMOVELCADASTRO");
		       System.out.println("FIM linha4 ::::" + linha4);
		       
		       String partes[] = linha4.split(";");
		       System.out.println("FIM linha5 ::::" + partes[0]);
 			  	int z=0;
		    
		       for (String x : partes) {
		    	   System.out.println(x);
		    	      z++;
				  		if (z==1) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		 	ic.setTitulo( subpartes[1]);
				  		}
				  		if (z==2) {
				  			String subpartes[]=x.split(":");
				  			//System.out.print(subpartes[0]);
				  			//System.out.println(subpartes[1]);
				  		 ic.setCertidaoNumero(subpartes[1]);
				  		}
				  		if (z==3) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		   ic.setCodigoAutencidade(subpartes[1]);
				  		}
				  		if (z==4) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		   ic.setIdentificacaoContribuinteCGCM(subpartes[1]);
				  		}
				  		if (z==4) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		   ic.setIdentificacaoContribuinteCGCM(subpartes[1]);
				  		}
				  		if (z==5) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		   ic.setIdentificacaoContribuintecnpjCpf(subpartes[1]);
				  		}
				  		if (z==6) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		///	System.out.println(subpartes[1]);
				  		   ic.setIdentificacaoContribuinteCadastroInscricao(subpartes[1]);
				  		   }
				  		if (z==7) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		   ic.setIdentificacaoContribuinteNome(subpartes[1]);
				  		   }
				  		if (z==8) {
				  			String subpartes[]=x.split(":");
				  		//	System.out.print(subpartes[0]);
				  		//	System.out.println(subpartes[1]);
				  		   ic.setIdentificacaoContribuinteEndereco(subpartes[1]);
				  		   }	
				  	 if (z==9) {
				  			String subpartes[]=x.split(":");
				  	//		System.out.print(subpartes[0]);
				  	//		System.out.println(subpartes[1]);
				  		    ic.setIdentificacaoContribuinteBairro(subpartes[1]);
				  		   }
				  	if (z==10) {
			  			String subpartes[]=x.split(":");
			  		//	System.out.print(subpartes[0]);
			  		//	System.out.println(subpartes[1]);
			  		    ic.setIndetificacaoContribuinteComplemento(subpartes[1]);
			  		   }
				  	if (z==11) {
			  			String subpartes[]=x.split(":");
			  		//	System.out.print(subpartes[0]);
			  		//	System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoContribuinteMunicipio(subpartes[1]);
			  		   }
					if (z==12) {
			  			String subpartes[]=x.split(":");
			  		//	System.out.print(subpartes[0]);
			  		//	System.out.println(subpartes[1]);
			  		  ic.setIdentificacaoContribuinteUF(subpartes[1]);
			  		   }
					if (z==13) {
			  			String subpartes[]=x.split(":");
			  		//	System.out.print(subpartes[0]);
			  		//	System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoContribuinteCep(subpartes[1]);
			  		   }
					if (z==14) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoRequerenteNome(subpartes[1]);
			  		   }
					if (z==15) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoRequerenteFinalidade(subpartes[1]);
			  		   }
					if (z==16) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoRequerenteProtocolo(subpartes[1]);
			  		   }
					if (z==17) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelCadastro(subpartes[1]);
			  		   }
					if (z==18) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelrefCadastral(subpartes[1]);
			  		   }
					if (z==18) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelrefLogradouroNumero(subpartes[1]);
			  		   }
					if (z==19) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelBairro(subpartes[1]);
			  		   }
					if (z==20) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelComplemento(subpartes[1]);
			  		   }
					if (z==21) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelTipoImovel(subpartes[1]);
			  		   }
					if (z==22) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(subpartes[1]);
			  		    ic.setIdentificacaoImovelcomplementoLote(subpartes[1]);
			  		   }
					
					if (z==23) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println("OLHAAAA"+ subpartes[1]);
			  		    ic.setIdentificacaoImovelSituacao(subpartes[1]);
			  		   }
					if (z==24) {
			  			String subpartes[]=x.split(":");
			  			//System.out.print(subpartes[0]);
			  			//System.out.println(""+ subpartes[1]);
			  		    ic.setIdentificacaoImovelSituacaoFinal(subpartes[1]);
			  		   }
		       }
		       
			   ic.setIdentificacaoImovelLinqRequerente("www.tributos.pontagrossa.pr.gov.br");
			  	parte2 += s.replaceAll("null","");
			System.out.println("certidao numero  "+ ic.getCertidaoNumero());
			return ic;
		   }
		}
			  	
 
		 bf.close();
		 return ic;
 }
	
		public static void main(String args[]) {
			try {
			ImovelCertidaoJson json = new ImovelCertidaoJson();
			
			ImovelCertidao ic = json.ler2();
			
		System.out.println(ic);
			
			}catch(Exception ex) {
				
			}
		}

}