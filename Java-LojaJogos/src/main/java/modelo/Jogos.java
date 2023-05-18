package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int dataLancamento;
	private String genero;
	private String plataforma;
	private int tempoDeJogo;
	
	public Jogos() {
		
	}
	
	public Jogos(String nome, int dataLancamento, String genero, String plataforma, int tempoDeJogo,
			String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.plataforma = plataforma;
		this.tempoDeJogo = tempoDeJogo;
		this.descricao = descricao;
	}
	
	public Jogos(Long id, String nome, int dataLancamento, String genero, String plataforma, int tempoDeJogo,
			String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.genero = genero;
		this.plataforma = plataforma;
		this.tempoDeJogo = tempoDeJogo;
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(int dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public int getTempoDeJogo() {
		return tempoDeJogo;
	}
	public void setTempoDeJogo(int tempoDeJogo) {
		this.tempoDeJogo = tempoDeJogo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	private String descricao;
	
	
}
