package com.example.ordinario_19508.views

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_19508.components.PersonCard
import com.example.ordinario_19508.viewmodels.PersonViewModels

@Composable
fun ListView(navController: NavHostController) {

    val personViewModels = PersonViewModels()

    LazyColumn {
        items(personViewModels.getPersonList()) {
            person ->
            PersonCard(navController, person)
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun Preview_List() {
    ListView(navController = rememberNavController())
}
