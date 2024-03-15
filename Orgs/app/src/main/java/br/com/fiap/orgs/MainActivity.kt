package br.com.fiap.orgs

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.orgs.ui.theme.OrgsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* Binding: processo de cinculacao do codigo fonte
        com o arquivo de layout
        * */

        val nome = findViewById<TextView>(R.id.nome)
        nome.setText("Cesta de Frutas")
        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.setText("Laranja, uva e maca")
        val valor = findViewById<TextView>(R.id.valor)
        valor.setText("Laranja, uva e maca")
    }
}
