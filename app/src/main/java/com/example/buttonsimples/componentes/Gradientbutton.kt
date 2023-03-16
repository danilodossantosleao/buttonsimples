package com.example.buttonsimples.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GradientButton (
    onClick: () -> Unit,
    text: String

){
    Button(
        onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)

    ) {
        Text(text = text, fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold )
    }
}


@Composable
@Preview
private fun GradientButtonPreview(){
    GradientButton(onClick = {}, text = "Start")
}