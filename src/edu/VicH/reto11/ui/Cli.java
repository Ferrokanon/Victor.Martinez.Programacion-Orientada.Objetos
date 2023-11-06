package edu.VicH.reto11.ui;

import edu.VicH.reto11.process.*;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;


/**
 * Este código representa una aplicación de línea de comandos (CLI), a diferencia del creado en el reto anterior,
 * este nuevo CLi permite desarrollar una nueva interfaz en la eleccion de 4 idiomas diferentes, asi mismo, dentro del
 * mismo paquete UI , se añade una libreria de clases que permite guardar un record de traducciones automaticas para ser
 * ejecutadas directamente sin la necesidad de escribir manualmente la traduccion.
 *
 * Ahora
 *
 * la segunda parte del Cli,que permite al usuario seleccionar una operación aritmética y realizar cálculos.
 * Tambien arroja las intrucciones al usuario asi como el resultado de la operacion de manera traducida segun haya sido la eleccion del idioma previamente
 * Es un programa interactivo que utiliza las clases anteriores para realizar operaciones aritméticas.
 */

public class Cli {
    private static Cli instance;
    private Scanner scanner;
    private Language selectedLanguage;

    private Cli() {
        scanner = new Scanner(System.in);
    }

    public static Cli getInstance() {
        if (instance == null) {
            instance = new Cli();
        }
        return instance;
    }

    public void run() {
        int option;

        System.out.println("Select a language:");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.println("3. Deutsch");
        System.out.println("4. 日本語 (Ascii)");
        System.out.print("Enter the number for your language: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                selectedLanguage = new EnglishLanguage();
                break;
            case 2:
                selectedLanguage = new SpanishLanguage();
                break;
            case 3:
                selectedLanguage = new GermanLanguage();
                break;
            case 4:
                selectedLanguage = new JapaneseLanguage();
                break;
            default:
                System.out.println(selectedLanguage.getTranslation("InvalidOption", selectedLanguage.getId()));
                return;
        }

        performOperations(selectedLanguage);
    }

    private void performOperations(Language language) {
        int option;

        do {
            System.out.println(language.getTranslation("SelectOperationPrompt", language.getId()));
            System.out.println("1. " + language.getTranslation("Add", language.getId()));
            System.out.println("2. " + language.getTranslation("Subtract", language.getId()));
            System.out.println("3. " + language.getTranslation("Multiply", language.getId()));
            System.out.println("4. " + language.getTranslation("Divide", language.getId()));
            System.out.println("5. " + language.getTranslation("Modulo", language.getId()));
            System.out.println("6. " + language.getTranslation("Power", language.getId()));
            System.out.println("7. " + language.getTranslation("NthRoot", language.getId()));
            System.out.println("8. " + language.getTranslation("Logarithm", language.getId()));
            System.out.println("0. " + language.getTranslation("Exit", language.getId()));
            System.out.print(language.getTranslation("EnterOperationNumber", language.getId()));
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    performMathOperation(new Suma() {
                        /**
                         * @return
                         */
                        @Override
                        public String getOperayionType() {
                            return null;
                        }
                    }, language, "Add", "Result", "EnterNumber1", "EnterNumber2");
                    break;
                case 2:
                    performMathOperation(new Resta() {
                        /**
                         * @return
                         */
                        @Override
                        public String getOperayionType() {
                            return null;
                        }
                    }, language, "Subtract", "Result", "EnterNumber1", "EnterNumber2");
                    break;
                case 3:
                    performMathOperation(new Multiplicacion(), language, "Multiply", "Result", "Multiplicando", "Multiplicador");
                    break;
                case 4:
                    performMathOperation(new Division(), language, "Divide", "Result", "Numerador", "Denominador");
                    break;
                case 5:
                    performMathOperation(new Modulo(), language, "Modulo", "Result", "Numerador", "Denominador");
                    break;
                case 6:
                    performMathOperation(new Potencia_Multiplicacion(), language, "Power", "Result", "Base", "Exponente");
                    break;
                case 7:
                    performMathOperation(new RaizEnesima(), language, "NthRoot", "Result", "Radicando", "Indice de la Raiz");
                    break;
                case 8:
                    performMathOperation(new Logaritmo() {
                        /**
                         * @param base
                         * @param numero
                         * @return
                         */
                        @Override
                        public double calcularLogaritmo(double base, double numero) {
                            return 0;
                        }
                    }, language, "Logarithm", "Result", "Argumento", "Base del Logaritmo");
                    break;
                case 0:
                    System.out.println(language.getTranslation("Goodbye", language.getId()));
                    break;
                default:
                    System.out.println(language.getTranslation("InvalidOption", language.getId()));
                    break;
            }
        } while (option != 0);
    }

    private void performMathOperation(@NotNull OperacionAritmetica operation, @NotNull Language language, String operationKey, String resultKey, String num1Key, String num2Key) {
        System.out.print(language.getTranslation(num1Key, language.getId()));
        double num1 = scanner.nextDouble();
        System.out.print(language.getTranslation(num2Key, language.getId()));
        double num2 = scanner.nextDouble();

        double result = operation.calcular(num1, num2);

        String operationName = language.getTranslation(operationKey, language.getId());
        String resultMessage = language.getTranslation(resultKey, language.getId());

        System.out.println(resultMessage + " " + operationName + " " + result);
    }

    public static void main(String[] args) {
        Cli cli = Cli.getInstance();
        cli.run();
    }
}

