# Proyecto-Calidad-del-Software
## Proyecto desarrollado en el curso Calidad del Software - Grupo 04

### Pasos para la instalacion  y configuracion del ambiente de trabajo(Instalacion del IDE, Framework Selenium WebDriver, y configuracion de todo el ambiente):


- Paso 1: Instalar el JAVA JDK de última versión. 
##### Se procede a instalar Java en el computador, para esto ingresamos a la página oficial de Oracle y buscamos la última versión del JDK (Java Software Development Kit) junto al archivo que corresponda con nuestro sistema operativo, en nuestro caso Windows X64. 

![1](https://user-images.githubusercontent.com/105895649/177057481-c52b4337-ec75-41fe-b83d-d39b7303c204.jpg)

###### Página oficial Oracle, directorio instaladores Java SE Development Kit en su última versión disponible. [1] 
##### Para confirmar que todo ocurrió de la manera correcta se abre el cmd de Windows y se escribe el comando “java”. 

- Paso 2: Instalar el IDE a utilizar, en este caso Eclipse. 
##### Luego de instalar el JDK hay que instalar el ide, que en nuestro caso será Eclipse IDE. Para esto nos dirigimos a la página oficial y buscamos la última versión del IDE. 

![2](https://user-images.githubusercontent.com/105895649/177057496-0fe0c367-ead1-4732-9878-aa73925e3979.jpg)
###### Página oficial Eclipse, descarga para Windows 64 bits en su última versión disponible. [2] 

- Paso 3: Ejecutar el archivo descargado y seleccionar la opción de Eclipse IDE for Java Developers. 
![3](https://user-images.githubusercontent.com/105895649/177057520-2db4cce0-fa88-4e11-829f-ef7dfe349a70.jpg)


###### Aplicación Eclipse, primera fase del instalador 

- Paso 4: Cambiar el directorio predeterminado a una carpeta con fácil acceso e instalar. 
![4](https://user-images.githubusercontent.com/105895649/177057521-90e80f2b-e2d3-4413-b3be-15b9bb0f3e8e.jpg)

###### Aplicación Eclipse, selector del directorio en el instalador

- Paso 5: Ejecutar el botón de Launch 

![5](https://user-images.githubusercontent.com/105895649/177057522-c67e8dd9-4ca0-492b-845c-4e35bf293de5.jpg)

###### Aplicación Eclipse, finalización del instalador 

- Paso 6: Seleccionamos la carpeta en la cual se guardarán los proyectos desarrollados en el futuro.
![6](https://user-images.githubusercontent.com/105895649/177057517-605b0988-9d0d-410a-a01a-2ec1a5a3412d.jpg)


###### Aplicación Eclipse, selector de directorio 

- Paso 7: Ingresar a  https://www.selenium.dev/downloads/ (Página oficial de Selenium, apartado de descargas. [4])  una vez en la página buscamos la sección Selenium Clients and WebDriver Lenguaje Bindings, en nuestro caso usaremos Java como lenguaje de uso para el desarrollo del proyecto.

![7](https://user-images.githubusercontent.com/105895649/177057518-1670c171-db27-474c-a9ed-6e909ce9e156.jpg)

###### Pagina oficial de Selenium, apartado de descargas para java. 

##### En este link vamos a obtener un archivo de tipo .zip, el cual se debe descomprimir en un lugar donde tengamos facilidad para usarlo y buscar los Jar Files que luego importaremos desde Eclipse IDE el cual ya lo hemos instalado. 

- Paso 8: En este paso configuraremos el Eclipse IDE con el Selenium WebDriver, es importante aclarar que para esto ya tenemos que haber seguido los pasos anteriores con éxito.

###### En Eclipse IDE crearemos un nuevo proyecto. 

Seleccionamos las siguientes opciones:   

-- “Use an execution environment JRE” aquí ponemos la última versión disponible. 

-- “Create separate folders for sources and class files” 

-- Nombramos el nuevo proyecto y luego damos click en “Finish”. 

![8](https://user-images.githubusercontent.com/105895649/177057519-57d05bcd-8693-43c9-9ea9-05705423c6d8.jpg)

###### Aplicación Eclipse, apartado de creación de proyectos 

- Paso 9: Crear un nuevo paquete en el proyecto 

![9](https://user-images.githubusercontent.com/105895649/177057596-af8626d6-41e8-4d69-b8cb-d9197a7ea7e3.jpg)

###### Aplicación Eclipse, apartado de creación de un paquete en el proyecto

- Paso 10: Luego creamos una nueva clase en el paquete creado anteriormente, damos click derecho y seleccionamos New Class.

![10](https://user-images.githubusercontent.com/105895649/177057597-5e6fff08-bf70-4504-8011-bd053a01cb38.jpg)

###### Aplicación Eclipse, apartado de creación de una clase en el paquete

- Paso 11:  De esta manera tendremos el proyecto Java creado, ahora procedemos a la configuración de Selenium WebDriver en el proyecto siguiendo los siguientes pasos.
###### Click derecho en el proyecto. 

###### Vamos a properties dialog. 

###### Click en “Java Build Path”. 

###### Click en “Libraries”. 

###### Click en “Add External Jars...”. 

###### Seleccionamos todo lo que se encuentre en la carpeta lib del zip descomprimido anteriormente. 

###### Luego todo lo que se encuentra fuere de la carpeta lib. 

###### Ahora pueden darse errores por el Java Buid Path para esto es necesario encontrar un jdk que este instalado y funcione adecuadamente. 

![11](https://user-images.githubusercontent.com/105895649/177057598-386e2a4f-4d88-4bc9-b056-501ae21d71fe.jpg)

###### Aplicación Eclipse, apartado de propiedades de un proyecto sección de ”libraries”.

- Paso 12: Seleccionar el archivo descargado en el paso 7 y seleccionar “Apply and Close”. 
- 
![12](https://user-images.githubusercontent.com/105895649/177057613-702da349-5e24-48b7-a1fe-8946da25cdf1.jpg)

###### Aplicación Eclipse, apartado de proyectos 

- Paso 13: Verificar que se visualice así: 

![13](https://user-images.githubusercontent.com/105895649/177057616-a22198a0-1563-4a8e-b584-89312edf86db.jpg)

###### Aplicación Eclipse, apartado de proyectos 

- Paso 14: Instalar el ChromeDriver.exe desde https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.61/ 

![14](https://user-images.githubusercontent.com/105895649/177057636-00411b71-48c8-48ce-83dd-17292d882429.jpg)

###### Página oficial de ChromeDriver, directorio de versiones de descarga. 

- Paso 15: En la clase creada se deben importar dos paquetes: “org.openqa.selenium.WebDriver”  y propiamente el driver del navegador usado, en este caso para Chrome es: “org.openqa.selenium.chrome.ChromeDriver”. 

![15](https://user-images.githubusercontent.com/105895649/177057639-b338b931-5c0c-40af-a712-e7c5675e952f.jpg)

###### Aplicación Eclipse, codigo en la clase creada.

- Paso 16: En el código dentro del método main se debe setear el Driver junto al Chrome Driver descargado de la siguiente manera: 

![16](https://user-images.githubusercontent.com/105895649/177057648-d4ca44da-cbde-44b3-9315-4de3acddbadc.jpg)

###### Aplicación Eclipse, codigo en la clase creada.

- Paso 17: Siguiendo el código main se establecen las variables y su url. En este caso se utiliza https://demo.prestashop.com/#/en/front debido a que es la página seleccionada para el proyecto. 

![17](https://user-images.githubusercontent.com/105895649/177057653-6b50c2fa-d7b6-4c6d-a686-0f6becee1bda.jpg)

###### Aplicación Eclipse, código de inicialización de variables en la clase creada. 

- Paso 18: Se establece el código que abre Chrome y guarda el título del URL y se guarda en la variable. 

![18](https://user-images.githubusercontent.com/105895649/177057666-1ddc4f0c-2958-4288-a2e5-925d2b581ea5.jpg)

###### Aplicación Eclipse, código para abrir página de prueba en Google Chrome en la clase creada. 

- Paso 19: Se compara por medio de un if con un .contentEquals y se imprime en consola el resultado. 

![19](https://user-images.githubusercontent.com/105895649/177057668-b9a0119f-cba4-45fb-8451-88288177a167.jpg)

###### Aplicación Eclipse, código para comparar títulos en la clase creada. 

- Paso 20: Guardar el código y ejecutarlo. 

![20](https://user-images.githubusercontent.com/105895649/177057684-a3afda33-9614-451c-90b8-3a4757f8b454.jpg)

###### Aplicación Eclipse, código general en la clase creada.

![20 1](https://user-images.githubusercontent.com/105895649/177057686-f72b13f9-3899-426f-bb49-ff59c6152260.jpg)

###### Aplicación Eclipse, resultado de la implementación del código.
