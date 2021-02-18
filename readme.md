# Passos
1. Inclua um arquivo .gitignore
2. Inclua a pasta target no .gitignore
3. Rode o comando `mvn package`
4. Rode o comando `java -jar target/endorsed/webapp-runner.jar --port $PORT target/MavenWebProject-1.0-SNAPSHOT.war`
    * Substituindo o `$PORT` pela porta que você desejar usar....
    * Por exemplo: se for usar a porta 3333 para testar basta acessar http://localhost:3333