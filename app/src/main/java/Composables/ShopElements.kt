package Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.snakegamecw.R

@Composable
fun SkinImage(color: Color){
    Box(
        modifier = Modifier.size(100.dp).background(color)
    )
}
@Composable
fun BackFromShopButton(navController: NavController){
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
@Composable
fun PreviousSkinButton(){
    Button(
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4CAF50)
        ),
        onClick = {}
    ){
        Text(fontWeight = FontWeight(800), fontSize = 28.sp,text = "<")
    }
}
@Composable
fun NextSkinButton(){
    Button(
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4CAF50)
        ),
        onClick = {}
    ){
        Text(fontWeight = FontWeight(800), fontSize = 28.sp,text = ">")
    }
}

@Composable
fun BuyChooseSkinButton(){
    Button(
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4CAF50)
        ),
        onClick = {}
    ){
        Text(fontWeight = FontWeight(800), fontSize = 28.sp,text = "Купити")
    }
}