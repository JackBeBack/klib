package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDown1: ImageVector
    get() {
        if (_ArrowDown1 != null) {
            return _ArrowDown1!!
        }
        _ArrowDown1 = ImageVector.Builder(
            name = "ArrowDown1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.332f, 16.315f)
                curveTo(6.941f, 15.925f, 6.308f, 15.925f, 5.918f, 16.315f)
                curveTo(5.527f, 16.706f, 5.527f, 17.339f, 5.918f, 17.73f)
                lineTo(10.583f, 22.395f)
                curveTo(11.364f, 23.176f, 12.631f, 23.176f, 13.412f, 22.395f)
                lineTo(18.08f, 17.727f)
                curveTo(18.471f, 17.336f, 18.471f, 16.703f, 18.08f, 16.313f)
                curveTo(17.69f, 15.922f, 17.056f, 15.922f, 16.666f, 16.313f)
                lineTo(13f, 19.979f)
                verticalLineTo(2f)
                curveTo(13f, 1.448f, 12.552f, 1f, 12f, 1f)
                curveTo(11.448f, 1f, 11f, 1.448f, 11f, 2f)
                verticalLineTo(19.983f)
                lineTo(7.332f, 16.315f)
                close()
            }
        }.build()

        return _ArrowDown1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown1: ImageVector? = null
