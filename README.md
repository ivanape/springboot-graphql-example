# springboot-graphql-example

Example of GraphQL application with Spring Boot.

## How to run?

The example uses MySQL as backend database. You can create a MySQL instance running:

```
docker-compose up -d
```

You can access to a `phpmyadmin` instance on http://localhost:8183/.

At the MySQL startup, the `mysql-dump/schema.sql` file will be executed which will create an example database.

Now you can build source code by typing:

```
./mvnw clean install
```

To start simply type:

```
./mvnw spring-boot:run
````


## Test GraphQL API

You can test GraphSQL API in:

http://localhost:8080/graphiql


