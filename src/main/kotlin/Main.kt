import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {

    Column {
        Row {
            Text(
                text = "Instagram"
            )
        }
        Row {
            Text(
                text = "Historias"
            )
        }
        Row {
            historias.forEach{ historia ->
                Text(
                    text = historia.fotoCuenta,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        Row(modifier = Modifier.fillMaxSize().background(Color.Yellow).padding(20.dp)) {
            Column(modifier = Modifier.background(Color.Red).fillMaxHeight()) {
                Text(text = "Publicaciones")
            }
            Column (modifier = Modifier.background(Color.Blue)){
                Text(text = "Sugerencias")
                cuentaSugerida.forEach{ cuentaSugerida ->
                    Row {
                        Text(text = cuentaSugerida.fotoCuenta)
                        Text(text = cuentaSugerida.nombreCuenta)
                    }
                }
            }
        }
    }
}


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
