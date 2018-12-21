## Log4j + Mongodb

Exemplo de integração entre o log4j e o mongodb.


Pré requisitos:

* Subir container mongodb

```sh
docker run -d -p 27017:27017 -p 28017:28017 -e MONGODB_DATABASE="logs" -e MONGODB_USER="sda" -e MONGODB_PASS="123456" --name logs-mongo tutum/mongodb:2.6
```

* Rodar a classe Main.java


* Verificar se o log foi persistido:

```sh
db.logs.find({})
```





