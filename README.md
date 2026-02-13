# API de Login em Java (Spring Boot)

Projeto simples de autenticação para estudar backend com Java.

## Tecnologias

- Java 17
- Spring Boot 3
- Maven

## Como executar

```bash
mvn spring-boot:run
```

A API sobe em `http://localhost:8080`.

## Endpoint de login

### `POST /api/login`

**Request**

```json
{
  "username": "vinicius",
  "password": "123456"
}
```

**Response (200)**

```json
{
  "token": "<token-gerado>",
  "message": "Login realizado com sucesso"
}
```

**Response (401)**

```json
{
  "message": "Usuário ou senha inválidos"
}
```

## Usuários de teste

- `vinicius` / `123456`
- `admin` / `admin123`
