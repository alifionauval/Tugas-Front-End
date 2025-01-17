package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage(
            modifier = Modifier.size(300.dp),
            imageResId = R.drawable.aku
        )
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "Alifio Nauval Priatmodjo",
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier .height(15.dp))
        Text(
            text = "alf.nval24@gmail.com \nUniversitas Gunadarma \nJurusan Informatika",
            color = Color.Black,

        )
    }
}

@Composable
fun ProfileImage(modifier: Modifier = Modifier, imageResId: Int) {
    Image(
        painter = painterResource(id = R.drawable.aku),
        contentDescription = null,
        modifier = modifier
            .fillMaxSize()
            .padding(4.dp)
            .border(width = 1.dp, color = Color.Black),
        contentScale = ContentScale.Crop,
        alignment = Alignment.Center,

    )
}

@Preview(showBackground = true)
@Composable
private fun AboutScreenPrev() {
    MyAppTheme {
        AboutScreen()
    }
}