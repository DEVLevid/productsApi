# Products API

Esta é uma API REST desenvolvida em Spring Boot para gerenciamento de produtos.

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

```
src/main/java/com/productsApi/
├── controller/     # Controladores REST
├── model/         # Entidades do banco de dados
├── repository/    # Interfaces de acesso ao banco de dados
├── service/       # Lógica de negócios
└── ProductsApiApplication.java  # Classe principal da aplicação
```

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL 8
- Maven

## Pré-requisitos

- JDK 17 ou superior
- MySQL 8
- Maven
- IDE de sua preferência (recomendado: IntelliJ IDEA ou Eclipse)

## Configuração do Banco de Dados

1. Instale o MySQL 8 se ainda não tiver instalado
2. Crie um banco de dados chamado `produtosdb`:
   ```sql
   CREATE DATABASE produtosdb;
   ```
3. Configure as credenciais do banco de dados no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/produtosdb?useSSL=false&serverTimezone=UTC
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

## Modelo de Dados

### Product
- `id`: Long (chave primária, auto-incremento)
- `name`: String (nome do produto)
- `description`: String (descrição do produto)
- `price`: BigDecimal (preço do produto)
- `registerDate`: LocalDateTime (data de registro)

## Como Executar

1. Clone o repositório
2. Configure o banco de dados conforme instruções acima
3. Execute o projeto usando Maven:
   ```bash
   mvn spring-boot:run
   ```
   Ou execute a classe `ProductsApiApplication.java` diretamente na sua IDE

## Endpoints da API

A API estará disponível em `http://localhost:8080` após a execução.

### Produtos

- `GET /products` - Lista todos os produtos
- `GET /products/{id}` - Busca um produto específico
- `POST /products` - Cria um novo produto
- `PUT /products/{id}` - Atualiza um produto existente
- `DELETE /products/{id}` - Remove um produto

## Configurações Adicionais

O projeto está configurado com:

- Hibernate em modo `update` (atualiza automaticamente o schema do banco)
- Log SQL habilitado para desenvolvimento
- Timezone UTC
- SSL desabilitado para desenvolvimento

## Desenvolvimento

Para contribuir com o projeto:

1. Faça um fork do repositório
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Suporte

Em caso de dúvidas ou problemas, abra uma issue no repositório do projeto. 