package com.cocksearcher.cocksearcher_client.main

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.cocksearcher.cocksearcher_client.R
import kotlin.math.ceil

@Composable
fun Main(
) {
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .padding(start = 16.dp, top = 24.dp)
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        TodayCocktailText()
        TodayCocktail()
        PopularCocktailText()
        PopularCocktailLazy()
        IngredientsText()
        IngredientsLazy()
        CategoryText()
        CateGory()
        CocktailLazy()
    }
}

@Composable
fun TodayCocktailText() {
    Column {
        Text(
            text = "Today's Cocktail",
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            lineHeight = 28.sp,
            color = Color.Black
        )
        Text(
            text = "Planter's Punch",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 29.6.sp,
            color = Color.Black
        )
    }
}

@Composable
fun TodayCocktail() {
    Box {
        Spacer(
            modifier = Modifier
                .padding(top = 33.dp, end = 16.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFE7E7E7))
                .height(154.dp)
                .fillMaxWidth(),
        )
        Column(
            modifier = Modifier
                .padding(end = 179.dp, top = 33.dp)
                .fillMaxWidth()
                .height(154.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "20º",
                    modifier = Modifier.padding(top = 16.dp, start = 27.dp, end = 8.dp),
                    fontWeight = FontWeight(400),
                    fontSize = 14.sp,
                    lineHeight = 20.72.sp
                )
                Text(
                    text = "♥ 999", modifier = Modifier
                        .padding(top = 18.dp, start = 8.dp, end = 8.dp),
                    fontSize = 14.sp,
                    lineHeight = 20.72.sp
                )
                Text(
                    text = "🌺Warm",
                    modifier = Modifier.padding(top = 16.dp, start = 8.dp, end = 39.dp),
                    fontSize = 14.sp,
                    lineHeight = 20.72.sp
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 21.dp, end = 8.dp, top = 10.dp, bottom = 6.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Examplecocktail description tail\ncocktail description",
                    maxLines = 2,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    lineHeight = 17.76.sp,
                    color = Color(0xFF888888)
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, bottom = 19.dp, end = 8.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tail_image),
                    contentDescription = "",
                    modifier = Modifier.size(width = 40.dp, height = 40.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.tail_image),
                    contentDescription = "",
                    modifier = Modifier.size(width = 40.dp, height = 40.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.tail_image),
                    contentDescription = "",
                    modifier = Modifier.size(width = 40.dp, height = 40.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.tail_image),
                    contentDescription = "",
                    modifier = Modifier.size(width = 40.dp, height = 40.dp)
                )
            }
        }

        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 42.dp, bottom = 19.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.test_image), contentDescription = "",
                Modifier
                    .width(109.dp)
                    .height(168.dp)
            )
        }
    }
}

@Composable
fun PopularCocktailText() {
    Text(
        text = "Popular Cocktail",
        modifier = Modifier.padding(top = 9.dp),
        fontWeight = FontWeight.Medium,
        color = Color.Black,
        fontSize = 20.sp,
        fontFamily = FontFamily.SansSerif,
        lineHeight = 29.6.sp
    )
}

@Composable
fun PopularCocktail() {
    Box(
        modifier = Modifier
            .padding(end = 16.dp)
            .width(132.dp)
            .height(200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.test_image),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "#1",
            color = Color.White,
            fontWeight = Medium,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 12.dp, start = 12.dp)
        )
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
            Text(
                text = "Cocktail \nHorse's Neek",
                modifier = Modifier.padding(start = 12.dp, bottom = 44.dp, end = 33.dp),
                fontSize = 14.sp,
                fontWeight = Medium,
                lineHeight = 20.72.sp,
                color = Color.White,
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 12.dp, bottom = 14.dp)
                .fillMaxSize(), contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "24º",
                color = Color.White,
                fontWeight = W400,
                fontSize = 14.sp,
                lineHeight = 20.72.sp
            )
        }
        Box(
            modifier = Modifier
                .padding(end = 12.dp, bottom = 12.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.BottomEnd
        ) {
            Spacer(
                modifier = Modifier
                    .width(54.dp)
                    .height(24.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFC4C4C4).copy(alpha = 0.4f))
            )
            Box(
                modifier = Modifier
                    .padding(start = 8.dp, end = 8.dp, bottom = 4.dp, top = 4.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomEnd
            ) {
                Text(
                    text = "♥  999",
                    fontSize = 12.sp,
                    fontWeight = W400,
                    lineHeight = 17.76.sp,
                    color = Color.White
                )
            }
        }

    }
}

@Composable
fun PopularCocktailLazy() {
    LazyRow(
        modifier = Modifier.padding(top = 12.dp),
    ) {
        items(mutableListOf("")) {
            PopularCocktail()
            PopularCocktail()
            PopularCocktail()
            PopularCocktail()
            PopularCocktail()
            PopularCocktail()
        }
    }
}

@Composable
fun IngredientsText() {
    Box(modifier = Modifier.padding(top = 16.dp)) {
        Text(
            text = "Ingredients",
            fontSize = 20.sp,
            lineHeight = 29.6.sp,
            fontWeight = Medium,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Composable
fun IngredientsItem() {
    Box(Modifier.padding(end = 8.dp)) {
        Spacer(
            modifier = Modifier
                .padding(top = 32.dp)
                .width(58.dp)
                .height(47.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFE7E7E7))
        )
        Column {
            Box(modifier = Modifier.padding(top = 14.dp))
            Image(
                painter = painterResource(id = R.drawable.ingredients),
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 6.5.dp, bottom = 14.dp)
                    .height(51.dp)
                    .width(45.dp)
            )
            Box(Modifier.padding(start = 12.dp)) {
                Text(
                    text = "Vodka",
                    fontSize = 12.sp,
                    lineHeight = 17.76.sp,
                    fontWeight = W400,
                    color = Color.Black
                )
            }

        }
    }
}

@Composable
fun IngredientsLazy() {
    LazyRow {
        items(mutableListOf("")) {
            IngredientsItem()
            IngredientsItem()
            IngredientsItem()
            IngredientsItem()
            IngredientsItem()
            IngredientsItem()
            IngredientsItem()
            IngredientsItem()

        }
    }
}

@Composable
fun CategoryText() {
    Box(modifier = Modifier.padding(top = 12.dp)) {
        Text(
            text = "Categories",
            color = Color.Black,
            fontSize = 20.sp,
            lineHeight = 29.6.sp,
            fontWeight = W500
        )
    }
}

@Composable
fun CateGoryItem(text: String) {
    Box(
        modifier = Modifier
            .padding(end = 8.dp)
            .wrapContentSize()
            .background(Color(0xFFEAEAEA))
    ) {
        Text(
            text = text,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp, start = 8.dp, end = 8.dp)
                .clip(RoundedCornerShape(8.dp)),
            fontSize = 14.sp,
            lineHeight = 20.72.sp,
            color = Color.Black,
            fontWeight = W500
        )
    }
}

@Composable
fun CateGory() {
    val scrollState = rememberScrollState()
    Row(
        modifier = Modifier
            .padding(top = 15.dp)
            .horizontalScroll(scrollState)
    ) {
        CateGoryItem(text = "❄Cool")
        CateGoryItem(text = "🌺Warm")
        CateGoryItem(text = "\uD83C\uDF78Light")
        CateGoryItem(text = "\uD83E\uDD43Deep")
        CateGoryItem(text = "\uD83C\uDF29Gloomy")
    }
}

@Composable
fun CocktailImages() {

    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://images.unsplash.com/photo-1628373383885-4be0bc0172fa?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1301&q=80")
            .crossfade(false)
            .build(),
        placeholder = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier =
        Modifier.wrapContentHeight().padding(end = 16.dp, bottom = 16.dp)
    )
}


@Composable
fun CocktailLazy() {
    StaggeredVerticalGrid(maxColumnWidth = 350.dp) {
            CocktailImages()
            CocktailImages()
            CocktailImages()
            CocktailImages()
            CocktailImages()
            CocktailImages()
    }
}


@Preview
@Composable
fun Test() {
    Main()
}

@Composable
fun StaggeredVerticalGrid(
    modifier: Modifier = Modifier,
    maxColumnWidth: Dp,
    children: @Composable () -> Unit
) {
    Layout(
        modifier = modifier.padding(top = 16.dp),
        content = children
    ) { measurables, constraints ->
        check(constraints.hasBoundedWidth) {
            "Unbounded width not supported"
        }
        val columns = ceil(constraints.maxWidth / maxColumnWidth.toPx()).toInt()
        val columnWidth = constraints.maxWidth / columns
        val itemConstraints = constraints.copy(maxWidth = columnWidth)
        val colHeights = IntArray(columns) { 0 } // track each column's height
        val placeables = measurables.map { measurable ->
            val column = shortestColumn(colHeights)
            val placeable = measurable.measure(itemConstraints)
            colHeights[column] += placeable.height
            placeable
        }

        val height = colHeights.maxOrNull()?.coerceIn(constraints.minHeight, constraints.maxHeight)
            ?: constraints.minHeight
        layout(
            width = constraints.maxWidth,
            height = height
        ) {
            val colY = IntArray(columns) { 0 }
            placeables.forEach { placeable ->
                val column = shortestColumn(colY)
                placeable.place(
                    x = columnWidth * column,
                    y = colY[column]
                )
                colY[column] += placeable.height
            }
        }
    }
}

private fun shortestColumn(colHeights: IntArray): Int {
    var minHeight = Int.MAX_VALUE
    var column = 0
    colHeights.forEachIndexed { index, height ->
        if (height < minHeight) {
            minHeight = height
            column = index
        }
    }
    return column
}