# Proyecto de Automatización - OpenCart

## Descripción

Proyecto de automatización de pruebas para la plataforma OpenCart utilizando el patrón Screenplay con Serenity BDD. El proyecto implementa pruebas end-to-end para el flujo de compra de productos.

## Arquitectura del Proyecto

Este proyecto sigue el patrón **Screenplay**, que proporciona una estructura clara y mantenible para las pruebas de automatización:

```
screenplay/
├── src/
│   ├── main/java/co/com/screenplay/project/
│   │   ├── hook/              # Configuración inicial del navegador
│   │   ├── questions/         # Verificaciones y consultas
│   │   ├── tasks/             # Acciones de negocio de alto nivel
│   │   ├── ui/                # Definición de elementos de la UI
│   │   └── utils/             # Constantes y utilidades
│   └── test/
│       ├── java/co/com/screenplay/project/
│       │   ├── runners/       # Ejecutores de pruebas
│       │   └── stepdefinitions/ # Definiciones de pasos Gherkin
│       └── resources/
│           ├── features/      # Archivos .feature (Gherkin)
│           ├── drivers/       # WebDrivers
│           └── serenity.conf  # Configuración de Serenity
```

## 🛠️ Tecnologías Utilizadas

- **Java 17
- **Gradle 8.10** - Gestión de dependencias y construcción
- **Serenity BDD 4.2.34** - Framework de automatización y reportes
- **JUnit 5.11.4 - Framework de pruebas
- **Selenium WebDriver 4.33.0** - Automatización web
- **Lombok 1.18.32 - Reducción de código
- **Edge WebDriver** - Navegador configurado por defecto

## Pre-requisitos

- Java JDK 17 o superior
- Gradle 8.x
- Microsoft Edge (o configurar otro navegador en serenity.conf)
- Git

## Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/Larcor/Screenplay.git
```

2. Verificar la instalación de Java:
```bash
java -version
```

3. Descargar dependencias:
```bash
./gradlew clean build
```

## Ejecución de Pruebas

### Ejecutar con el runner

- Ir al runner ubicado en este path: **src/test/java/co/com/screenplay/project/runners/RunnerOpenWeb.java**
- Ejecutar la clase runner
  
### Ejecutar todas las pruebas
```bash
./gradlew clean test
```

### Ejecutar con tags específicos
```bash
./gradlew clean test -Dcucumber.filter.tags="@prueba"
```

### Generar reportes
```bash
./gradlew clean test aggregate
```

Los reportes se generarán en: `target/site/serenity/index.html`

## Caso de Prueba Implementado

**Feature:** Compra de productos en OpenCart

**Escenario:** El usuario realiza una compra completa incluyendo:
- Agregar productos al carrito (MacBook e iPhone)
- Visualizar el carrito de compras
- Completar el proceso de checkout como invitado
- Verificar la confirmación del pedido

## 📝 Estructura de Código

### Tasks (Tareas de Alto Nivel)
- `AddProductToCart`: Agregar productos al carrito
- `NavigateTo`: Navegación entre páginas
- `ProceedToCheckout`: Completar el proceso de compra
- `EnterValueIntoInput`: Ingreso de datos en formularios

### Questions (Verificaciones)
- `TextValidationQuestions`: Validación de mensajes en pantalla

### UI Pages
- `HomePage`: Página principal
- `ShoppingCartPage`: Carrito de compras
- `CheckoutFormPage`: Formulario de checkout
- `HeaderPage`: Encabezado común
- `OrderSuccessfullyPage`: Página de confirmación

## Configuración

### serenity.conf
Archivo principal de configuración ubicado en `src/test/resources/serenity.conf`:

```hocon
webdriver {
  driver = edge
  autodownload = true
}

environments {
  default {
    webdriver.base.url = "https://opencart.abstracta.us/"
  }
}
```

### Cambiar Navegador
Para usar Chrome u otro navegador, modificar `serenity.conf`:
```hocon
webdriver {
  driver = chrome  # Opciones: chrome, firefox, edge
}
```

## Reportes

Serenity BDD genera reportes detallados que incluyen:
- Screenshots de cada paso
- Logs detallados de ejecución
- Métricas de cobertura
- Resultados visuales de las pruebas

Acceder a los reportes en: `target/site/serenity/index.html`

## Tags Disponibles

- `@prueba`: Escenario principal de compra

## Convenciones del Proyecto

- **Nomenclatura de clases**: PascalCase
- **Nomenclatura de métodos**: camelCase
- **Archivos feature**: snake_case
- **Idioma**: Español para Gherkin, Inglés para código


## Autor

- Manuel Bobadilla
