````markdown
# Atividade Spring Boot

## 📌 Objetivo
Esta aplicação foi desenvolvida como atividade prática para treinar conceitos básicos de **Spring Boot**.  
O objetivo é criar uma API simples com dois endpoints, sem necessidade de banco de dados, que retornam mensagens de boas-vindas.

---

## 🚀 Como executar localmente

1. Certifique-se de ter o **Java 17+** e o **Maven** instalados na sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/eduardoferreiralima/spring-boot.git
````

3. Acesse a pasta do projeto:

   ```bash
   cd Atividade_Spring_Boot
   ```
4. Execute a aplicação com o Maven:

   ```bash
   mvn spring-boot:run
   ```
5. A aplicação estará disponível em:

   ```
   http://localhost:8080/api
   ```

---

## 📡 Endpoints disponíveis

### 1. **Mensagem de boas-vindas**

* **Rota:** `GET /api/hello`
* **Descrição:** retorna uma mensagem simples de boas-vindas.
* **Exemplo de resposta:**

  ```json
  "Bem-vindo à aplicação Spring Boot!"
  ```

---

### 2. **Mensagem personalizada**

* **Rota:** `GET /api/message?name={nome}`
* **Descrição:** retorna uma mensagem personalizada com o nome do aluno informado.
* **Parâmetro:**

    * `name` → opcional, caso não seja informado assume o valor `"User"`.
* **Exemplo de requisição:**

  ```
  http://localhost:8080/api/message?name=Eduardo
  ```
* **Exemplo de resposta:**

  ```json
  {
    "id": 1,
    "content": "Olá, Eduardo! Seja bem vindo!"
  }
  ```

---

## 🛠 Tecnologias utilizadas

* Java 17+
* Spring Boot
* Maven

---

## 📂 Estrutura do projeto

```
src/
 └── main/
      ├── java/
      │    └── br/com/eduardo/Atividade_Spring_Boot/
      │          ├── controller/HelloController.java
      │          └── model/Hello.java
      └── resources/
           └── application.yml
```

---

✍️ **Autor:** Eduardo

```


