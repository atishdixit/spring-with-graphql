# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.ext.info.spring-graphql-crud' is invalid and this project uses 'com.ext.info.spring_graphql_crud' instead.

# Getting Started

### Reference Documentation
query{
findAll {
id
name
size
}
}

query{
findOne(id:1){
id
name
size
}
}
mutation{
create(name:"Hello", size:TALL){
id
name
}
}

mutation{
delete(id:2){
id
name
}
}

mutation{
update(id:1, name:"Caffè Americano-1", size:TALL){
id
name
size
}
}


* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.2/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.2/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web.graphql)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

