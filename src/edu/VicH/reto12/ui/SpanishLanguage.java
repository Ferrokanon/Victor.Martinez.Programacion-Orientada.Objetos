package edu.VicH.reto12.ui;

public class SpanishLanguage implements Language {
    @Override
    public String getId() {
        return "es";
    }

    @Override
    public String getTranslation(String key, String language) {
        switch (key) {
            case "SelectLanguage":
                return "Selecciona un idioma:";
            case "SelectLanguagePrompt":
                return "Ingresa el número de tu idioma: ";
            case "InvalidOption":
                return "Opción inválida. Por favor, inténtalo de nuevo.";
            case "SelectOperation":
                return "Selecciona una operación matemática:";
            case "Add":
                return "Suma";
            case "Subtract":
                return "Resta";
            case "Multiply":
                return "Multiplicación";
            case "Divide":
                return "División";
            case "Modulo":
                return "Módulo (Residuo)";
            case "Power":
                return "Potenciación";
            case "NthRoot":
                return "Raíz Enésima";
            case "Logarithm":
                return "Logaritmo";
            case "Exit":
                return "Salir";
            case "SelectOperationPrompt":
                return "Ingresa el número de la operación que deseas realizar: ";
            case "EnterNumber1":
                return "Ingresa el primer número: ";
            case "EnterNumber2":
                return "Ingresa el segundo número: ";
            case "Result":
                return "Resultado: ";
            case "Multiplicando":
                return "Ingrese el Multiplicando";
            case "Multiplicador":
                return "Ingrese el Multiplicador:";
            case "Numerador":
                return "Numerador";
            case "Denominador":
                return "Denominador";
            case "Producto":
                return "Producto";
            case "Cociente":
                return "Cociente";
            case "Radicando":
                return "Radicando";
            case "Indice de la Raiz":
                return "Índice de la Raíz (Radical)";
            case "Base":
                return "Base";
            case "Exponente":
                return "Exponente";
            case "Argumento":
                return "Argumento";
            case "Base del Logaritmo":
                return "Base del Logaritmo";
            case "Logaritmo Base":
                return "Base del Logaritmo";
            case "Goodbye":
                return "¡Hasta luego!";
            case "ResultMessage":
                return "Resultado: ";
            case "AddInstruction":
                return "Ingresa el primer número:";
            case "SubtractInstruction":
                return "Ingresa el segundo número:";
            case "MultiplyInstruction":
                return "Ingresa el multiplicador:";
            case "DivideInstruction":
                return "Ingresa el numerador:";
            case "ModuloInstruction":
                return "Ingresa el numerador:";
            case "PowerInstruction":
                return "Ingresa la base:";
            case "NthRootInstruction":
                return "Ingresa el radicando:";
            case "LogarithmInstruction":
                return "Ingresa el argumento:";
            case "AddResult":
                return "El resultado de la suma es: ";
            case "SubtractResult":
                return "El resultado de la resta es: ";
            case "MultiplyResult":
                return "El producto de la operación es: ";
            case "DivideResult":
                return "El cociente de la operación es: ";
            case "ModuloResult":
                return "El residuo de la operación es: ";
            case "PowerResult":
                return "El número elevado a la potencia es: ";
            case "NthRootResult":
                return "La raíz enésima del radicando es: ";
            case "LogarithmResult":
                return "El resultado del logaritmo base es: ";
            default:
                return "Traducción no encontrada.";
        }
    }
}