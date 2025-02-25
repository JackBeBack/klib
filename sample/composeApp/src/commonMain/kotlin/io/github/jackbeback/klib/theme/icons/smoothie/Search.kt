package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Search: ImageVector
    get() {
        if (_Search != null) {
            return _Search!!
        }
        _Search = ImageVector.Builder(
            name = "Search",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFFFFFF))) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(10.5f, 10.5f)
                    moveToRelative(-6.5f, 0f)
                    arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 0f)
                    arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, 0f)
                }
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(19.646f, 20.354f)
                    curveTo(19.842f, 20.549f, 20.158f, 20.549f, 20.354f, 20.354f)
                    curveTo(20.549f, 20.158f, 20.549f, 19.842f, 20.354f, 19.646f)
                    lineTo(19.646f, 20.354f)
                    close()
                    moveTo(20.354f, 19.646f)
                    lineTo(15.354f, 14.646f)
                    lineTo(14.646f, 15.354f)
                    lineTo(19.646f, 20.354f)
                    lineTo(20.354f, 19.646f)
                    close()
                }
            }
        }.build()

        return _Search!!
    }

@Suppress("ObjectPropertyName")
private var _Search: ImageVector? = null
