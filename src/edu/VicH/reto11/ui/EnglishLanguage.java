package edu.VicH.reto11.ui;


public class EnglishLanguage implements Language {
    @Override
    public String getId() {
        return "en";
    }

    @Override
    public String getTranslation(String key, String language) {
        switch (key) {
            case "SelectLanguage":
                return "Select a language:";
            case "SelectLanguagePrompt":
                return "Enter the number for your language: ";
            case "InvalidOption":
                return "Invalid option. Please try again.";
            case "SelectOperation":
                return "Select a mathematical operation:";
            case "Add":
                return "Addition";
            case "Subtract":
                return "Subtraction";
            case "Multiply":
                return "Multiplication";
            case "Divide":
                return "Division";
            case "Modulo":
                return "Modulo (Remainder)";
            case "Power":
                return "Exponentiation";
            case "NthRoot":
                return "Nth Root";
            case "Logarithm":
                return "Logarithm";
            case "Exit":
                return "Exit";
            case "SelectOperationPrompt":
                return "Enter the number of the operation you want to perform: ";
            case "EnterNumber1":
                return "Enter the first number: ";
            case "EnterNumber2":
                return "Enter the second number: ";
            case "Result":
                return "Result: ";
            case "Multiplicador":
                return "Multiplier";
            case "Multiplicando":
                return "Multiplicand";
            case "Numerador":
                return "Numerator";
            case "Denominador":
                return "Denominator";
            case "Producto":
                return "Product";
            case "Cociente":
                return "Quotient";
            case "Radicando":
                return "Radicand";
            case "Indice de la Raiz":
                return "Root Index (Radical)";
            case "Base":
                return "Base";
            case "Exponente":
                return "Exponent";
            case "Argumento":
                return "Argument";
            case "Base del Logaritmo":
                return "Logarithm Base";
            case "Logaritmo Base":
                return "Logarithm Base";
            case "Goodbye":
                return "Goodbye!";
            case "ResultMessage":
                return "Result: ";
            case "AddInstruction":
                return "Enter the first number:";
            case "SubtractInstruction":
                return "Enter the second number:";
            case "MultiplyInstruction":
                return "Enter the multiplicand:";
            case "DivideInstruction":
                return "Enter the numerator:";
            case "ModuloInstruction":
                return "Enter the numerator:";
            case "PowerInstruction":
                return "Enter the base:";
            case "NthRootInstruction":
                return "Enter the radicand:";
            case "LogarithmInstruction":
                return "Enter the argument:";
            case "AddResult":
                return "The result of addition is: ";
            case "SubtractResult":
                return "The result of subtraction is: ";
            case "MultiplyResult":
                return "The product of the operation is: ";
            case "DivideResult":
                return "The quotient of the operation is: ";
            case "ModuloResult":
                return "The remainder of the operation is: ";
            case "PowerResult":
                return "The number raised to the power is: ";
            case "NthRootResult":
                return "The nth root of the radicand is: ";
            case "LogarithmResult":
                return "The result of logarithm base is: ";
            default:
                return "Translation not found.";
        }
    }
}

