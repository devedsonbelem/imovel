package br.com.conversao.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import br.com.conversao.entity.ImovelCertidao;

public class ImovelCertidaoRead {
	
	public static ImovelCertidao  ler() throws Exception{
		    FileReader fr = new FileReader("/home/arquiteto/arquivos/ponta_grossa_pr/27251.txt");
			BufferedReader bf = new BufferedReader(fr); 
			String s = "";
			int i = 0;
			int k=0;
			String pedacos[]=new String[20];
			String linha[]=new String[6];
		      ImovelCertidao ic = new ImovelCertidao();
		      ic.setId(1l);
		      
			while ((s = bf.readLine()) != null) {
			
				String marcas[]=new String[10];
				
			   i++;
			   if (i>=1 || i<=5) {
				     pedacos[0] += s;
			   }
			
			   if (i==6) {
				   System.out.println(pedacos[0].replaceAll("null",""));
				   ic.setTitulo(pedacos[0].replaceAll("null",""));
				   
				    System.out.println("Titulo:"+ic.getTitulo());
				    if (s!=null) {
				  	pedacos[1] += s.replaceAll("null","");
				    
				  	System.out.println("linha --" + pedacos[1]);
				    
				  	 StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken().replaceAll("null","");
				     }
				     System.out.println("linha 1 " + linha[0]);
				     System.out.println("linha 2 " + linha[1]);
				  }
			   }
			   if (i==7) {
				   ic.setCertidaoNumero(linha[1]);
				   System.out.println("linha 1"  + linha[1]);
				   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
			   }  
			   if (i==8) {
				   ic.setCodigoAutencidade(linha[1]);
				   if(s.length()==0) {
					   System.out.println("linha " + i+ " em branco");
				   }
				   
			   }
			   if (i==9) {
					   marcas[k++]=s;
			   }
			   if (i==10) {
				 	   System.out.println("linha " + i+ " em branco");
			 	   }	 
			   
			   if (i==11) {
				   StringTokenizer token = new StringTokenizer(s, ": ");
						  	 int j=0;
						     while(token.hasMoreTokens()) 
						     {
						         linha[j++] = token.nextToken().replaceAll(" ","");
						   
						     }
				   
			   }	
		    	   
			   if (i==12) {
			 	   System.out.println("linha " + i+ "," + linha[1]);
			     ic.setIdentificacaoContribuinteCGCM(linha[1]);
			     ic.setIdentificacaoContribuintecnpjCpf(linha[3]);
			        	 
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
			   }
			   
			   if (i==13) {
			    ic.setIdentificacaoContribuinteCadastroInscricao(linha[1]);
			    StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
			    
			   }
			   if (i==14) {
			    ic.setIdentificacaoContribuinteNome(linha[1]);
				    if(s.length()==0) {
						   System.out.println("linha " + i+ " em branco");
					   }
				   }
			   if (i==15) {
				   
				    StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   }
			   
			   if (i==16) {
				   ic.setIdentificacaoContribuinteEndereco(linha[1]);
				    StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
					     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   }
			  if (i==18) {
				   ic.setIdentificacaoContribuinteBairro(linha[1]);
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
					     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
				  
			  }
			  if (i==19) {
				  ic.setIdentificacaoContribuinteMunicipio(linha[1]);
				  StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				   while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
					     
			  }
			  
			  if (i==20) {
				  ic.setIdentificacaoContribuinteMunicipio(linha[1]);
				  StringTokenizer token = new StringTokenizer(s, ": ");
				  	 int j=0;
				   while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
					     
			  }
			  if (i==21) {
				  System.out.println("linha " + i+ " em branco" + linha[1]);
				  ic.setIdentificacaoContribuinteUF(linha[1]);
				  ic.setIdentificacaoContribuinteCep(linha[3]);
			  }
			  
			  
			   if (i==24) {
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				   
				      }
			   }
			  
			   if (i==25) {
				   ic.setIdentificacaoRequerenteNome(linha[1]);
				   
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				   
				      }
				   
			   }
			   if (i==26) {
				   ic.setIdentificacaoRequerenteFinalidade(linha[1]);
				   
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				   
				      }
				   
			   }
			   if (i==27) {
				   ic.setIdentificacaoRequerenteProtocolo(linha[1]);
				  
			   }
			   if (i==29) {
			 
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				 
			    }
		 	 
			   if (i==30) {
				   ic.setIdentificacaoImovelCadastro(linha[1]);
				   
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				   
				      }
				   
			   }
			   if (i==31) {
				   ic.setIdentificacaoImovelrefCadastral(linha[1]); 
				   
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				   
				      }
				   
			   }
			   if (i==32) { 
				   ic.setIdentificacaoImovelrefLogradouroNumero(linha[1]);
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				   
				      }
			   }
			   
			   if (i==33) { 
				   ic.setIdentificacaoImovelBairro(linha[1]);
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				     }
			   }
			   
			   if (i==35) { 
				   ic.setIdentificacaoImovelComplemento(linha[1]);
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				     }
			   }
			   if (i==37) { 
				   ic.setIdentificacaoImovelTipoImovel(linha[1]);
				   if (s.length()!=0) {
					   StringTokenizer token = new StringTokenizer(s, ":");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken();
					     }
				     }
			   }
			   if (i>=39 && i<=50) { 
				   ic.setIdentificacaoImovelcomplementoLote(linha[1]);
				 
					   pedacos[2] += s.replaceAll("null","");
				  
			   }
			   if (i==51) {
				   ic.setIdentificacaoImovelSituacao(pedacos[2].replaceAll("null", ""));
			   }
			   ic.setDirectory("ponta_grossa_pr/27251/");
			    ic.setIdentificacaoImovelLinqRequerente("www.tributos.pontagrossa.pr.gov.br");
			    ic.setFile_name("2021_10_14_12_43_49.pdf");
			   }
			   
			 bf.close();
			 return ic;
			}
	
	public static ImovelCertidao  ler2() throws Exception{
	    FileReader fr = new FileReader("/home/arquiteto/arquivos/ponta_grossa_pr/880062.txt");
		BufferedReader bf = new BufferedReader(fr); 
		String s = "";
		int i = 0;
		int k=0;
		String pedacos[]=new String[20];
		String linha[]=new String[6];
	      ImovelCertidao ic = new ImovelCertidao();
	      ic.setId(2l);
	      
		while ((s = bf.readLine()) != null) {
		
			String marcas[]=new String[10];
			
		   i++;
		   if (i>=1 || i<=5) {
			     pedacos[0] += s;
		   }
		
		   if (i==6) {
			   System.out.println(pedacos[0].replaceAll("null",""));
			   ic.setTitulo(pedacos[0].replaceAll("null",""));
			   
			    System.out.println("Titulo:"+ic.getTitulo());
			    if (s!=null) {
			  	pedacos[1] += s.replaceAll("null","");
			    
			  	System.out.println("linha --" + pedacos[1]);
			    
			  	 StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken().replaceAll("null","");
			     }
			     System.out.println("linha 1 " + linha[0]);
			     System.out.println("linha 2 " + linha[1]);
			  }
		   }
		   if (i==7) {
			   ic.setCertidaoNumero(linha[1]);
			   System.out.println("linha 1"  + linha[1]);
			   if (s.length()!=0) {
			   StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
		   
		      }
		   }  
		   if (i==8) {
			   ic.setCodigoAutencidade(linha[1]);
			   if(s.length()==0) {
				   System.out.println("linha " + i+ " em branco");
			   }
			   
		   }
		   if (i==9) {
				   marcas[k++]=s;
		   }
		   if (i==10) {
			 	   System.out.println("linha " + i+ " em branco");
		 	   }	 
		   
		   if (i==11) {
			   StringTokenizer token = new StringTokenizer(s, ": ");
					  	 int j=0;
					     while(token.hasMoreTokens()) 
					     {
					         linha[j++] = token.nextToken().replaceAll(" ","");
					   
					     }
			   
		   }	
	    	   
		   if (i==12) {
		 	   System.out.println("linha " + i+ "," + linha[1]);
		     ic.setIdentificacaoContribuinteCGCM(linha[1]);
		     ic.setIdentificacaoContribuintecnpjCpf(linha[3]);
		        	 
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
		   }
		   
		   if (i==13) {
		    ic.setIdentificacaoContribuinteCadastroInscricao(linha[1]);
		    StringTokenizer token = new StringTokenizer(s, ":");
		  	 int j=0;
		     while(token.hasMoreTokens()) 
		     {
		         linha[j++] = token.nextToken();
		     }
		    
		   }
		   if (i==14) {
		    ic.setIdentificacaoContribuinteNome(linha[1]);
			    if(s.length()==0) {
					   System.out.println("linha " + i+ " em branco");
				   }
			   }
		   if (i==15) {
			   
			    StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			     while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
		   }
		   
		   if (i==16) {
			   ic.setIdentificacaoContribuinteEndereco(linha[1]);
			    StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
				     while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
		   }
		  if (i==18) {
			   ic.setIdentificacaoContribuinteBairro(linha[1]);
			   StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
				     while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
			  
		  }
		  if (i==19) {
			  ic.setIdentificacaoContribuinteMunicipio(linha[1]);
			  StringTokenizer token = new StringTokenizer(s, ":");
			  	 int j=0;
			   while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
				     
		  }
		  
		  if (i==20) {
			  ic.setIdentificacaoContribuinteMunicipio(linha[1]);
			  StringTokenizer token = new StringTokenizer(s, ": ");
			  	 int j=0;
			   while(token.hasMoreTokens()) 
			     {
			         linha[j++] = token.nextToken();
			     }
				     
		  }
		  if (i==21) {
			  System.out.println("linha " + i+ " em branco" + linha[1]);
			  ic.setIdentificacaoContribuinteUF(linha[1]);
			  ic.setIdentificacaoContribuinteCep(linha[3]);
		  }
		  
		  
		   if (i==24) {
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
		   }
		  
		   if (i==25) {
			   ic.setIdentificacaoRequerenteNome(linha[1]);
			   
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
			   
		   }
		   if (i==26) {
			   ic.setIdentificacaoRequerenteFinalidade(linha[1]);
			   
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
			   
		   }
		   if (i==27) {
			   ic.setIdentificacaoRequerenteProtocolo(linha[1]);
			  
		   }
		   if (i==29) {
		 
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			 
		    }
	 	 
		   if (i==30) {
			   ic.setIdentificacaoImovelCadastro(linha[1]);
			   
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
			   
		   }
		   if (i==31) {
			   ic.setIdentificacaoImovelrefCadastral(linha[1]); 
			   
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
			   
		   }
		   if (i==32) { 
			   ic.setIdentificacaoImovelrefLogradouroNumero(linha[1]);
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			   
			      }
		   }
		   
		   if (i==33) { 
			   ic.setIdentificacaoImovelBairro(linha[1]);
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			     }
		   }
		   
		   if (i==35) { 
			   ic.setIdentificacaoImovelComplemento(linha[1]);
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			     }
		   }
		   if (i==37) { 
			   ic.setIdentificacaoImovelTipoImovel(linha[1]);
			   if (s.length()!=0) {
				   StringTokenizer token = new StringTokenizer(s, ":");
				  	 int j=0;
				     while(token.hasMoreTokens()) 
				     {
				         linha[j++] = token.nextToken();
				     }
			     }
		   }
		   if (i>=39 && i<=50) { 
			   ic.setIdentificacaoImovelcomplementoLote(linha[1]);
			 
				   pedacos[2] += s.replaceAll("null","");
			  
		   }
		   if (i==51) {
			   ic.setIdentificacaoImovelSituacao(pedacos[2].replaceAll("null", ""));
		   }
		   ic.setDirectory("ponta_grossa_pr/27251/");
		    ic.setIdentificacaoImovelLinqRequerente("www.tributos.pontagrossa.pr.gov.br");
		    ic.setFile_name("880062.pdf");
		   }
		   
		 bf.close();
		 return ic;
		}


}
