# API de Tarefas

## 📝 Descrição

API RESTful para gerenciamento de tarefas, permitindo realizar operações CRUD (Create, Read, Update, Delete) de tarefas.
Cada tarefa possui nome, data de entrega e responsável.

## 🚀 Tecnologias Utilizadas

- **Java 21** - Linguagem de programação
- **Spring Boot 3.5.6** - Framework para desenvolvimento de aplicações Java
- **Spring Data JPA** - Abstração para persistência de dados
- **Hibernate** - Framework ORM para mapeamento objeto-relacional
- **SQLite** - Banco de dados relacional leve
- **Maven** - Gerenciador de dependências e build

## 📋 Endpoints

### Listar todas as tarefas

```
GET http://localhost:8080/tarefas
```

### Criar nova tarefa

```
POST http://localhost:8080/tarefas
Body: {
  "nome": "Nome da tarefa",
  "dataEntrega": "DD/MM/YYYY",
  "responsavel": "Nome do responsável"
}
```

### Atualizar tarefa

```
PUT http://localhost:8080/tarefas/{id}
Body: {
  "nome": "Nome da tarefa",
  "dataEntrega": "DD/MM/YYYY",
  "responsavel": "Nome do responsável"
}
```

### Deletar tarefa

```
DELETE http://localhost:8080/tarefas/{id}
```

## 🔧 Como Executar

1. Clone o repositório
2. Execute o comando:
   ```bash
   ./mvnw spring-boot:run
   ```
   Ou no Windows:
   ```bash
   mvnw.cmd spring-boot:run

## 💾 Banco de Dados

O projeto utiliza SQLite com arquivo `apitarefas.sqlite` na raiz do projeto. O banco é criado automaticamente na
primeira execução.

