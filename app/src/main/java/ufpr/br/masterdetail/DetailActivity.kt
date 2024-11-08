package ufpr.br.masterdetail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val imageResId = intent.getIntExtra("imageResId", 0)
        val description = intent.getStringExtra("description")
        val credits = intent.getStringExtra("credits")
        val duration = intent.getStringExtra("duration")

        findViewById<ImageView>(R.id.courseDetailImage).setImageResource(imageResId)
        findViewById<TextView>(R.id.courseDetailTitle).text = title
        findViewById<TextView>(R.id.courseDetailDescription).text = "Descrição: $description"
        findViewById<TextView>(R.id.courseDetailCredits).text = "Atividades: $credits"
        findViewById<TextView>(R.id.courseDetailDuration).text = "Duração: $duration"

        // Configuração do botão de retorno
        findViewById<Button>(R.id.btnBackToMaster).setOnClickListener {
            finish() // Fecha a DetailActivity e retorna à MasterActivity
        }
    }
}

