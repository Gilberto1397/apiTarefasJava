package com.example.apitarefas.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    @Column(name = "nome_tarefa", nullable = false)
	private String nomeTarefa;

    @Column(name = "data_entrega", nullable = false)
    private String dataEntrega;

    @Column(name = "nome_responsavel", nullable = false)
    private String nomeResponsavel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

//    @Override TODO AJUSTAR MÉTODOS
//	public String toString() {
//		return "Tarefa [id=" + id + ", nomeTarefa=" + nomeTarefa + ", dataEntrega=" + dataEntrega + ", nomeResponsavel=" + nomeResponsavel + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, fone, id, nomeTarefa);
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
//				&& Objects.equals(nomeTarefa, other.nomeTarefa);
//	}
}
