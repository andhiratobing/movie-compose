package com.andhiratobing.moviecompose.tab

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState


@ExperimentalPagerApi
@Composable
fun TabContentScreen(
    pageScreen: List<TabItem>,
    pagerState: PagerState
) {
    HorizontalPager(
        count = pageScreen.size,
        state = pagerState,
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .fillMaxWidth()
    ) { page ->
        pageScreen[page].screen()
    }

}