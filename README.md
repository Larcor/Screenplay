# Ejecución del Proyecto – ScreenplaySofka

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java 17
- **Gradle**
- **Microsoft Edge** o el navegador configurado en `serenity.conf`

---


### 1️⃣ Clonar el repositorio

bash
git clone https://github.com/Larcor/ScreenplaySofka.git

### 2️⃣ Ejecutar las pruebas

manual
Ejecutar el archivo "RunnerOpenWeb.java"

bash
.\gradlew clean test -Dcucumber.filter.tags="@prueba"


### 3️⃣ Abrir el reporte

El reporte se encuentra en esta ubicacion

build/reports/serenity/index.html

