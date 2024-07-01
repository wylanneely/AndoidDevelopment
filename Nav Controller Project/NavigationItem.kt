package com.wylan.apps.navcontroller

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val label : String,
    val icon: ImageVector,
    val badgeCount: Int
)
