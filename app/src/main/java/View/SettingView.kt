package View

import Composables.AuthorizeButton
import Composables.BackButton
import Composables.CustomImage
import Composables.VolumeSetting
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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.snakegamecw.R

@Composable
fun SettingForm(navController: NavController){
    CustomImage("",R.drawable.gamename, ContentScale.FillBounds, Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).fillMaxWidth().height(120.dp))
    VolumeSetting()
    AuthorizeButton()
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.align(Alignment.BottomStart).padding(bottom = 40.dp)
        ) {
            BackButton(navController)
        }
    }
}