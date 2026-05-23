# 📚 Sistema de Gerenciamento de Biblioteca

Sistema de console desenvolvido em **Java** para gerenciar o empréstimo de livros de uma biblioteca, aplicando conceitos de orientação a objetos, listas e interação com o usuário.

---

## 🎯 Objetivo

Desenvolver um sistema via terminal que permita ao usuário visualizar os livros disponíveis e realizar o empréstimo de um deles, praticando na prática os conceitos de **classes**, **objetos**, **listas** e **interação com o usuário**.

---

## ⚙️ Como Funciona

```
Início
  └── Deseja ver a lista de livros? (SIM / NÃO)
        ├── NÃO → Mensagem de despedida e encerramento
        └── SIM → Exibe livros disponíveis
                    └── Usuário escolhe um livro pelo ID
                          └── Informa o próprio nome
                                └── Empréstimo registrado com sucesso!
                                      └── Mensagem de despedida e encerramento
```

1. **Início** — O programa pergunta em loop se o usuário deseja ver a lista de livros disponíveis.
2. **Listagem** — Se a resposta for `SIM`, o sistema exibe no console todos os livros ainda não emprestados.
3. **Empréstimo** — O usuário escolhe um livro pelo seu `id`, informa seu nome e confirma o empréstimo. O livro é marcado como indisponível.
4. **Encerramento** — Se a resposta for `NÃO`, ou após a conclusão de um empréstimo, o sistema exibe uma mensagem de despedida e finaliza.

---

## 🏗️ Estrutura do Projeto

```
biblioteca/
├── model/
│   ├── Autor.java
│   ├── Livro.java
│   └── Emprestimo.java
├── service/
│   └── Biblioteca.java
└── Main.java
```

---

## 🧩 Classes e Atributos

### 📖 Livro

Representa um livro cadastrado na biblioteca.

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `id` | `int` | Identificador único do livro |
| `titulo` | `String` | Título do livro |
| `autor` | `Autor` | Objeto do tipo Autor |
| `disponivel` | `boolean` | Indica se o livro está disponível para empréstimo |
| `dataCadastro` | `LocalDate` | Data em que o livro foi cadastrado |
| `dataAtualizacao` | `LocalDate` | Data da última atualização do registro |

---

### ✍️ Autor

Representa o autor de um livro.

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `id` | `int` | Identificador único do autor |
| `nome` | `String` | Nome do autor |
| `dataNascimento` | `LocalDate` | Data de nascimento do autor |

---

### 🔖 Emprestimo

Representa o registro de um empréstimo realizado.

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `id` | `int` | Identificador único do empréstimo |
| `livro` | `Livro` | Objeto do livro emprestado |
| `nomeCliente` | `String` | Nome do cliente que realizou o empréstimo |
| `dataEmprestimo` | `LocalDate` | Data em que o empréstimo foi realizado |
| `dataDevolucao` | `LocalDate` | Data de devolução (pode ser `null` se ainda não devolvido) |

---

### 🏛️ Biblioteca

Classe principal que gerencia todas as listas do sistema.

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| `livros` | `List<Livro>` | Lista de livros cadastrados |
| `autores` | `List<Autor>` | Lista de autores cadastrados |
| `emprestimos` | `List<Emprestimo>` | Lista de empréstimos realizados |

```java
private List<Livro> livros = new ArrayList<>();
private List<Autor> autores = new ArrayList<>();
private List<Emprestimo> emprestimos = new ArrayList<>();
```

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/biblioteca-java.git
   ```

2. Compile o projeto:
   ```bash
   javac Main.java
   ```

3. Execute o programa:
   ```bash
   java Main
   ```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem principal
- **ArrayList** — Estrutura de dados para gerenciar listas
- **Scanner** — Leitura de entrada do usuário via console
- **LocalDate** — Manipulação de datas

---

## 📌 Conceitos Praticados

- Orientação a Objetos (Classes, Objetos, Encapsulamento)
- Composição de objetos (`Livro` contém `Autor`, `Emprestimo` contém `Livro`)
- Listas com `ArrayList`
- Interação com o usuário via console
- Controle de fluxo com loops e condicionais
