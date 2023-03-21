package de.syntax_institut.livedata_App.ui.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.syntax_institut.livedata_App.data.QuizRepository
import de.syntax_institut.livedata_App.data.model.Question

/**
 * Das ViewModel kümmert sich um die Logik des Spiels.
 * Es ruft dabei >keine< Variablen oder Funktionen aus dem QuizFragment auf
 */
class QuizViewModel : ViewModel() {

    // Erstelle eine QuizRepository Instanz
    // TODO:
    private val repository = QuizRepository()

    // Lade die Liste mit den Question Informationen aus der QuizRepository Instanz
    // TODO
    private val questionsList = repository.questions

    // Der Index zeigt die Position der aktuellen Frage in der Liste
    // TODO
    private var _questionIndex = 0


    // Diese Variable speichert die aktuelle Frage
    // TODO
    private val _currentQuestion = MutableLiveData<Question?>()
    val currentQuestion: LiveData<Question?>
        get() = _currentQuestion

    // Diese Variable speichert die aktuelle Preisstufe
    // TODO
    private val _currentPrice = MutableLiveData<Int?>()
    val currentPrice: LiveData<Int?>
        get() = _currentPrice

    // Diese Variable speichert, ob das Spiel vorbei ist
    // TODO

    private val _gameOver = MutableLiveData<Boolean>(false)
    val gameOver: LiveData<Boolean>
        get() = _gameOver

    init {
        _currentQuestion.value = questionsList.value?.get(0)
        _currentPrice.value = questionsList.value?.get(0)?.price
    }
    /**
     * Diese Funktion setzt alle Variablen auf ihren Ausgangswert zurück
     */
    private fun resetGame() {
        // TODO Schreibe hier deinen Code
        _questionIndex = 0
        _currentQuestion.value = questionsList.value?.get(0)
        _currentPrice.value = 0
        _gameOver.value = false
    }

    /**
     * Diese Funktion überprüft, ob die Frage richtig oder falsch beantwortet wurde und setzt die
     * Variablen dementsprechend
     */
    fun checkAnswer(answerIndex: Int) {
        // TODO Schreibe hier deinen Code
        if(answerIndex == _currentQuestion.value?.rightAnswer){
            _questionIndex += 1
            _currentQuestion.value = questionsList.value?.get(_questionIndex)
            _currentPrice.value = _currentQuestion.value?.price
        } else {
            _gameOver.value = true
            resetGame()
        }
    }
}

