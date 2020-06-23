# Init commands
## spring init --build=maven --java-version=1.8 --package-name=br.veni --name=App1 --dependencies=websocket,web,flyway,web --packaging=jar app.zip
## jar -xvf app.zip

# add to pom.xml
## <dependency>
##    <groupId>org.xerial</groupId>
##    <artifactId>sqlite-jdbc</artifactId>
##    <version>3.25.2</version>
## </dependency>

# run tests
mvn test
mvn -Dtest=TestApp1 test

# migrate
mvn flyway:migrate -Dflyway.configFiles=src\main\resources\application.properties
# clean
mvn flyway:clean -Dflyway.configFiles=src\main\resources\application.properties
# repair
mvn flyway:repair -Dflyway.configFiles=src\main\resources\application.properties



# use dbbeaver
## add h2 embeded and url D:\java_apps\spring-migration\src\main\resources\db\database (database is database.mv.db)