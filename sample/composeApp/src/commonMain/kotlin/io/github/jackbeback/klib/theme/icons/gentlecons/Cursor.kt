package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cursor: ImageVector
    get() {
        if (_Cursor != null) {
            return _Cursor!!
        }
        _Cursor = ImageVector.Builder(
            name = "Cursor",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.5f, 4.075f)
                curveTo(0.897f, 2.467f, 2.467f, 0.897f, 4.075f, 1.5f)
                lineTo(21.215f, 7.928f)
                curveTo(23.122f, 8.643f, 22.866f, 11.416f, 20.861f, 11.77f)
                lineTo(13.134f, 13.134f)
                lineTo(11.77f, 20.861f)
                curveTo(11.416f, 22.866f, 8.643f, 23.122f, 7.928f, 21.215f)
                lineTo(1.5f, 4.075f)
                close()
                moveTo(3.373f, 3.373f)
                lineTo(9.8f, 20.513f)
                lineTo(11.164f, 12.786f)
                curveTo(11.31f, 11.958f, 11.958f, 11.31f, 12.786f, 11.164f)
                lineTo(20.513f, 9.8f)
                lineTo(3.373f, 3.373f)
                close()
            }
        }.build()

        return _Cursor!!
    }

@Suppress("ObjectPropertyName")
private var _Cursor: ImageVector? = null
