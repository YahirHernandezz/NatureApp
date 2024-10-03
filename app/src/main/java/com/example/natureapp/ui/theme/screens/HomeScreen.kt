package com.example.natureapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.natureapp.ui.theme.NatureAppTheme
import com.example.natureapp.ui.theme.components.CardImage

@Composable
fun HomeScreen(innerPadding: PaddingValues){
    val images = listOf(
        //MADAGASCAR
        "https://blackpepper.travel/cache/2023-02/viajes-madagascar-head-blackpepper-0023-capa-20-2x-1333x659.jpg",
        //ISLA GALAPAGOS
        "https://static.nationalgeographicla.com/files/styles/image_3200/public/nationalgeographic2714870_0.jpg?w=1600&h=1069",
        //GALERAZAMBA
        "https://lanotapositiva.com/wp-content/uploads/2022/10/118374073_3282157215209880_2535818331974242284_n-1home.jpg",
        //ROCKIES
        "https://www.mundovacaciones.es/wp-content/uploads/2018/03/Rockies-montanas-canada.jpg",
        //SAHARA
        "https://imagenes.eltiempo.com/files/image_1200_600/uploads/2022/07/18/62d568a914174.jpeg"
    )

    val titleName = listOf(
        "Madagascar, África",
        "Isla Galapagos, Ecuador",
        "Mar rosa, Galerazamba Colombia",
        "Las Rockies, Canadá",
        "Desierto Sahara, África"
    )

    val description = listOf(
        "Isla exótica famosa por su biodiversidad única, hogar de especies endémicas como los lémures.",
        "Archipiélago volcánico famoso por inspirar la teoría de la evolución de Darwin.",
        "Laguna costera de color rosado por la alta salinidad, un fenómeno natural impresionante.",
        "Majestuosa cadena montañosa con paisajes de glaciares, lagos cristalinos y abundante vida silvestre.",
        "El desierto más grande del mundo, caracterizado por sus vastas dunas y condiciones extremas."
    )

    Box (
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(top = 25.dp)
    ){
        Column (
            modifier = Modifier.padding(10.dp)
        ){
            LazyColumn(){
                items(images.size){
                    CardImage(
                        image = images[it],
                        title = titleName[it],
                        description = description[it]
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun HomeScreenPreview(){
    NatureAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}