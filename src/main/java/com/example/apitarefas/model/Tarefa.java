package com.example.apitarefas.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name = "nome", nullable = false)
	private String nome;

    @Column(name = "data_entrega", nullable = false)
    private String dataEntrega;

    @Column(name = "responsavel", nullable = false)
    private String responsavel;
	
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

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

//    @Override TODO AJUSTAR MÉTODOS
//	public String toString() {
//		return "Tarefa [id=" + id + ", nome=" + nome + ", dataEntrega=" + dataEntrega + ", responsavel=" + responsavel + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, fone, id, nome);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Tarefa other = (Tarefa) obj;
//		return Objects.equals(email, other.email) && Objects.equals(fone, other.fone) && Objects.equals(id, other.id)
//				&& Objects.equals(nome, other.nome);
//	}
}
