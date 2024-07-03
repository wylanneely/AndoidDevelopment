package com.wylan.apps.listdemo

data class QuoteResource(
    var author: String,
    var quote: String,
    var imageRes : Int,
){

}

fun getAllQuoteResources() : List<QuoteResource> {
    return listOf<QuoteResource>(
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant),
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant),
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant),
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant),
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant),
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant),
        QuoteResource("Kelly Slater","Champs", R.drawable.kelly_slater),
        QuoteResource("Kobe Bryant","Champs", R.drawable.kobe_bryant)
    )
}
