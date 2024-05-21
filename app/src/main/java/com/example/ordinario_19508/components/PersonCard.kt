package com.example.ordinario_19508.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_19508.R
import com.example.ordinario_19508.models.Person


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonCard(navController: NavHostController, person: Person) {

    Card(modifier = Modifier
        .padding(20.dp,10.dp,20.dp,10.dp),
        onClick = {
            navController.navigate("Adivina")
            /*navController.navigate("PersonView" +
                    "/${person.number}" +
                    "/${person.title}" +
                    "/${person.image}")*/
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Black.copy(alpha = 0.8f)),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Spacer(modifier = Modifier.width(18.dp))

            Column (modifier = Modifier.padding(0.dp,20.dp,0.dp,20.dp)) {
                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "#${person.number}",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFFFFF),
                        fontSize = 20.sp
                    )
                    Column(verticalArrangement = Arrangement.Center) {

                        Image(painter = painterResource(person.image),
                            contentDescription = "Profile",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(100.dp)
                                .align(Alignment.CenterHorizontally))

                        Spacer(modifier = Modifier.height(18.dp))

                        Text(
                            text = "${person.title}",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF),
                            fontSize = 20.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    PersonCard(
        navController = rememberNavController(),
        person = Person(1, "Adivina la edad", R.drawable.pastel)
    )
}