package com.example.ordinario_19508.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_19508.R


@Composable
fun AdivinaEdad(navController: NavHostController) {
    var textFieldValue by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize() .padding(70.dp)
    ) {

        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {

            TextField(
                value = textFieldValue,
                onValueChange = { nuevoTexto ->
                    var textFieldValue = nuevoTexto.toInt()
                },
                label = {
                    Text(text = "Año de nacimiento")
                }
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { navController.navigate("Edad") },
                colors = ButtonDefaults.buttonColors(Color(0xFF2196F3)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            ) {
                Text(
                    text = "Calcular edad",
                    color = Color(0xFFFFFFFF),
                    fontSize = 16.sp
                )
            }

            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start) {
                Button(
                    onClick = { navController.popBackStack() },
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFFFF)),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.flecha),
                        contentDescription = "Flecha",
                        modifier = Modifier
                            .width(35.dp)
                            .height(20.dp)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview(){
    AdivinaEdad(navController = rememberNavController())
}