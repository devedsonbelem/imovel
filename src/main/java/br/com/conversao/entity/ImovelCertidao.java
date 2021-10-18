package br.com.conversao.entity;

import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

 
 

@Entity
@Table(name = "imovel_certidao")
public class ImovelCertidao {

	@Id
	private String id;
	@JsonProperty("directory")
	@Column(name="directory")
	private String directory;
	@JsonProperty("file_name")
	@Column(name="file_name")
	private String fileName;
	@JsonProperty("certidao_numero")
	@Column(name="certidao_numero")
	private String certidaoNumero;
	@Column
	private String titulo;
	@JsonFormat(pattern="dd/MM/yyyy")
	@JsonProperty("data_emissao")
	@Column(name="data_emissao")
	private java.util.Date dataEmissao;
	@JsonFormat(pattern="dd/MM/yyyy")
	@JsonProperty("data_validade")
	@Column(name="data_validade")
	private java.util.Date dataValidade;
	@JsonProperty("codigo_autencidade")
	@Column(name="codigo_autencidade")
	private String codigoAutencidade;
	@JsonProperty("contribuinte_cgcm")
	@Column(name="contribuinte_cgcm")
	private String identificacaoContribuinteCGCM;
	@JsonProperty("contribuinte_cnpj_cpf")
	@Column(name="contribuinte_cnpj_cpf")
	private String identificacaoContribuintecnpjCpf;
	@JsonProperty("cadastro_inscricao")
	@Column(name="cadastro_inscricao")
	private String identificacaoContribuinteCadastroInscricao;
	@JsonProperty("contribuinte_nome")
	@Column(name="contribuinte_nome")
	private String identificacaoContribuinteNome;
	@JsonProperty("contribuinte_enderereco")
	@Column(name="contribuinte_endereco")
	private String identificacaoContribuinteEndereco;
	@JsonProperty("contribuinte_bairro")
	@Column(name="contribuinte_bairro")
	private String identificacaoContribuinteBairro;
	@JsonProperty("contribuinte_complemento")
	@Column(name="contribuinte_complemento")
	private String indetificacaoContribuinteComplemento;
	@JsonProperty("contribuinte_municipio")
	@Column(name="contribuinte_municipio")
	private String identificacaoContribuinteMunicipio;
	@JsonProperty("contribuinte_uf")
	@Column(name="contribuinte_uf")
	private String identificacaoContribuinteUF;
	@JsonProperty("contribuinte_cep")
	@Column(name="contribuinte_cep")
	private String identificacaoContribuinteCep;
	@JsonProperty("requerente_nome")
	@Column(name="requerente_nome")
	private String identificacaoRequerenteNome;
	@JsonProperty("requerente_fnalidade")
	@Column(name="requerente_finalidade")
	private String identificacaoRequerenteFinalidade;
	@JsonProperty("requerente_protocolo")
	@Column(name="requerente_protocolo")
	private String identificacaoRequerenteProtocolo;
	@JsonProperty("imovel_cadastro")
	@Column(name="imovel_cadastro")
	private String identificacaoImovelCadastro;
	@JsonProperty("ref_cadastral")
	@Column(name="ref_cadastral")
	private String identificacaoImovelrefCadastral;
	@JsonProperty("logradouro_numero")
	@Column(name="logradouro_numero")
	private String identificacaoImovelrefLogradouroNumero;
	@JsonProperty("imovel_bairro")
	@Column(name="imovel_bairro")
	private String identificacaoImovelBairro;
	@JsonProperty("imovel_complemento")
	@Column(name="imovel_complemento")
	private String identificacaoImovelComplemento;
	@JsonProperty("imovel_tipo_imovel")
	@Column(name="imovel_tipo_imovel")
	private String identificacaoImovelTipoImovel;
	@JsonProperty("imovel_complemento_lote")
	@Column(name="imovel_complemento_lote")
	private String identificacaoImovelcomplementoLote;
	@JsonProperty("linq_requerente")
	@Column(name="linq_requerente")
	private String identificacaoImovelLinqRequerente;
	@JsonProperty("imovel_situacao_final")
	@Column(name="imovel_situacao_final")
	@Lob
	@Type(type = "org.hibernate.type.TextType")
	private String identificacaoImovelSituacaoFinal;
	@JsonProperty("imovel_quadra")
	@Column(name="imovel_quadra")
	private String identificacaoImovelQuadra;
	@JsonProperty("imovel_matricula")
	@Column(name="imovel_matricula")
	private String identificacaoImovelMatricula;

	
	public ImovelCertidao() {
	}

 
       
 


	@Override
	public String toString() {
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		return "ImovelCertidao [id=" + id + ", directory=" + directory + ", fileName=" + fileName + 
				", certidaoNumero="
				+ certidaoNumero + ", titulo=" + titulo + ", dataEmissao=" + sdf.format(dataEmissao) + ", dataValidade="
				+ sdf.format(dataValidade) + ", codigoAutencidade=" + codigoAutencidade + ", identificacaoContribuinteCGCM="
				+ identificacaoContribuinteCGCM + ", identificacaoContribuintecnpjCpf="
				+ identificacaoContribuintecnpjCpf + ", identificacaoContribuinteCadastroInscricao="
				+ identificacaoContribuinteCadastroInscricao + ", identificacaoContribuinteNome="
				+ identificacaoContribuinteNome + ", identificacaoContribuinteEndereco="
				+ identificacaoContribuinteEndereco + ", identificacaoContribuinteBairro="
				+ identificacaoContribuinteBairro + ", indetificacaoContribuinteComplemento="
				+ indetificacaoContribuinteComplemento + ", identificacaoContribuinteMunicipio="
				+ identificacaoContribuinteMunicipio + ", identificacaoContribuinteUF=" + identificacaoContribuinteUF
				+ ", identificacaoContribuinteCep=" + identificacaoContribuinteCep + ", identificacaoRequerenteNome="
				+ identificacaoRequerenteNome + ", identificacaoRequerenteFinalidade="
				+ identificacaoRequerenteFinalidade + ", identificacaoRequerenteProtocolo="
				+ identificacaoRequerenteProtocolo + ", identificacaoImovelCadastro=" + identificacaoImovelCadastro
				+ ", identificacaoImovelrefCadastral=" + identificacaoImovelrefCadastral
				+ ", identificacaoImovelrefLogradouroNumero=" + identificacaoImovelrefLogradouroNumero
				+ ", identificacaoImovelBairro=" + identificacaoImovelBairro + ", identificacaoImovelComplemento="
				+ identificacaoImovelComplemento + ", identificacaoImovelTipoImovel=" + identificacaoImovelTipoImovel
				+ ", identificacaoImovelcomplementoLote=" + identificacaoImovelcomplementoLote
				+ ", identificacaoImovelLinqRequerente=" + identificacaoImovelLinqRequerente
				+ ", identificacaoImovelSituacaoFinal="
				+ identificacaoImovelSituacaoFinal + ", identificacaoImovelQuadra=" + identificacaoImovelQuadra
				+ ", identificacaoImovelMatricula=" + identificacaoImovelMatricula + "]";
	}






	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

   
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCertidaoNumero() {
		return certidaoNumero;
	}

	public void setCertidaoNumero(String certidaoNumero) {
		this.certidaoNumero = certidaoNumero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigoAutencidade() {
		return codigoAutencidade;
	}

	public void setCodigoAutencidade(String codigoAutencidade) {
		this.codigoAutencidade = codigoAutencidade;
	}

	public String getIdentificacaoContribuinteCGCM() {
		return identificacaoContribuinteCGCM;
	}

	public void setIdentificacaoContribuinteCGCM(String identificacaoContribuinteCGCM) {
		this.identificacaoContribuinteCGCM = identificacaoContribuinteCGCM;
	}

	public String getIdentificacaoContribuintecnpjCpf() {
		return identificacaoContribuintecnpjCpf;
	}

	public void setIdentificacaoContribuintecnpjCpf(String identificacaoContribuintecnpjCpf) {
		this.identificacaoContribuintecnpjCpf = identificacaoContribuintecnpjCpf;
	}

	public String getIdentificacaoContribuinteCadastroInscricao() {
		return identificacaoContribuinteCadastroInscricao;
	}
  
	
	
	public void setIdentificacaoContribuinteCadastroInscricao(String identificacaoContribuinteCadastroInscricao) {
		this.identificacaoContribuinteCadastroInscricao = identificacaoContribuinteCadastroInscricao;
	}

	public String getIdentificacaoContribuinteNome() {
		return identificacaoContribuinteNome;
	}

	public void setIdentificacaoContribuinteNome(String identificacaoContribuinteNome) {
		this.identificacaoContribuinteNome = identificacaoContribuinteNome;
	}

	public String getIdentificacaoContribuinteEndereco() {
		return identificacaoContribuinteEndereco;
	}

	public void setIdentificacaoContribuinteEndereco(String identificacaoContribuinteEndereco) {
		this.identificacaoContribuinteEndereco = identificacaoContribuinteEndereco;
	}

	public String getIdentificacaoContribuinteBairro() {
		return identificacaoContribuinteBairro;
	}

	public void setIdentificacaoContribuinteBairro(String identificacaoContribuinteBairro) {
		this.identificacaoContribuinteBairro = identificacaoContribuinteBairro;
	}

	public String getIndetificacaoContribuinteComplemento() {
		return indetificacaoContribuinteComplemento;
	}

	public void setIndetificacaoContribuinteComplemento(String indetificacaoContribuinteComplemento) {
		this.indetificacaoContribuinteComplemento = indetificacaoContribuinteComplemento;
	}

	public String getIdentificacaoContribuinteMunicipio() {
		return identificacaoContribuinteMunicipio;
	}

	public void setIdentificacaoContribuinteMunicipio(String identificacaoContribuinteMunicipio) {
		this.identificacaoContribuinteMunicipio = identificacaoContribuinteMunicipio;
	}

	public String getIdentificacaoContribuinteUF() {
		return identificacaoContribuinteUF;
	}

	public void setIdentificacaoContribuinteUF(String identificacaoContribuinteUF) {
		this.identificacaoContribuinteUF = identificacaoContribuinteUF;
	}

	public String getIdentificacaoContribuinteCep() {
		return identificacaoContribuinteCep;
	}

	public void setIdentificacaoContribuinteCep(String identificacaoContribuinteCep) {
		this.identificacaoContribuinteCep = identificacaoContribuinteCep;
	}

	public String getIdentificacaoRequerenteNome() {
		return identificacaoRequerenteNome;
	}

	public void setIdentificacaoRequerenteNome(String identificacaoRequerenteNome) {
		this.identificacaoRequerenteNome = identificacaoRequerenteNome;
	}

	public String getIdentificacaoRequerenteFinalidade() {
		return identificacaoRequerenteFinalidade;
	}

	public void setIdentificacaoRequerenteFinalidade(String identificacaoRequerenteFinalidade) {
		this.identificacaoRequerenteFinalidade = identificacaoRequerenteFinalidade;
	}

	public String getIdentificacaoRequerenteProtocolo() {
		return identificacaoRequerenteProtocolo;
	}

	public void setIdentificacaoRequerenteProtocolo(String identificacaoRequerenteProtocolo) {
		this.identificacaoRequerenteProtocolo = identificacaoRequerenteProtocolo;
	}

	public String getIdentificacaoImovelCadastro() {
		return identificacaoImovelCadastro;
	}

	public void setIdentificacaoImovelCadastro(String identificacaoImovelCadastro) {
		this.identificacaoImovelCadastro = identificacaoImovelCadastro;
	}

	public String getIdentificacaoImovelrefCadastral() {
		return identificacaoImovelrefCadastral;
	}

	public void setIdentificacaoImovelrefCadastral(String identificacaoImovelrefCadastral) {
		this.identificacaoImovelrefCadastral = identificacaoImovelrefCadastral;
	}

	public String getIdentificacaoImovelrefLogradouroNumero() {
		return identificacaoImovelrefLogradouroNumero;
	}

	public void setIdentificacaoImovelrefLogradouroNumero(String identificacaoImovelrefLogradouroNumero) {
		this.identificacaoImovelrefLogradouroNumero = identificacaoImovelrefLogradouroNumero;
	}

	public String getIdentificacaoImovelBairro() {
		return identificacaoImovelBairro;
	}

	public void setIdentificacaoImovelBairro(String identificacaoImovelBairro) {
		this.identificacaoImovelBairro = identificacaoImovelBairro;
	}

	public String getIdentificacaoImovelComplemento() {
		return identificacaoImovelComplemento;
	}

	public void setIdentificacaoImovelComplemento(String identificacaoImovelComplemento) {
		this.identificacaoImovelComplemento = identificacaoImovelComplemento;
	}

	public String getIdentificacaoImovelTipoImovel() {
		return identificacaoImovelTipoImovel;
	}

	public void setIdentificacaoImovelTipoImovel(String identificacaoImovelTipoImovel) {
		this.identificacaoImovelTipoImovel = identificacaoImovelTipoImovel;
	}

	public String getIdentificacaoImovelcomplementoLote() {
		return identificacaoImovelcomplementoLote;
	}

	public void setIdentificacaoImovelcomplementoLote(String identificacaoImovelcomplementoLote) {
		this.identificacaoImovelcomplementoLote = identificacaoImovelcomplementoLote;
	}

	public String getIdentificacaoImovelLinqRequerente() {
		return identificacaoImovelLinqRequerente;
	}

	public void setIdentificacaoImovelLinqRequerente(String identificacaoImovelLinqRequerente) {
		this.identificacaoImovelLinqRequerente = identificacaoImovelLinqRequerente;
	}

 

	public String getIdentificacaoImovelSituacaoFinal() {
		return identificacaoImovelSituacaoFinal;
	}

	public void setIdentificacaoImovelSituacaoFinal(String identificacaoImovelSituacaoFinal) {
		this.identificacaoImovelSituacaoFinal = identificacaoImovelSituacaoFinal;
	}

	public java.util.Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(java.util.Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public java.util.Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(java.util.Date dataValidade) {
		this.dataValidade = dataValidade;
	}



	public String getIdentificacaoImovelQuadra() {
		return identificacaoImovelQuadra;
	}



	public void setIdentificacaoImovelQuadra(String identificacaoImovelQuadra) {
		this.identificacaoImovelQuadra = identificacaoImovelQuadra;
	}



	public String getIdentificacaoImovelMatricula() {
		return identificacaoImovelMatricula;
	}



	public void setIdentificacaoImovelMatricula(String identificacaoImovelMatricula) {
		this.identificacaoImovelMatricula = identificacaoImovelMatricula;
	}


  

	
	
}
