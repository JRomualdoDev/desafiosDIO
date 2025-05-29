
# 🚀 Projeto BootcampPOO

Este projeto foi desenvolvido como parte dos desafios da **trilha Java básico da DIO**, abordando os conceitos de Programação Orientada a Objetos (POO) em Java.

## 🧠 Sobre o Projeto

O projeto simula a criação de um **Bootcamp**, onde é possível cadastrar:

- Cursos
- Mentorias
- Desenvolvedores

Os desenvolvedores podem se inscrever no bootcamp e acompanhar seu progresso, adquirindo XP (experiência) conforme concluem os conteúdos.

## 🛠️ Tecnologias Utilizadas

- Java 🧑‍💻
- Paradigma de Programação Orientada a Objetos (POO)
- IDEs como IntelliJ, Eclipse ou VS Code (recomendado)

## 📦 Estrutura do Projeto

```
BootcampPOO
└── src
    └── br.com.dio.desafio.dominio
        ├── Bootcamp.java
        ├── Conteudo.java
        ├── Curso.java
        ├── Dev.java
        └── Mentoria.java
```

- **Bootcamp.java:** Representa o bootcamp, contendo uma lista de conteúdos e de desenvolvedores inscritos.
- **Conteudo.java:** Classe abstrata que é a base para os conteúdos do bootcamp (curso e mentoria).
- **Curso.java:** Herda de Conteudo, representando um curso.
- **Mentoria.java:** Herda de Conteudo, representando uma mentoria.
- **Dev.java:** Representa o desenvolvedor, que pode se inscrever, progredir e ganhar XP.

## 🚀 Funcionalidades

- Criação de cursos e mentorias.
- Cadastro de bootcamps com seus respectivos conteúdos.
- Inscrição de desenvolvedores.
- Progresso dos desenvolvedores.
- Cálculo de XP adquirido.

## 📜 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/JRomualdoDev/desafiosDIO.git
```

2. Acesse a pasta do projeto:

```bash
cd desafiosDIO/trillha-java-basico/BootcampPOO/BootcampPOO
```

3. Abra o projeto em sua IDE preferida e execute a classe principal.

## ✍️ Autor

- [JRomualdoDev](https://github.com/JRomualdoDev)
