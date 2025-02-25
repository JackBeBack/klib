package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Music",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(9f, 20f)
                curveTo(9f, 21.105f, 7.657f, 22f, 6f, 22f)
                curveTo(4.343f, 22f, 3f, 21.105f, 3f, 20f)
                curveTo(3f, 18.895f, 4.343f, 18f, 6f, 18f)
                curveTo(7.657f, 18f, 9f, 18.895f, 9f, 20f)
                close()
                moveTo(9f, 20f)
                verticalLineTo(10f)
                moveTo(20f, 18f)
                verticalLineTo(6f)
                moveTo(20f, 6f)
                verticalLineTo(3.428f)
                curveTo(20f, 2.734f, 19.31f, 2.251f, 18.658f, 2.488f)
                lineTo(9.658f, 5.761f)
                curveTo(9.263f, 5.904f, 9f, 6.28f, 9f, 6.7f)
                verticalLineTo(10f)
                moveTo(20f, 6f)
                lineTo(9f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                arcToRelative(3f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                arcToRelative(3f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
                close()
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
