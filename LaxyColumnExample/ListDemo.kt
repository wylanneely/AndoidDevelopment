package com.wylan.apps.listdemo

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ListDemo() {
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo() {
    var scrollState = rememberScrollState()
    var myList = getAllQuoteResources()
     LazyColumn(
         modifier = Modifier.verticalScroll(scrollState),
         content = {
        itemsIndexed(myList, itemContent = { index, item ->
            QuoteViewItem(quoteResource = item)
        })
    })
}

@Composable
fun QuoteViewItem(quoteResource: QuoteResource){
    var context = LocalContext.current
    Row(
       modifier = Modifier
           .fillMaxWidth()
           .padding(16.dp)
           .clickable {
               Toast
                   .makeText(context, "Clicked ${quoteResource.author}", Toast.LENGTH_SHORT)
                   .show()
           }
    ){
        Image(painter = painterResource(id = quoteResource.imageRes),
            contentDescription = quoteResource.author,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.0f)
            )
        Column {
            Text(text = quoteResource.author)
        }
    }
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