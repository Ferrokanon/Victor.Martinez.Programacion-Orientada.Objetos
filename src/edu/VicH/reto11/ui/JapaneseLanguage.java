package edu.VicH.reto11.ui;


public class JapaneseLanguage implements Language {
    @Override
    public String getId() {
        return "ja";
    }

    @Override
    public String getTranslation(String key, String language) {
        switch (key) {
            case "SelectLanguage":
                return "言語を選択:";
            case "SelectLanguagePrompt":
                return "あなたの言語の番号を入力してください：";
            case "InvalidOption":
                return "無効なオプションです。もう一度試してください。";
            case "SelectOperation":
                return "数学的な操作を選択：";
            case "Add":
                return "加法";
            case "Subtract":
                return "減算";
            case "Multiply":
                return "乗算";
            case "Divide":
                return "除算";
            case "Modulo":
                return "モジュロ（余り）";
            case "Power":
                return "べき乗";
            case "NthRoot":
                return "N番目の平方根";
            case "Logarithm":
                return "対数";
            case "Exit":
                return "終了";
            case "SelectOperationPrompt":
                return "実行したい操作の番号を入力してください：";
            case "EnterNumber1":
                return "最初の数値を入力：";
            case "EnterNumber2":
                return "第二の数値を入力：";
            case "Result":
                return "結果：";
            case "Multiplicando":
                return "乗算数";
            case "Multiplicador":
                return "乗数";
            case "Numerador":
                return "分子";
            case "Denominador":
                return "分母";
            case "Producto":
                return "積";
            case "Cociente":
                return "商";
            case "Radicando":
                return "被平方数";
            case "Indice de la Raiz":
                return "平方根の指数";
            case "Base":
                return "基底";
            case "Exponente":
                return "指数";
            case "Argumento":
                return "引数";
            case "Base del Logaritmo":
                return "対数の底";
            case "Logaritmo Base":
                return "対数の底";
            case "Goodbye":
                return "さようなら！";
            case "ResultMessage":
                return "結果：";
            case "AddInstruction":
                return "最初の数値を入力：";
            case "SubtractInstruction":
                return "第二の数値を入力：";
            case "MultiplyInstruction":
                return "乗算数を入力：";
            case "DivideInstruction":
                return "分子を入力：";
            case "ModuloInstruction":
                return "分子を入力：";
            case "PowerInstruction":
                return "基底を入力：";
            case "NthRootInstruction":
                return "被平方数を入力：";
            case "LogarithmInstruction":
                return "引数を入力：";
            case "AddResult":
                return "加法の結果は：";
            case "SubtractResult":
                return "減算の結果は：";
            case "MultiplyResult":
                return "乗算の結果は：";
            case "DivideResult":
                return "除算の結果は：";
            case "ModuloResult":
                return "モジュロの余りは：";
            case "PowerResult":
                return "べき乗の結果は：";
            case "NthRootResult":
                return "N番目の平方根は：";
            case "LogarithmResult":
                return "対数の結果は：";
            default:
                return "翻訳が見つかりません。";
        }
    }
}