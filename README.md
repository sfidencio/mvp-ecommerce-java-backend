# Documentação do Projeto

[![CI/CD pipeline for Multi-Module Project in develop](https://github.com/sfidencio/mvp-ecommerce-java-backend/actions/workflows/ci-cd-develop.yaml/badge.svg?branch=develop)](https://github.com/sfidencio/mvp-ecommerce-java-backend/actions/workflows/ci-cd-develop.yaml)

## Sumário

1. [Introdução](#introducao)
2. [Pré-requisitos](#pre-requisitos)
3. [Configuração](#configuracao)
4. [Execução](#execucao)
5. [Uso](#uso)
6. [Exemplos de Código](#exemplos-de-codigo)
7. [Estrutura de Pastas](#estrutura-de-pastas)
8. [Contribuição](#contribuicao)
9. [Licença](#licenca)
10. [Configuração Multi-Project Maven](#configuracao-multi-project-maven)
11. [Referências](#referencias)


---

## 1. Introdução <a name="introducao"></a>

Uma breve descrição do projeto:

- O que é o projeto?
  - MVP de um e-commerce.
- Objetivo principal
  - Abordar o uso de diversas tecnologias no backend.
- Tecnologias utilizadas
  - Java, Spring, Rabbitmq, MongoDB(noSQL), MariaDB(SQL), Rest, Patterns e boas práticas de desenvolvimento de software.

### Por que este projeto é importante?

- Benefícios
  - Exercício e treinamento para nos prepararmos melhor para uma aplicação real, onde exige resiliência, segurança, escalabilidade.

---

## 2. Pré-requisitos <a name="pre-requisitos"></a>

### Pré-requisitos

1. Conhecimentos de Java
2. Programação:
   3. Orientação à Objetos
   4. Funcional
5. Rest
6. JSON
7. Protocolo Http 
5. Mensageria
6. Banco de dados SQL e noSQL
7. Microserviços
8. SOLID
9. Design Patterns
10. Clean Arch 
11. Hexagonal Arch
12. Orquestradores de Conteinêrs
13. Cloud Computing (AWS)



## 3. Configuração <a name="configuracao"></a>

- Instruções instalação docker no WSL2/Linux: 
  - https://github.com/sfidencio/my-study-projects/blob/master/explorando-configuracao-ambiente-windows-wsl2-ubuntu-shell-zshrc/README.md
- Instalação do minikube - executando kubernetes localmente:
  - https://minikube.sigs.k8s.io/docs/

---


## 4. Execução <a name="execucao"></a>
### Passos para execução local de forma simples

```bash
# Clonar o repositório
git clone git@github.com:sfidencio/mvp-ecommerce-java.git

# Entrar no diretório clonado
cd mvp-ecommerce-java/core

# Executar o build
mvn clean install

# Subir aplicações individuais ou cada módulo.

# Comando para subir o serviço discovery-service
mvn -pl discovery-service spring-boot:run

# Comando para subir o serviço gateway-service
mvn -pl gateway-service spring-boot:run

# Comando para subir o serviço product-service
mvn -pl product-service spring-boot:run


# Fazer a mesma coisa para os demais serviços.

```
### Passos para execução local de forma dockerizada



## 5. Uso <a name="uso"></a>

### Executando o projeto

```bash
# Inicializando o servidor
java -jar seu-projeto.jar
```

### Exemplos de entrada e saída

- Entrada: `http://localhost:8080/api`
- Saída esperada:
  ```json
  {
      "status": "success",
      "data": "Exemplo"
  }
  ```

---

## 6. Exemplos de Código <a name="exemplos-de-codigo"></a>

### Exemplos de funcionalidade principal:

```java
public void exemploMetodo() {
    System.out.println("Este é um exemplo de código.");
}
```

### Exemplo de chamada de API

```bash
curl -X GET http://localhost:8080/api/exemplo
```

---

## 7. Estrutura de Pastas <a name="estrutura-de-pastas"></a>

```plaintext

mvp-ecommerce-java/
│
├── core/
│   ├── discovery-service/
│   │   ├── src/
│   │   │   └── main/
│   │   │       └── java/
│   │   ├── pom.xml
│   │   └── application.yml
│   │
│   ├── gateway-service/
│   │   ├── src/
│   │   │   └── main/
│   │   │       └── java/
│   │   ├── pom.xml
│   │   └── application.yml
│   │
│   ├── product-service/
│   │   ├── src/
│   │   │   └── main/
│   │   │       └── java/
│   │   ├── pom.xml
│   │   └── application.yml
│   │
│   └── ...
│
├── docker/
│   ├── docker-compose.yml
│   ├── configs/
│   │   └── ...
│
├── kubernetes/
│   ├── minikube/
│   │   └── deployment.yaml
│   ├── services/
│   │   └── ...
│
└── README.md
```

---

## 8. Contribuição <a name="contribuicao"></a>

1. Siga as etapas abaixo para contribuir:
    - `fork` o repositório
    - Crie um branch para sua feature: `git checkout -b minha-feature`
    - Faça um commit das alterações: `git commit -m "Descrição da alteração"`
    - Envie para o branch remoto: `git push origin minha-feature`
    - Abra um Pull Request

2. Regras de Contribuição:
    - Siga o padrão de código
    - Inclua comentários explicativos para o código

---

## 9. Licença <a name="licenca"></a>

Este projeto está licenciado sob a licença [MIT](LICENSE).

---

## 10. Configuração Multi-Project Maven <a name="configuracao-multi-project-maven"></a>

 1. Geralmente a configuração do projeto multi-módulo seria assim, os sub-projetos
 
 - pom.xml de um dos sub-projetos
```xml
   <parent>
        <groupId>com.github.sfidencio</groupId>
        <artifactId>core</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
    </parent>
```
 - pom.xml do projeto core

```xml
    <modules>
        <module>discovery-service</module>
        <module>gateway-service</module>
        <module>config-service</module>
        <module>product-service</module>
    </modules>
```

2. No entato, para funcionamento dockerizado, teremos que fazer um ajuste

3. Configuração WSL2 para acessar as aplicações através do navegador ou qualquer outra aplicação que esteja rodando no Windows.
    - https://github.com/sfidencio/my-study-projects/blob/master/dicas-macetes-ferramentas/README.md
      - Basta procurar por "Configuração WSL para funcionar em modo NAT e encaminhando solicitações oriundas do host-> wsl, vice-versa."


## 11. Referências <a name="referencias"></a>

- [Documentação Oficial Java](https://docs.oracle.com/en/java/)
- [Link para algum recurso relevante](https://www.exemplo.com)


