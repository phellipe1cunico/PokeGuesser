import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pokeapp.R

@Preview
@Composable
fun MainScreen() {
    Scaffold(
        containerColor = Color.White,
        bottomBar = {
            Rodape()
        }

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            PokeTitle()

            Spacer(modifier = Modifier.height(56.dp))

            Text(
                text = "ESCOLHA A DIFICULDADE",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(32.dp))

            Dificuldade(
                text = "Pokeball",
                buttonColor = Color(0xFFF03E3E),
                iconPainter = painterResource(id = R.drawable.pokeball),
                contentDesc = "Dificuldade Pokeball"
            )

            Spacer(modifier = Modifier.height(24.dp))

            Dificuldade(
                text = "Ultraball",
                buttonColor = Color.Black,
                iconPainter = painterResource(id = R.drawable.ultraball),
                contentDesc = "Dificuldade Ultraball"
            )

            Spacer(modifier = Modifier.height(24.dp))

            Dificuldade(
                text = "Masterball",
                buttonColor = Color(0xFFC040F0),
                iconPainter = painterResource(id = R.drawable.masterball),
                contentDesc = "Dificuldade Masterball"
            )

            Spacer(modifier = Modifier.height(40.dp))
            Estatistias()
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun PokeTitle() {
    val gradientColors = listOf(Color(0xFFE63946), Color(0xFF03A9F4))

    Text(
        text = "POKEGSSR",
        style = TextStyle(
            fontSize = 48.sp,
            fontWeight = FontWeight.ExtraBold,
            brush = Brush.linearGradient(colors = gradientColors),
            fontFamily = FontFamily.Monospace
        )
    )
}

@Composable
fun Dificuldade(
    text: String,
    buttonColor: Color,
    iconPainter: Painter,
    contentDesc: String,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .clickable { onClick() },
        contentAlignment = Alignment.CenterStart
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.CenterEnd)
                .padding(start = 32.dp)
                .background(buttonColor, CircleShape),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = text,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 48.dp)
            )
        }

        Image(
            painter = iconPainter,
            contentDescription = contentDesc,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.CenterStart)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Estatistias() {
    Row(
        modifier = Modifier.clickable { },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        IconButton(
            modifier = Modifier.size(50.dp),
            onClick = {}) {

            Icon(
                modifier = Modifier.size(40.dp),
                painter = painterResource(id = R.drawable.graph),
                contentDescription = "Estatísticas"
            )

        }

        Spacer(modifier = Modifier.width(15.dp))

        Text(
            text = "Estatisticas",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Thin,
                fontFamily = FontFamily.Monospace
            )
        )

    }
}

@Composable
fun Rodape() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp),
        color = Color(0xFFF03E3E)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Início",
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.ExitToApp,
                    contentDescription = "Sair",
                    tint = Color.White,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }

}
