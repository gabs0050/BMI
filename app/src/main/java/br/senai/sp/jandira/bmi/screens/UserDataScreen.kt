package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R


@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {
    val nomeState = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF673AB7),
                        Color(0xFF000000)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                text = stringResource(R.string.app_name),
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, bottom = 46.dp)

            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(800.dp)
                    .padding(bottom = 0.dp),
                shape = RoundedCornerShape(
                    topStart = 50.dp,
                    topEnd = 50.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column (
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card(
                                modifier = Modifier.size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    2.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF5608A4),
                                            Color(0xFFBA88FF)
                                        )
                                    )
                                ),
                                elevation = CardDefaults.elevatedCardElevation(2.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.profilemale),
                                    contentDescription = stringResource(id = R.string.logo_description),
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = androidx.compose.ui.layout.ContentScale.Crop
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp, 5.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5608A4))
                            ) {
                                Text(
                                    text = stringResource(R.string.male),
                                    fontSize = 16.sp,
                                    color = Color.White,

                                    )
                            }
                        }
                        Column (
                            modifier = Modifier
                                .weight(1f),
                                    horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                modifier = Modifier.size(130.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    2.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xFF5608A4),
                                            Color(0xFFBA88FF)
                                        )
                                    )
                                ),
                                elevation = CardDefaults.elevatedCardElevation(2.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.profilewoman),
                                    contentDescription = stringResource(id = R.string.logo_description),
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = androidx.compose.ui.layout.ContentScale.Crop
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp, 5.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5608A4))
                            ) {
                                Text(
                                    text = stringResource(R.string.female),
                                    fontSize = 16.sp,
                                    color = Color.White,

                                )
                            }
                        }
                    }
                    Column (
                        modifier = Modifier
                            .padding(0.dp, 10.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nome ->
                                nomeState.value = nome
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp),
                            shape = RoundedCornerShape(12.dp),
                            label = {
                                Text(
                                    stringResource(R.string.age)
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Numbers,
                                    contentDescription = "",
                                    tint = Color(0xFF673AB7)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                capitalization = KeyboardCapitalization.Sentences
                            )
                        )
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nome ->
                                nomeState.value = nome
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(0.dp, 25.dp),
                            shape = RoundedCornerShape(12.dp),
                            label = {
                                Text(
                                    stringResource(R.string.weight)
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFF673AB7)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                capitalization = KeyboardCapitalization.Sentences
                            )
                        )
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nome ->
                                nomeState.value = nome
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp),
                            shape = RoundedCornerShape(12.dp),
                            label = {
                                Text(
                                    stringResource(R.string.height)
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFF673AB7)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                capitalization = KeyboardCapitalization.Sentences
                            )
                        )
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth(),
                        border = BorderStroke(
                            1.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFF5608A4),
                                    Color(0xFFBA88FF)
                                )
                            )),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF5608A4)),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.buttonCalculate),
                            fontSize = 20.sp,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen()
}