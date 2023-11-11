package edu.VicH.reto12.ui;


public class GermanLanguage implements Language {
    @Override
    public String getId() {
        return "de";
    }

    @Override
    public String getTranslation(String key, String language) {
        switch (key) {
            case "SelectLanguage":
                return "Wähle eine Sprache:";
            case "SelectLanguagePrompt":
                return "Gib die Nummer deiner Sprache ein: ";
            case "InvalidOption":
                return "Ungültige Option. Bitte versuche es erneut.";
            case "SelectOperation":
                return "Wähle eine mathematische Operation:";
            case "Add":
                return "Addition";
            case "Subtract":
                return "Subtraktion";
            case "Multiply":
                return "Multiplikation";
            case "Divide":
                return "Division";
            case "Modulo":
                return "Modulo (Rest)";
            case "Power":
                return "Potenzierung";
            case "NthRoot":
                return "N-te Wurzel";
            case "Logarithm":
                return "Logarithmus";
            case "Exit":
                return "Beenden";
            case "SelectOperationPrompt":
                return "Gib die Nummer der gewünschten Operation ein: ";
            case "EnterNumber1":
                return "Gib die erste Zahl ein: ";
            case "EnterNumber2":
                return "Gib die zweite Zahl ein: ";
            case "Result":
                return "Ergebnis: ";
            case "Multiplicando":
                return "Multiplikand";
            case "Multiplicador":
                return "Multiplikator";
            case "Numerador":
                return "Numerator";
            case "Denominador":
                return "Denominator";
            case "Producto":
                return "Produkt";
            case "Cociente":
                return "Quotient";
            case "Radicando":
                return "Radicand";
            case "Indice de la Raiz":
                return "Wurzelindex (Radikal)";
            case "Base":
                return "Basis";
            case "Exponente":
                return "Exponent";
            case "Argumento":
                return "Argument";
            case "Base del Logaritmo":
                return "Logarithmusbasis";
            case "Logaritmo Base":
                return "Logarithmusbasis";
            case "Goodbye":
                return "Auf Wiedersehen!";
            case "ResultMessage":
                return "Ergebnis: ";
            case "AddInstruction":
                return "Gib die erste Zahl ein:";
            case "SubtractInstruction":
                return "Gib die zweite Zahl ein:";
            case "MultiplyInstruction":
                return "Gib den Multiplikator ein:";
            case "DivideInstruction":
                return "Gib den Zähler ein:";
            case "ModuloInstruction":
                return "Gib den Zähler ein:";
            case "PowerInstruction":
                return "Gib die Basis ein:";
            case "NthRootInstruction":
                return "Gib den Radikanden ein:";
            case "LogarithmInstruction":
                return "Gib das Argument ein:";
            case "AddResult":
                return "Das Ergebnis der Addition ist: ";
            case "SubtractResult":
                return "Das Ergebnis der Subtraktion ist: ";
            case "MultiplyResult":
                return "Das Produkt der Operation ist: ";
            case "DivideResult":
                return "Der Quotient der Operation ist: ";
            case "ModuloResult":
                return "Der Rest der Operation ist: ";
            case "PowerResult":
                return "Die Zahl hoch die Potenz ist: ";
            case "NthRootResult":
                return "Die n-te Wurzel des Radikanden ist: ";
            case "LogarithmResult":
                return "Das Ergebnis des Logarithmus Basis ist: ";
            default:
                return "Übersetzung nicht gefunden.";
        }
    }
}
