# 📝 Todo List API

API REST para gerenciamento de tarefas (To-Do List), desenvolvida com **Spring Boot**.  
Projeto criado com foco no aprendizado dos conceitos fundamentais de APIs REST, boas práticas HTTP e documentação automática com Swagger.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Springdoc OpenAPI (Swagger)
- Maven

---

## 📌 Funcionalidades

- Criar uma tarefa
- Listar todas as tarefas
- Atualizar uma tarefa existente
- Deletar uma tarefa

---

## 🔗 Endpoints da API

| Método | Endpoint     | Descrição               |
| ------ | ------------ | ----------------------- |
| POST   | `/todo`      | Criar uma nova tarefa   |
| GET    | `/todo`      | Listar todas as tarefas |
| PUT    | `/todo/{id}` | Atualizar uma tarefa    |
| DELETE | `/todo/{id}` | Deletar uma tarefa      |

---

## 📦 Estrutura do objeto Task

```json
{
  "id": "string",
  "title": "string",
  "description": "string",
  "completed": false
}
```

---

## 📘 Documentação da API (Swagger)

- A documentação da API é gerada automaticamente utilizando Swagger (Springdoc OpenAPI).

- Após iniciar a aplicação, acesse:

```
http://localhost:3000/swagger-ui.html
```

---

## ▶️ Como executar o projeto

📋 Pré-requisitos:

- Java 17 ou superior
- Maven

---

## 🔧 Passos para execução

- Clone o repositório:

```
 git clone https://github.com/pedrohrocha18/todoapi.git
```

- Acesse o diretório do projeto:

```
cd todolist-api
```

- Execute a aplicação:

```
 mvn spring-boot:run
```

- A API estará disponível em:

```
http://localhost:3000/todo
```

---

## 📌 Observações

- Os dados são armazenados em memória (lista)

- Ao reiniciar a aplicação, todas as tarefas são perdidas
