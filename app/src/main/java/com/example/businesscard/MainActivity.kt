package com.example.businesscard

//import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Identity(fullname = "Jennifer Doe", title = "Android Developer Extraordinaire");
                    Details(phone = "+1 6822663588")
                }
            }
        }
    }
}

//@Composable
//fun GreetingWithImage(fullname: String ) {
//    Text(text = "Hello $fullname!")
//}

@Composable
fun Identity(fullname:String, title: String) {

    val image = painterResource(id = com.example.businesscard.R.drawable.android_logo)

    Box (modifier = Modifier
        .fillMaxWidth()
        .padding(
            top = 230.dp,
            bottom = 390.dp,
            start = 10.dp, end = 10.dp
        )
    )

    {
        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(
                    top = 17.dp,
                    bottom = 120.dp,
                    start = 145.dp, end = 145.dp
                )
        )

        Text(text = fullname,
            fontSize = 46.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(
                    top = 100.dp,
                    bottom = 0.dp,
                    start = 70.dp, end = 0.dp
                )
        )

        Text(text = title,
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF3ddc84),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(
                    top = 169.dp,
                    bottom = 0.dp,
                    start = 87.dp, end = 0.dp
                )
        )
    }

}

@Composable
fun Details(phone: String) {
    Box(modifier = Modifier
        .padding(top = 650.dp,
            bottom = 50.dp,
            start = 0.dp, end = 0.dp
            )
    ) {
        Row(modifier = Modifier
            .padding(
                top = 0.dp,
                bottom = 0.dp,
                start = 0.dp, end = 0.dp
            )) {
            val MyAppIcons = Icons.Rounded
            Icon(Icons.Rounded.Call,
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 60.dp, end = 0.dp
                    )
            )

            Text(text = phone,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 90.dp, end = 0.dp)
            )
        }
        
        Row(modifier = Modifier
            .padding(
                top = 50.dp,
                bottom = 0.dp,
                start = 0.dp, end = 0.dp
            )) {
            val MyAppIcons = Icons.Rounded
            Icon(Icons.Rounded.Call,
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 60.dp, end = 0.dp
                    )
            )

            Text(text = phone,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 90.dp, end = 0.dp)
            )
        }

        Row(modifier = Modifier
            .padding(
                top = 100.dp,
                bottom = 0.dp,
                start = 0.dp, end = 0.dp
            )) {
            val MyAppIcons = Icons.Rounded
            Icon(Icons.Rounded.Call,
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 60.dp, end = 0.dp
                    )
            )

            Text(text = phone,
                modifier = Modifier
                    .padding(
                        top = 0.dp,
                        bottom = 0.dp,
                        start = 90.dp, end = 0.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IdentityPreview() {
    BusinessCardTheme {
        Identity(fullname = "Jennifer Doe", title = "Android Developer Extraordinaire");
        Details(phone = "+1 6822663588")
    }
}