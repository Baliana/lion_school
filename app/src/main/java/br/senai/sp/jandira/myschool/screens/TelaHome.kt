package br.senai.sp.jandira.myschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaHome() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 35.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = stringResource(R.string.logo_description),
                    modifier = Modifier
                        .width(65.dp)
                        .height(65.dp)
                )

                Spacer(modifier = Modifier.width(1.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = stringResource(R.string.lion_School),
                        modifier = Modifier.width(80.dp),
                        fontSize = 25.sp,
                        color = colorResource(R.color.cor_logo)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Card(
                modifier = Modifier
                    .height(2.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = CardDefaults.cardColors(colorResource(R.color.dark_yellow))
            ) {}

            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Find your course") },
                trailingIcon = {
                    Icon(Icons.Default.Search, contentDescription = "Search Icon")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(56.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp)), // Borda amarela
                shape = RoundedCornerShape(16.dp),
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(0xFFDADADA), // Fundo cinza claro
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )


            Spacer(modifier = Modifier.height(24.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "List Icon",
                    tint = colorResource(R.color.dark_yellow)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(R.string.courses),
                    modifier = Modifier.width(80.dp),
                    fontSize = 20.sp,
                    color = colorResource(R.color.cor_logo)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6464DC)),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(190.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp)) // Borda amarela
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.imgds),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 12.dp)
                    )
                    Column {
                        Text(text = stringResource(R.string.element_card1),
                            fontSize = 75.sp,
                            color = Color(0xFFFFC700))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = stringResource(R.string.name_course1),
                            color = Color.White,
                            fontSize = 16.sp)
                        Text(text = stringResource(R.string.description_course1),
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(7.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = stringResource(R.string.time_course1),
                                color = Color.White,
                                fontSize = 12.sp)
                        }
                    }
                }
            }


            Spacer(modifier = Modifier.height(12.dp))
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6464DC)),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(190.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp))
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.rds),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 12.dp)
                    )
                    Column {
                        Text(text = stringResource(R.string.element_card2),
                            fontSize = 75.sp,
                            color = Color(0xFFFFC700))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = stringResource(R.string.name_course2),
                            color = Color.White,
                            fontSize = 16.sp)
                        Text(text = stringResource(R.string.description_course2),
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = stringResource(R.string.time_course2),
                                color = Color.White,
                                fontSize = 12.sp)
                        }
                    }
                }
            }
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6464DC)),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(190.dp)
                    .border(2.dp, Color(0xFFFFC700), shape = RoundedCornerShape(16.dp))
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.eletro),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(end = 12.dp)
                    )
                    Column {
                        Text(text = stringResource(R.string.element_card3),
                            fontSize = 75.sp,
                            color = Color(0xFFFFC700))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = stringResource(R.string.name_course3),
                            color = Color.White,
                            fontSize = 16.sp)
                        Text(text = stringResource(R.string.description_course3),
                            color = Color.White.copy(alpha = 0.8f),
                            fontSize = 12.sp)
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = stringResource(R.string.time_course2),
                                color = Color.White,
                                fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaHomePreview() {
    TelaHome()
}