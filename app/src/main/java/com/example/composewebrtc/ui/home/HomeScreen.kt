package com.example.composewebrtc.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composewebrtc.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF0E0E0F))
            .padding(horizontal = 48.dp, vertical = 128.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = null,
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = stringResource(id = R.string.meeting_id), color = Color(0xFF6366F1)) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF6366F1),
                unfocusedBorderColor = Color(0xFF6366F1),
                cursorColor = Color(0xFF6366F1) //
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* Handle join click */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6366F1)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.join))
        }

        Button(
            onClick = { /* Handle create click */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6366F1)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = stringResource(id = R.string.create))
        }
    }
}
