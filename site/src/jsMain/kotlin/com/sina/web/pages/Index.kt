package com.sina.web.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import com.sina.web.worker.EchoWorker
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

@Page
@Composable
fun HomePage() {
    val worker = rememberWorker { EchoWorker { output -> console.log("Echoed: $output") } }
    LaunchedEffect(Unit) {
        worker.postInput("Hello, worker!")
    }




    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TODO: Replace the following with your own content
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("THIS PAGE INTENTIONALLY LEFT BLANK")
        }
    }
}
