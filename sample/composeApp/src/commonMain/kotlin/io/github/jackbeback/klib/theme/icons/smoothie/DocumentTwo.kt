package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.DocumentTwo: ImageVector
    get() {
        if (_DocumentTwo != null) {
            return _DocumentTwo!!
        }
        _DocumentTwo = ImageVector.Builder(
            name = "DocumentTwo",
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
                moveTo(10f, 1.5f)
                lineTo(12.5f, 4f)
                lineTo(15f, 6.5f)
                moveTo(10f, 1.5f)
                lineTo(3f, 1.5f)
                lineTo(3f, 17.5f)
                lineTo(15f, 17.5f)
                lineTo(15f, 6.5f)
                moveTo(10f, 1.5f)
                lineTo(10f, 6.5f)
                lineTo(15f, 6.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 6.5f)
                lineTo(19.5f, 9f)
                lineTo(22f, 11.5f)
                moveTo(17f, 6.5f)
                lineTo(17f, 11.5f)
                lineTo(22f, 11.5f)
                moveTo(17f, 6.5f)
                lineTo(14f, 6.5f)
                moveTo(22f, 11.5f)
                lineTo(22f, 22.5f)
                lineTo(10f, 22.5f)
                lineTo(10f, 17.5f)
            }
        }.build()

        return _DocumentTwo!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentTwo: ImageVector? = null
