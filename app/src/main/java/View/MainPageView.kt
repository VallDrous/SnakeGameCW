package View

import Composables.CustomImage
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun MainForm(navController: NavController){
    Header(navController)
    Row(modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).fillMaxWidth().height(400.dp)) {
        CustomImage(
            "11",
            R.drawable.mainmenu,
            ContentScale.Crop,
            Modifier.clip(RoundedCornerShape(8.dp))
        )
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center) {
        CustomButton({navController.navigate("game")},"Гра на одинці")
        CustomButton({navController.navigate("game")},"1 на 1")
        CustomButton({navController.navigate("shop")},"Магазин")
    }
}
@Composable
fun Header(navController: NavController){
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CustomImage("", R.drawable.profile,ContentScale.Crop, Modifier.clip(RoundedCornerShape(8.dp)).width(60.dp).height(60.dp).clickable{navController.navigate("profile")})
        CustomImage("", R.drawable.setting,ContentScale.Crop, Modifier.clip(RoundedCornerShape(8.dp)).width(60.dp).height(60.dp).clickable{navController.navigate("setting")})
    }
}
@Composable
fun CustomButton(onClick: () -> Unit,description: String){
    Button(
        modifier = Modifier.padding(10.dp).fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        onClick = {onClick()},
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color(0xFF4CAF50)
        ),
        contentPadding = PaddingValues(0.dp,15.dp)
    ) {
        Text(fontWeight = FontWeight(800), fontSize = 28.sp,text=description)
    }
}