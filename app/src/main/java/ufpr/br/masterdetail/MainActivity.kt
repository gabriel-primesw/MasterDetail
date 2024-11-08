package ufpr.br.masterdetail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}