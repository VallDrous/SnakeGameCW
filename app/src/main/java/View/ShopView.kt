package View

import Composables.BackButton
import Composables.BackFromShopButton
import Composables.BuyChooseSkinButton
import Composables.CustomImage
import Composables.Money
import Composables.NextSkinButton
import Composables.PreviousSkinButton
import Composables.SkinImage
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.snakegamecw.R

@Composable
fun ShopForm(navController: NavController){
    CustomImage("",R.drawable.gamename, ContentScale.FillBounds, Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).fillMaxWidth().height(120.dp))
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        PreviousSkinButton()
        SkinImage(Color.Blue)
        NextSkinButton()
    }
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        BuyChooseSkinButton()
    }
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Money()
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.align(Alignment.BottomStart).padding(bottom = 40.dp)
        ) {
            BackFromShopButton(navController)
        }
    }
}