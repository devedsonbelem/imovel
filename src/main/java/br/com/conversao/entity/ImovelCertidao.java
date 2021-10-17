package br.com.conversao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "imovelCertidao")
public class ImovelCertidao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	@JsonProperty("directory")
	private String directory;
	@Column
	@JsonProperty("file_name")
	private String file_name;
	@Column
	@JsonProperty("certidao_numero")
	private String certidaoNumero;
	@Column
	@JsonProperty("titulo")
	private String titulo;
	@Column
	private String codigoAutencidade;
	@Column
	@JsonProperty("Identificacao_Contribuinte_CGCM")
	private String identificacaoContribuinteCGCM;
	@Column
	private String identificacaoContribuintecnpjCpf;
	@Column
	private String identificacaoContribuinteCadastroInscricao;
	@Column
	private String identificacaoContribuinteNome;
	@Column
	private String identificacaoContribuinteEndereco;
	@Column
	private String identificacaoContribuinteBairro;
	private String indetificacaoContribuinteComplemento;
	@Column
	private String identificacaoContribuinteMunicipio;
	@Column
	private String identificacaoContribuinteUF;
	@Column
	private String identificacaoContribuinteCep;
	@Column
	private String identificacaoRequerenteNome;
	@Column
	private String identificacaoRequerenteFinalidade;
	@Column
	private String identificacaoRequerenteProtocolo;

	@Column
	private String identificacaoImovelCadastro;
	@Column
	@JsonProperty("ref_cadastral")
	private String identificacaoImovelrefCadastral;
	@Column
	private String identificacaoImovelrefLogradouroNumero;
	@Column
	private String identificacaoImovelBairro;
	@Column
	private String identificacaoImovelComplemento;
	@Column
	private String identificacaoImovelTipoImovel;
	private String identificacaoImovelcomplementoLote;
	@Column
	private String identificacaoImovelLinqRequerente;
	private String identificacaoImovelSituacao;
    private String identificacaoImovelSituacaoFinal;
    
     public ImovelCertidao() {
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
    
	@Override
	public String toString() {
		return "ImovelCertidao [id=" + id + ", directory=" + directory + ", file_name=" + file_name
				+ ", certidaoNumero=" + certidaoNumero + ", titulo=" + titulo + ", codigoAutencidade="
				+ codigoAutencidade + ", identificacaoContribuinteCGCM=" + identificacaoContribuinteCGCM
				+ ", identificacaoContribuintecnpjCpf=" + identificacaoContribuintecnpjCpf
				+ ", identificacaoContribuinteCadastroInscricao=" + identificacaoContribuinteCadastroInscricao
				+ ", identificacaoContribuinteNome=" + identificacaoContribuinteNome
				+ ", identificacaoContribuinteEndereco=" + identificacaoContribuinteEndereco
				+ ", identificacaoContribuinteBairro=" + identificacaoContribuinteBairro
				+ ", indetificacaoContribuinteComplemento=" + indetificacaoContribuinteComplemento
				+ ", identificacaoContribuinteMunicipio=" + identificacaoContribuinteMunicipio
				+ ", identificacaoContribuinteUF=" + identificacaoContribuinteUF + ", identificacaoContribuinteCep="
				+ identificacaoContribuinteCep + ", identificacaoRequerenteNome=" + identificacaoRequerenteNome
				+ ", identificacaoRequerenteFinalidade=" + identificacaoRequerenteFinalidade
				+ ", identificacaoRequerenteProtocolo=" + identificacaoRequerenteProtocolo
				+ ", identificacaoImovelCadastro=" + identificacaoImovelCadastro + ", identificacaoImovelrefCadastral="
				+ identificacaoImovelrefCadastral + ", identificacaoImovelrefLogradouroNumero="
				+ identificacaoImovelrefLogradouroNumero + ", identificacaoImovelBairro=" + identificacaoImovelBairro
				+ ", identificacaoImovelComplemento=" + identificacaoImovelComplemento
				+ ", identificacaoImovelTipoImovel=" + identificacaoImovelTipoImovel
				+ ", identificacaoImovelcomplementoLote=" + identificacaoImovelcomplementoLote
				+ ", identificacaoImovelLinqRequerente=" + identificacaoImovelLinqRequerente
				+ ", identificacaoImovelSituacao=" + identificacaoImovelSituacao + ", identificacaoImovelSituacaoFinal="
				+ identificacaoImovelSituacaoFinal + "]";
	}




 

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
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
	public String getIdentificacaoImovelSituacao() {
		return identificacaoImovelSituacao;
	}
	public void setIdentificacaoImovelSituacao(String identificacaoImovelSituacao) {
		this.identificacaoImovelSituacao = identificacaoImovelSituacao;
	}


	public String getIdentificacaoImovelSituacaoFinal() {
		return identificacaoImovelSituacaoFinal;
	}


	public void setIdentificacaoImovelSituacaoFinal(String identificacaoImovelSituacaoFinal) {
		this.identificacaoImovelSituacaoFinal = identificacaoImovelSituacaoFinal;
	}
 
	 
	
	
	
	

}
