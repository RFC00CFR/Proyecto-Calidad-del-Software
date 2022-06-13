# Proyecto-Calidad-del-Software
Poryecto desarrollado en el curso Calidad del Software - Grupo 04
Proyecto desarrollado en el curso Calidad del Software - Grupo 04

Pasos para la instalacion y configuracion del ambiente de trabajo(Instalacion del IDE, Framework Selenium WebDriver, y configuracion de todo el ambiente):

Paso 1: Instalar el JAVA JDK de última versión.

Paso 2: Instalar el IDE a utilizar, en este caso Eclipse.

Paso 3: Ejecutar el archivo descargado y seleccionar la opción de Eclipse IDE for Java Developers.

Paso 4: Cambiar el directorio predeterminado a una carpeta con fácil acceso e instalar.

Paso 5: Ejecutar el botón de Launch

Paso 6: Ejecutar el botón de Launch

Paso 7: Ingresar a https://www.selenium.dev/downloads/ y descargar la versión de Selnium Web Driver para Java.Logotipo, nombre de la empresa

Paso 8: Crear un nuevo proyecto en Eclipse.

Paso 9: Crear un nuevo paquete en el proyecto

Paso 10: Crear una clase en el paquete.

Paso 11: Hacer click derecho en el proyecto creado y seleccionar las siguientes opciones en el siguiente orden: Properties, Java Build Path, Libraries y Add External JAR.

Paso 12: Seleccionar el archivo descargado en el paso 7 y seleccionar “Apply and Close”.

Paso 13: Verificar que se visualice así:

Paso 14: Instalar el ChromeDriver.exe desde https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.61/

Paso 15: En la clase creada se deben importar dos paquetes: “org.openqa.selenium.WebDriver” y propiamente el driver del navegador usado, en este caso para Chrome es: “org.openqa.selenium.chrome.ChromeDriver”.

Paso 16: En el código dentro del método main se debe setear el Driver junto al Chrome Driver descargado de la siguiente manera:

Paso 17: Siguiendo el código main se establecen las variables y su url. En este caso se utiliza https://demo.prestashop.com/#/en/front debido a que es la página seleccionada para el proyecto.

Paso 18: Se establece el código que abre Chrome y guarda el título del URL y se guarda en la variable.

Paso 19: Se compara por medio de un if con un .contentEquals y se imprime en consola el resultado.

Paso 20: Guardar el código y ejecutarlo.
