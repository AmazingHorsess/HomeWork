package com.example.myapplication.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun GitHubButton(
    url:String
){
    val uriHandler = LocalUriHandler.current

    IconButton(
        onClick = {  uriHandler.openUri(uri = url) }
    ) {

            Icon(
                painterResource(id = R.drawable.githubwhite)  ,
                contentDescription = "Search",
                tint = Color.White,
                modifier = Modifier.size(36.dp)
            )

    }
    
}