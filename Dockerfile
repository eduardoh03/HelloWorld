# Cria uma imagem baseada na OpenJDK v11
FROM openjdk:11

# Cria a pasta /app
RUN mkdir /app

# Copia o artefato de build para a nova pasta
COPY bin/App.class /app

# Define o diretório padrão como /app
WORKDIR /app

# Executa o programa
CMD ["java", "App"]