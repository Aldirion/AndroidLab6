package com.example.lab6


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lab6.ui.theme.ItemRowModel

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ItemRow(item: ItemRowModel) {
    Column() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1F)
                .padding(10.dp)
                //.background(color = Color.Red)
            ,
            shape = RoundedCornerShape(10.dp)
            ,
            elevation = cardElevation(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(color = Color.Green)
            ) {
                Row() {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.8F)
                            //.background(color = Color.Green)
                            .padding(5.dp),
                        horizontalAlignment = Alignment.Start
                    )
                    {
                        Row() {
                            Text(text = item.title)
                        }
                        Row() {
                            Text(text = item.subText)
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        if (item.isSolved == true) {
                            Icon(Icons.Filled.Done, contentDescription = "Prison")
                        } else {
                        }
                    }
                }
            }

        }
    }
}