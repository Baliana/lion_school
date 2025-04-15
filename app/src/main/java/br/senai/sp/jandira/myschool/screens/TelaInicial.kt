package br.senai.sp.jandira.myschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myschool.R

@Composable
fun TelaInicial() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .width(130.dp)
                        .height(300.dp)
                )
                Text(
                    text = stringResource(R.string.lion_School),
                    modifier = Modifier.width(150.dp),
                    fontSize = 40.sp,
                    color = colorResource(R.color.cor_logo)

                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.favorite_course),
                    fontSize = 20.sp,
                    color = colorResource(R.color.cor_logo)
                )
                Card(

                    modifier = Modifier
                        .height(5.dp)
                        .width(70.dp),
                   colors = CardDefaults.cardColors(colorResource(R.color.dark_yellow))
                ){
                }
                Spacer(modifier = Modifier.height(26.dp))
                Text(
                    text = stringResource(R.string.destinations),
                    fontSize = 23.sp,
                    color = colorResource(R.color.Light_gray)
                )
            }
            Spacer(modifier = Modifier.height(150.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(horizontal = 45.dp)
                    .width(300.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_yellow)),
                shape =
            ) {
                Text(
                    text = stringResource(R.string.Get_Started),
                    color = Color.Black

                )
            }
            Spacer(modifier = Modifier.height(80.dp))
            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 50.dp, end = 50.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Image(
                    painter = painterResource(R.drawable.youtube),
                    contentDescription = stringResource(R.string.youtube),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                        painter = painterResource(R.drawable.twitter),
                contentDescription = stringResource(R.string.twitter),
                modifier = Modifier
                    .width(33.dp)
                    .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.instagram),
                    contentDescription = stringResource(R.string.instagram),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = stringResource(R.string.facebook),
                    modifier = Modifier
                        .width(33.dp)
                        .height(33.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}
