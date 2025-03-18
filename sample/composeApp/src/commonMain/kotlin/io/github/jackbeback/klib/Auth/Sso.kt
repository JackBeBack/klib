package io.github.jackbeback.klib.Auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mmk.kmpauth.google.GoogleAuthCredentials
import com.mmk.kmpauth.google.GoogleAuthProvider
import com.mmk.kmpauth.google.GoogleButtonUiContainer

@Composable
fun SsoSample() {
    var created by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()){
        //Google Sign-In with Custom Button (only one tap sign-in functionality)
        Button(onClick = {
            GoogleAuthProvider.create(credentials = GoogleAuthCredentials(serverId = "549687211129-lmaegmvbb27r2mku5b586idds91ciau8.apps.googleusercontent.com"))
            created = true
        }){
            Text("Create")
        }
        if (created) {
            GoogleButtonUiContainer(onGoogleSignInResult = { googleUser ->
                val idToken = googleUser?.idToken // Send this idToken to your backend to verify
            }) {
                Button(onClick = { this.onClick() }) { Text("Google Sign-In(Custom Design)") }
            }
        }
    }
}