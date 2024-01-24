**Proyecto Simple-app**

Proyecto realizado para prueba tecnica de automatizacion para la empresa Ilana lab, la cual consiste en navegar sobre la pagina de pruebas https://demoqa.com/ .
El desarrollo fue realizado en lenjuaje JAVA con MAVEN y el framework SELENIUM .

## Instalación

1. Clona el repositorio: `git clone https://github.com/alejoagd/test_ilana.git`
2. Ingresa al directorio del proyecto: `simple-app`
3. Instala las dependencias: `mvn install`
4. Debes tener el ejecutable Chromedriver version 21
5. Debes tener Selenium con la version 4.17

## Uso

Para ejecutar las pruebas realizadas se puede hacer de dos maneras , una es ejecutando desde el IDE directamente los archivos de prueba ubicados en la carpeta tests 
o realizando la ejecucion desde la terminal con los siguientes comandos :
1. si vas a ejecutarlos todos al tiempo  , comparto ejemplo: mvn test
2. Si vas a ejecutarlos de manera individual , comparto un ejemplo: mvn -Dtest=LinksTest test

##**Estructura del Proyecto**
|-- main
|   |--- java
|   |---  | ---- app
|   |---  | ---- tests
|-- test
|   |--- java
|-- Pom.xml

