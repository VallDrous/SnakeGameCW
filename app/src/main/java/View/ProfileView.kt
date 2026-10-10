package View

import Composables.Avatar
import Composables.BackButton
import Composables.BackFromProfileButton
import Composables.BestResult
import Composables.Money
import Composables.Nickname
import Composables.UserRaiting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ProfileForm(navController: NavController){
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Avatar()
        Nickname()
    }
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        UserRaiting()
    }
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Money()
    }
    Row(
        modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(8.dp)).background(Color(0xFF1E271F)).fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        BestResult()
    }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.align(Alignment.BottomStart).padding(bottom = 40.dp)
        ) {
            BackFromProfileButton(navController)
        }
    }
}