package com.example.myapplication.presentation.lab_3_4.task_one.components

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max

@Composable
fun PostComponent(
    postHeadText: String,
    postText: String,



){
    Card() {
        Column(
            Modifier.padding(horizontal = 12.dp)
        ) {
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Row() {
                Icon(
                    modifier = Modifier.weight(0.5f),
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = ""

                )

                Text(
                    modifier = Modifier.weight(4f),
                    text = postHeadText

                )
                Spacer(modifier = Modifier.padding(vertical = 4.dp))

            }
            Divider(color = Color.White,)
            

            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            Text(
                overflow = TextOverflow.Ellipsis,
                maxLines = 8,
                text = postText)
            Spacer(modifier = Modifier.padding(vertical = 12.dp))

        }


    }

}

@Preview
@Composable
fun PreviewPostComponent(){
    PostComponent(postHeadText = "hEAD TEXT", postText = "Lorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsum" )
}