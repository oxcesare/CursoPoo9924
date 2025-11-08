package com.mx.curso.sealed;

// Clase padre "sellada"
public sealed class Animal permits Gato, Pajaro, Perro {
}