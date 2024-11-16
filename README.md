# Backend - Sistema de Tipo de Cambio

## Descripción
El backend de este proyecto está diseñado para gestionar y proporcionar datos relacionados con el tipo de cambio. Está desarrollado con **Spring Boot** y utiliza **MySQL** como base de datos para almacenar los registros históricos de tipos de cambio y usuarios.

## Requisitos Previos
- **Java 17** o superior
- **Maven 3.8** o superior
- **MySQL 8.0** o superior

## Instalación
1. Clona este repositorio:

   git clone <URL_DEL_REPOSITORIO>
   cd backend
Configura la base de datos:

Crea una base de datos en MySQL:
sql

CREATE DATABASE tipo_cambio;
Actualiza el archivo application.properties con tus credenciales de MySQL:
properties


spring.datasource.url=jdbc:mysql://localhost:3306/tipo_cambio
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
Construye y ejecuta la aplicación:


mvn clean install
mvn spring-boot:run
El backend estará disponible en:


http://localhost:8080
