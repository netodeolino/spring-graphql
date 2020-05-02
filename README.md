# 

[![GitHub stars](https://img.shields.io/github/stars/netodeolino/study-graphql)](https://github.com/netodeolino/study-graphql/stargazers)
[![GitHub issues](https://img.shields.io/github/issues/netodeolino/study-graphql)](https://github.com/netodeolino/study-graphql/issues)
[![GitHub forks](https://img.shields.io/github/forks/netodeolino/study-graphql)](https://github.com/netodeolino/study-graphql/network)

<p align="center">
  <h2 align="center">Spring Boot - GraphQL Study</h2>
</p>


### Info
 
1. Schema
```
http://localhost:8080/graphql/schema.json
```
2. GraphQL endpoint
```
http://localhost:8080/graphql
```

#### Create User
```graphql
mutation {
  createUser(user: {
    name: "Neto",
    email: "neto@email.com"
  }) {
    name,
    email
  }
}
```

#### Create Book
```graphql
mutation {
  createBook(email: "neto@email.com", book: {
    title: "GraphQL For You"
  }) {
    title
  }
}
```

#### Find User
```graphql
query {
  findUser(email: "neto@email.com") {
    email
    name
    books {
      title
    }
  }
}
```

#### Find Book
```graphql
query {
  findBook(title: "GraphQL For You") {
    title
    userOwner {
        name,
        email
    }
  }
}
```