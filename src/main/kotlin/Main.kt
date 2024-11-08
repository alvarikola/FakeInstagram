import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {

    Column (modifier = Modifier.background(Color(0xFFadd8e6)).padding(20.dp)){
        Row {
            Text(
                text = "Instagram",
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                color = Color(0xFF41b441),
                modifier = Modifier.padding(bottom = 30.dp)
            )
        }
        Row {
            Text(
                text = "Historias",
                fontSize = 25.sp,
                color = Color(0xFF41b441),
                modifier = Modifier.padding(bottom = 20.dp)

            )
        }
        Row (modifier = Modifier
            .border(
                width = 1.dp,
                shape = RectangleShape,
                brush = Brush.linearGradient(
                    colors = listOf(Color.Black, Color.Black)
                )
            )
            .background(Color.White)
            .fillMaxWidth()
        ){
            historias.forEach{ historia ->
                Image(
                    painter = painterResource(resourcePath = historia.fotoCuenta),
                    contentDescription = "Foto",
                    modifier = Modifier
                        .padding(20.dp)
                        .clip(CircleShape)
                        .border(
                            width = 3.dp,
                            shape = CircleShape,
                            brush = Brush.linearGradient(
                                colors = listOf(Color.Blue, Color.Green)
                            )
                        )
                        .width(100.dp)

                )
            }
        }
        Row(modifier = Modifier.fillMaxSize().background(Color.Yellow).padding(20.dp)) {
            Column(modifier = Modifier.background(Color.Red).fillMaxHeight().weight(1F)) {
                Text(text = "Publicaciones")
            }
            Column (modifier = Modifier.background(Color.Blue).weight(1F)){
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
