package de.syntax_institut.funappsvorlage.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import de.syntax_institut.funappsvorlage.data.QuizRepository
import de.syntax_institut.funappsvorlage.data.model.Question

/**
 * Das ViewModel kümmert sich um die Logik des Spiels.
 * Es ruft dabei >keine< Variablen oder Funktionen aus dem QuizFragment auf
 */
class QuizViewModel : ViewModel() {

    // Erstelle eine QuizRepository Instanz
    // TODO
    private val repo = QuizRepository()

    // Lade die Liste mit den Question Informationen aus der QuizRepository Instanz
    // TODO
    private val quizList = repo.loadQuestions()

    // Der Index zeigt die Position der aktuellen Frage in der Liste
    // TODO
    private var questionIndex = 0


    // Diese Variable speichert die aktuelle Frage
    // TODO
    private var _currentQuestion = quizList[0]
    val currentQuestion: Question
        get() = _currentQuestion

    // Diese Variable speichert, wie viel Geld bereits erspielt wurde
    // TODO
    private var moneyWon = 0


    // Diese Variable speichert, wie die letzte Frage beantwortet wurde
    // TODO
    private var _lastAnswer = true
    val lastAnswer: Boolean
        get() = _lastAnswer

    // Diese Variable speichert, ob die Millionenfrage beantwortet wurde
    // TODO
    private var _wonTheMillion = false
    val wonTheMillion: Boolean
        get() = _wonTheMillion

    /**
     * Diese Funktion startet das Spiel neu, indem alle Variablen zurückgesetzt werden
     */
    fun restartGame() {
        // TODO Schreibe hier deinen Code
        questionIndex = 0
        _currentQuestion = quizList[0]
        moneyWon = 0
        _lastAnswer = true
        _wonTheMillion = false

    }

    /**
     * Diese Funktion überprüft, ob die Frage richtig oder falsch beantwortet wurde und setzt die
     * Variablen dementsprechend.
     */
    fun checkAnswer(answerIndex: Int) {
        // TODO Schreibe hier deinen Code
        if (answerIndex == _currentQuestion.rightAnswer) {
            moneyWon += currentQuestion.price
            if (questionIndex == quizList.size - 1) {
                _wonTheMillion = true
            } else {
                questionIndex++
                _currentQuestion = quizList[questionIndex]
            }
        } else {
            _lastAnswer = false
        }

    }
}
