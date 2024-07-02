package com.wylan.apps.listdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ListDemo() {
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo() {
    var myList = listOf<String>("A","B","C","D","E")
     LazyColumn(content = {
        itemsIndexed(myList, itemContent = { index, item ->
            TextItem(text = "Item $item")
        })
    })
}



@Composable
fun SimpleColumn() {
    var scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1 .. 100 ) {
        TextItem(text = "Item $i")
         }
    }

}

@Composable
fun TextItem(text: String) {
    Text(text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp
    )
}