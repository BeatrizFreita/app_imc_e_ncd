package br.senai.sp.jandira.imcapp20

import android.util.Log

fun calcularImc(peso: Double, altura: Double ) = peso / (altura * altura)
    fun obter_status(imc: Double): List<String>{
        var resultados = emptyList<String>()

        if (imc < 18.5) {
             resultados =
                listOf("Abaixo do Peso",
                    "Risco de fadiga, stress e anciedade")


        } else if (imc > 18.5 && imc < 25) {
            resultados = listOf("Peso Ideal",
            "Menor risco de doenças cardiacas e varculares.")


        } else if (imc >=25 && imc < 30) {
            resultados = listOf("Acima do Peso",
            "Risco de má circulação, fadiga e varizes.")

        } else if(imc >= 30 && imc < 35) {
            resultados = listOf("Obesidade Grau I",
            "Risco de diabetes, angina, infarto e aterosclerose")

        } else if(imc >= 35 && imc < 40) {
            resultados = listOf("Obesidade Grau II",
            "Risco de apneia do sono e falta de ar")

        } else{
            resultados = listOf("Obesidade Grau III",
        "Risco de refluxo, mobilidade reduzida, escaras, diabetes, infarto e AVC.")

        }

        return resultados
    }
