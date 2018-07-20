package gildedsteel.com.moviepicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val movieList = arrayListOf("Horror", "RomCom", "Action", "Drama", "War", "Documentary", "Screw it, Netflix", "Family", "Kids", "Anime", "Cooking", "Romance", "Comedy", "Stand-Up", "Indie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomMovie = random.nextInt(movieList.count())

            selectedMovieText.text = movieList[randomMovie]
        }

        addMovieButton.setOnClickListener {
            val newMovie = addMovieText.text.toString()
            if (!newMovie.isEmpty()) {
                movieList.add(newMovie)
                addMovieText.text.clear()
                println(movieList)
            }
        }
    }
}
