package br.senai.sp.jandira.myschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.myschool.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaDealuno() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.size(60.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.lion_School),
                modifier = Modifier.width(80.dp),
                fontSize = 25.sp,
                color = colorResource(R.color.cor_logo)
            )
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(Color(0xFFFFC700), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(R.string.element_bola),
                    color = Color(0xFF2A2D8E),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(Modifier.height(16.dp))
        HorizontalDivider(color = Color(0xFFFFC700), thickness = 2.dp)
        Spacer(Modifier.height(16.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Find a student") },
            trailingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Search")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xFFF0F0F0), shape = RoundedCornerShape(12.dp))
                .border(1.dp, Color(0xFFFFC700), RoundedCornerShape(12.dp)),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color(0xFFF0F0F0),
                focusedBorderColor = Color(0xFFFFC700),
                unfocusedBorderColor = Color(0xFFFFC700)
            ),
            shape = RoundedCornerShape(12.dp),
            singleLine = true
        )

        Spacer(Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            listOf(
                Triple("Todos", Color(0xFF2A2D8E), Color.White),
                Triple("Cursando", Color(0xFFFFC700), Color(0xFF2A2D8E)),
                Triple("Finalizado", Color(0xFFFFC700), Color(0xFF2A2D8E))
            ).forEach { (label, bg, textColor) ->
                Box(
                    modifier = Modifier
                        .background(bg, shape = RoundedCornerShape(32.dp))
                        .padding(horizontal = 24.dp, vertical = 8.dp)
                ) {
                    Text(text = label, color = textColor)
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 3.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(Modifier.height(1.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.list),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                )
                Spacer(Modifier.width(8.dp))
            }

            Spacer(Modifier.height(8.dp))

            Spacer(Modifier.height(12.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ListaDealunoPreview() {
    ListaDealuno()
}

