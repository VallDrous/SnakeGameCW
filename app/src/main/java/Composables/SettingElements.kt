package Composables

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.snakegamecw.R

@Composable
fun VolumeSetting() {
    var volume by remember { mutableFloatStateOf(100f) }

    val greenAccent = Color(0xFF4CAF50)
    val trackUnactive = Color(0xFF2C382E)

    Row(
        modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = if (volume == 0f) "🔇" else "🔊",
            fontSize = 20.sp,
            modifier = Modifier.padding(end = 12.dp)
        )

        Slider(
            value = volume,
            onValueChange = { volume = it },
            valueRange = 0f..100f,
            modifier = Modifier.weight(1f),
            colors = SliderDefaults.colors(
                thumbColor = greenAccent,
                activeTrackColor = greenAccent,
                inactiveTrackColor = trackUnactive
            )
        )

        Text(
            text = "${volume.toInt()}%",
            color = greenAccent,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 12.dp).widthIn(min = 40.dp)
        )
    }
}
@Composable
fun AuthorizeButton(){
    Button(
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
          containerColor = Color(0xFF4CAF50)
        ),
        onClick = {}){
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            CustomImage(
                "googleplaylogo",
                R.drawable.googleplaylogo,
                ContentScale.Fit,
                Modifier.padding(end = 15.dp).height(30.dp).height(30.dp).background(Color(0xFF4CAF50))
            )
            Text(fontWeight = FontWeight(800), fontSize = 28.sp,text = "Авторизуватися")
        }
    }
}
@Composable
fun BackButton(navController: NavController){
    Button(
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4CAF50)
        ),
        onClick = {navController.navigate("main")}
    ){
        Text(fontWeight = FontWeight(800), fontSize = 28.sp,text = "Назад")
    }
}