package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.DocumentNew: ImageVector
    get() {
        if (_DocumentNew != null) {
            return _DocumentNew!!
        }
        _DocumentNew = ImageVector.Builder(
            name = "DocumentNew",
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
                moveTo(13f, 3f)
                lineTo(16f, 6f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 21f)
                lineTo(19f, 21f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                lineTo(13f, 9f)
                lineTo(19f, 9f)
            }
        }.build()

        return _DocumentNew!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentNew: ImageVector? = null
