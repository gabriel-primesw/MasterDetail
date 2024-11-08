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
        Course(
            "Medicina",
            R.drawable.curso1,
            "Curso de Medicina com foco em clínica geral",
            "Atividades incluem treinamento em clínicas e hospitais, com aprendizado prático em anatomia, fisiologia e patologia. Os estudantes participam de simulações e casos clínicos, além de estágio supervisionado em diversas áreas médicas, como cirurgia, pediatria, e emergências médicas.",
            "12 semestres"
        ),
        Course(
            "Letras",
            R.drawable.curso2,
            "Curso voltado ao estudo da língua e literatura",
            "Atividades incluem análise literária, estudo de linguística, e práticas de ensino de idiomas. Os alunos participam de discussões sobre literatura clássica e contemporânea, práticas de tradução, e desenvolvimento de habilidades de escrita e análise crítica.",
            "8 semestres"
        ),
        Course(
            "História",
            R.drawable.curso3,
            "Curso sobre a história mundial e brasileira",
            "Estudos incluem análise de documentos históricos, participação em projetos de arqueologia, e pesquisa sobre movimentos sociais e culturais. Os alunos desenvolvem habilidades em interpretação crítica e histórica, além de realizarem pesquisas em acervos, museus e arquivos públicos.",
            "8 semestres"
        ),
        Course(
            "Análise e Desenvolvimento de Sistemas",
            R.drawable.curso4,
            "Desenvolvimento de sistemas computacionais",
            "Atividades incluem desenvolvimento de software, programação em diversas linguagens, e gestão de projetos de TI. Os estudantes aprendem sobre engenharia de software, bancos de dados, segurança da informação e realizam projetos práticos para construir aplicativos e sistemas personalizados.",
            "6 semestres"
        ),
        Course(
            "Física",
            R.drawable.curso5,
            "Curso com ênfase em física teórica e experimental",
            "Atividades laboratoriais intensivas, simulações de fenômenos físicos, e estudo de mecânica, eletromagnetismo e física quântica. O curso também inclui pesquisas em física aplicada e participação em experimentos colaborativos para entender os fundamentos das leis da natureza.",
            "8 semestres"
        ),
        Course(
            "Pedagogia",
            R.drawable.curso6,
            "Formação de educadores para ensino infantil e fundamental",
            "Atividades incluem estágio em escolas, estudo de métodos pedagógicos e desenvolvimento de técnicas de ensino inclusivo. Os alunos participam de práticas de sala de aula e workshops de desenvolvimento infantil, além de aprendizados em gestão educacional e avaliação de desempenho.",
            "8 semestres"
        )
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