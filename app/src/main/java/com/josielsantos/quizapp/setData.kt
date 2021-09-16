package com.josielsantos.quizapp

object  setData {

    const val name: String = "name"
    const val score: String = "score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Quantas estrelas tem na bandeira do Brasil ?",

            "24",
            "26",
            "28",
            "27",
            4
        )

        var question2 = QuestionData(
            2,
            "De qual país é a invenção do chuveiro elétrico?",

            "França",
            "Brasil",
            "Japão",
            "China",
            2
        )

        var question3 = QuestionData(
            3,
            "Qual o nome do presidente do Brasil que ficou conhecido como Jango?",

            "Jânio Quadros",
            "Jacinto Anjos",
            "Getúlio Vargas",
            " João Goulart",
            4
        )

        var question4 = QuestionData(
            4,
            "Qual o livro mais vendido no mundo a seguir à Bíblia?",

            "Dom Quixote",
            "O Senhor dos Anéis",
            "O Pequeno Príncipe",
            "Um Conto de Duas Cidades",
            1
        )

        var question5 = QuestionData(
            5,
            "Qual o número mínimo de jogadores numa partida de futebol?",

            "8",
            "6",
            "7",
            "5",
            3
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }
}