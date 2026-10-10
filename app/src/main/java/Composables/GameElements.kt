package Composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserScore(){
    Row(modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).width(120.dp).height(45.dp).padding(10.dp),
        verticalAlignment = Alignment.CenterVertically){
        Text(text="\uD83C\uDF4E111", textAlign = TextAlign.Center, color = Color.White, fontSize = 20.sp, fontWeight = FontWeight(600))
    }
}
@Composable
fun EnemyScore(){
    Row(modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).width(120.dp).height(45.dp).padding(10.dp),
        verticalAlignment = Alignment.CenterVertically){
        Text(text="\uD83C\uDF4F111", textAlign = TextAlign.Center, color = Color.White, fontSize = 20.sp, fontWeight = FontWeight(600))
    }
}
@Composable
fun GameScreen(){
    val boardSize = 16

    Canvas(
        modifier = Modifier.size(320.dp)
    ) {
        val cellSize = size.width / boardSize

        drawRect(
            color = Color(0xFF78B85A)
        )

        for (i in 0..boardSize) {
            drawLine(
                color = Color(0xFF5A9A45),
                start = Offset(i * cellSize, 0f),
                end = Offset(i * cellSize, size.height)
            )

            drawLine(
                color = Color(0xFF5A9A45),
                start = Offset(0f, i * cellSize),
                end = Offset(size.width, i * cellSize)
            )
        }
    }
}