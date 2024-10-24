# Usar a imagem do JDK como base
FROM openjdk:21-jdk-alpine

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado para o container
COPY target/auth-service-0.0.1-SNAPSHOT.jar app.jar

# Definir o comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
