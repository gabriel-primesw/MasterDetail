package ufpr.br.masterdetail

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ufpr.br.masterdetail.adapter.CourseAdapter
import ufpr.br.masterdetail.model.Course

class MainActivity : AppCompatActivity() {

    private val courses = listOf(
        Course("Medicina", R.drawable.curso1, "Curso de Medicina com foco em clínica geral", "8 créditos", "12 semestres"),
        Course("Letras", R.drawable.curso2, "Curso de Letras com ênfase na língua portuguesa", "6 créditos", "10 semestres"),
        Course("História", R.drawable.curso3, "Curso sobre a história mundial e brasileira", "5 créditos", "8 semestres"),
        Course("Análise e Desenvolvimento de Sistemas", R.drawable.curso4, "Desenvolvimento de sistemas computacionais", "4 créditos", "6 semestres"),
        Course("Física", R.drawable.curso5, "Curso com ênfase em física teórica e experimental", "7 créditos", "8 semestres"),
        Course("Pedagogia", R.drawable.curso6, "Formação de educadores para ensino infantil e fundamental", "5 créditos", "8 semestres")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.courseListView)
        listView.adapter = CourseAdapter(this, courses)

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedCourse = courses[position]
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("title", selectedCourse.title)
                putExtra("imageResId", selectedCourse.imageResId)
                putExtra("description", selectedCourse.description)
                putExtra("credits", selectedCourse.credits)
                putExtra("duration", selectedCourse.duration)
            }
            startActivity(intent)
        }
    }
}