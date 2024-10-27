package com.lakshitmalla.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(50.dp)
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .padding(0.dp, 0.dp, 0.dp, 40.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .height(130.dp)
                        .width(130.dp)
                        .clip(CircleShape)
                )
            }
            Text(
                "Login",
                fontSize = 40.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Cursive
            )
            var text by remember { mutableStateOf(TextFieldValue("")) }
            Spacer(Modifier.height(40.dp))
            OutlinedTextField(
                value = text,
                label = {
                    Row(
                        Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) { Text(text = "Username...", fontSize = 20.sp, fontWeight = FontWeight.Bold) }
                },
                onValueChange = {
                    text = it
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(40.dp))
            OutlinedTextField(
                value = text,
                label = {
                    Row(
                        Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) { Text(text = "Password...", fontSize = 20.sp, fontWeight = FontWeight.Bold) }
                },
                onValueChange = {
                    text = it
                },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
            )
            Spacer(Modifier.height(40.dp))

            Button(onClick = {}) {
                Text("Login", modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Preview
@Composable
fun LoginPrev() {
    Login()
}