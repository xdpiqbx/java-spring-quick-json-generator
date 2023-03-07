if [ ! -f "./target/QuickJsonGenerator.jar" ]; then
    mvn clean install && java -jar ./target/QuickJsonGenerator.jar
else
    java -jar ./target/QuickJsonGenerator.jar
fi