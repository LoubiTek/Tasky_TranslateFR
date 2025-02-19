package com.thatsmanmeet.taskyapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.thatsmanmeet.taskyapp.R
import com.thatsmanmeet.taskyapp.ui.theme.TaskyTheme


@Composable
fun PermissionRequestScreen(
    navHostController: NavHostController,
    requestOnClick: () -> Unit,
    modifier: Modifier = Modifier
){
    TaskyTheme {
        Surface(
            modifier = modifier.fillMaxSize()
        ) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    modifier = modifier.size(50.dp),
                    imageVector = Icons.Default.Check,
                    contentDescription = null)
                Text(text = stringResource(R.string.permission_screen_title), fontSize = 30.sp)
                Spacer(modifier = modifier.height(12.dp))
                Box(
                    modifier = modifier.align(Alignment.CenterHorizontally),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        modifier = modifier.padding(start = 20.dp, end = 20.dp),
                        text = stringResource(R.string.permission_screen_information_text),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = modifier.height(16.dp))
                Button(onClick = {
                    requestOnClick()
                }) {
                    Text(text = stringResource(R.string.permission_screen_request_permission_button))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    PermissionRequestScreen(
        navHostController = rememberNavController(),
        requestOnClick = {

        }
    )
}