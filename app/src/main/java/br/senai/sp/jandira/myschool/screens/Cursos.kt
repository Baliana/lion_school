import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.myschool.R

@Composable
fun Cursos(

    text1: String = "",
    text2: String = "",
    text3: String = "",
    text4: String = "",
    isFilled: Boolean = false
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(190.dp),
        colors = CardDefaults.cardColors(

        )
    ){
    }
    Column {
        Row {
            Image(
                painter = painterResource(R.drawable.imgds),
                contentDescription = "",
                modifier = Modifier
                    .width(110.dp)
                    .height(110.dp)
                    .padding(top = 10.dp)
            )
        }
    }
}
@Preview
@Composable
private fun CursorsPreview() {
    Cursos()
}
