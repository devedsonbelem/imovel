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
	private String identificacaoContribuintebairro;
	@Column
	private String identificacaoContribuintemunicipio;
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

	public ImovelCertidao() {
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

	public String getIdentificacaoContribuintebairro() {
		return identificacaoContribuintebairro;
	}

	public void setIdentificacaoContribuintebairro(String identificacaoContribuintebairro) {
		this.identificacaoContribuintebairro = identificacaoContribuintebairro;
	}

	 
	 

	public ImovelCertidao(Long id, String directory, String file_name, String certidaoNumero, String titulo,
			String codigoAutencidade, String identificacaoContribuinteCGCM, String identificacaoContribuintecnpjCpf,
			String identificacaoContribuinteCadastroInscricao, String identificacaoContribuinteNome,
			String identificacaoContribuinteEndereco, String identificacaoContribuintebairro,
			String identificacaoContribuintemunicipio, String identificacaoContribuinteUF,
			String identificacaoContribuinteCep, String identificacaoRequerenteNome,
			String identificacaoRequerenteFinalidade, String identificacaoRequerenteProtocolo,
			String identificacaoImovelCadastro, String identificacaoImovelrefCadastral,
			String identificacaoImovelrefLogradouroNumero, String identificacaoImovelBairro,
			String identificacaoImovelComplemento, String identificacaoImovelTipoImovel,
			String identificacaoImovelcomplementoLote, String identificacaoImovelLinqRequerente,
			String identificacaoImovelSituacao) {
		super();
		this.id = id;
		this.directory = directory;
		this.file_name = file_name;
		this.certidaoNumero = certidaoNumero;
		this.titulo = titulo;
		this.codigoAutencidade = codigoAutencidade;
		this.identificacaoContribuinteCGCM = identificacaoContribuinteCGCM;
		this.identificacaoContribuintecnpjCpf = identificacaoContribuintecnpjCpf;
		this.identificacaoContribuinteCadastroInscricao = identificacaoContribuinteCadastroInscricao;
		this.identificacaoContribuinteNome = identificacaoContribuinteNome;
		this.identificacaoContribuinteEndereco = identificacaoContribuinteEndereco;
		this.identificacaoContribuintebairro = identificacaoContribuintebairro;
		this.identificacaoContribuintemunicipio = identificacaoContribuintemunicipio;
		this.identificacaoContribuinteUF = identificacaoContribuinteUF;
		this.identificacaoContribuinteCep = identificacaoContribuinteCep;
		this.identificacaoRequerenteNome = identificacaoRequerenteNome;
		this.identificacaoRequerenteFinalidade = identificacaoRequerenteFinalidade;
		this.identificacaoRequerenteProtocolo = identificacaoRequerenteProtocolo;
		this.identificacaoImovelCadastro = identificacaoImovelCadastro;
		this.identificacaoImovelrefCadastral = identificacaoImovelrefCadastral;
		this.identificacaoImovelrefLogradouroNumero = identificacaoImovelrefLogradouroNumero;
		this.identificacaoImovelBairro = identificacaoImovelBairro;
		this.identificacaoImovelComplemento = identificacaoImovelComplemento;
		this.identificacaoImovelTipoImovel = identificacaoImovelTipoImovel;
		this.identificacaoImovelcomplementoLote = identificacaoImovelcomplementoLote;
		this.identificacaoImovelLinqRequerente = identificacaoImovelLinqRequerente;
		this.identificacaoImovelSituacao = identificacaoImovelSituacao;
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
				+ ", identificacaoContribuintebairro=" + identificacaoContribuintebairro
				+ ", identificacaoContribuintemunicipio=" + identificacaoContribuintemunicipio
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
				+ ", identificacaoImovelSituacao=" + identificacaoImovelSituacao + "]";
	}

	public String getIdentificacaoContribuintemunicipio() {
		return identificacaoContribuintemunicipio;
	}

	public void setIdentificacaoContribuintemunicipio(String identificacaoContribuintemunicipio) {
		this.identificacaoContribuintemunicipio = identificacaoContribuintemunicipio;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public String getCodigoAutencidade() {
		return codigoAutencidade;
	}

	public void setCodigoAutencidade(String codigoAutencidade) {
		this.codigoAutencidade = codigoAutencidade;
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

	public String getIdentificacaoRequerenteNome() {
		return identificacaoRequerenteNome;
	}

	public void setIdentificacaoRequerenteNome(String identificacaoRequerenteNome) {
		this.identificacaoRequerenteNome = identificacaoRequerenteNome;
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

	public String getIdentificacaoImovelcomplementoLote() {
		return identificacaoImovelcomplementoLote;
	}

	public void setIdentificacaoImovelcomplementoLote(String identificacaoImovelcomplementoLote) {
		this.identificacaoImovelcomplementoLote = identificacaoImovelcomplementoLote;
	}

	public String getIdentificacaoImovelTipoImovel() {
		return identificacaoImovelTipoImovel;
	}

	public void setIdentificacaoImovelTipoImovel(String identificacaoImovelTipoImovel) {
		this.identificacaoImovelTipoImovel = identificacaoImovelTipoImovel;
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
	
	

}
