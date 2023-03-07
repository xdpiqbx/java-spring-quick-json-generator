if not exist ".\target\QuickJsonGenerator.jar" (
    mvn clean install && java -jar .\target\QuickJsonGenerator.jar
) else (
    java -jar .\target\QuickJsonGenerator.jar
)