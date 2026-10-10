package Composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun CustomImage(contentDescription: String, image: Int, contentScale: ContentScale, modifier: Modifier = Modifier){
    Image(
        modifier = modifier,
        contentDescription = "Profile",
        contentScale = contentScale,
        painter = painterResource(image)
    )
}