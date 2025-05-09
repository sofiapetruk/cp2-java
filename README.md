# CP2

## Integrantes do Grupo

| Nome                  |   RM   |
|:----------------------|:------:|
| João Amorim           | 559213 |
| Lucas de Assis Fialho | 557884 |
| Luiz Kamada           | 557652 |
| Sofia Petruk          | 556585 |


### Descrição do projeto

    Este projeto consiste na criação de uma API REST integrada a um banco de dados Oracle. 
    Ele permite realizar operações de CRUD (Criar, Ler, Atualizar e Deletar) por meio de    
    endpoints HTTP.



### Configuração do proprerties

    spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl
    spring.datasource.username=[seu_login]
    spring.datasource.password=[sua_senha]
    spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
    spring.jpa.hibernate.ddl-auto=update

### Depedências Maven 'pom.xml'
    <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc11</artifactId>
			<version>21.1.0.0</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

###  Spring Initializar
![Captura de tela de 2025-05-07 19-24-25.png](src/img/Captura%20de%20tela%20de%202025-05-07%2019-24-25.png)Spring Initializar


### Endponits do projeto
| Método | Endpoint       | Exemplo                       | Descrição                   |
|--------|----------------|-------------------------------|-----------------------------|
| POST   | [/brinquedos]  | (localhost:8080/brinquedos)   | Cria um novo brinquedo      |
| GET    | [/brinquedos]| (localhost:8080/brinquedos)   | Retorna todos os brinquedos que tem no db |
| GET    | [/brinquedos/{idBrinquedo}]| (localhost:8080/brinquedos/1) | Retorna somente um brinquedo|
| PUT    | [/brinquedos/{idBrinquedo}]| (localhost:8080/brinquedos/1) | Atualiza o brinquedo com id especifico |
| DELETE | [/brinquedos/{idBrinquedo}]| (localhost:8080/brinquedos/1) | Delete o brinquedo com o id especifico |


###Exemplo com imagens

### Get
![Captura de tela de 2025-05-09 20-23-52.png](src/img/Captura%20de%20tela%20de%202025-05-09%2020-23-52.png)

### Post
![Captura de tela de 2025-05-09 20-24-08.png](src/img/Captura%20de%20tela%20de%202025-05-09%2020-24-08.png)

### Delete
![Captura de tela de 2025-05-09 20-24-24.png](src/img/Captura%20de%20tela%20de%202025-05-09%2020-24-24.png)

### Put
![Captura de tela de 2025-05-09 20-24-39.png](src/img/Captura%20de%20tela%20de%202025-05-09%2020-24-39.png)

### Get {id}
![Captura de tela de 2025-05-09 20-26-18.png](src/img/Captura%20de%20tela%20de%202025-05-09%2020-26-18.png)


### Exemplo Json

    {
	"nome" : String,
	"tipo" : String,
	"tamanho": double,
	"preco": double
    }

    {
	"nome" : "Bola",
	"tipo" : "Esporte",
	"tamanho": 5,
	"preco": 25.5
    }
