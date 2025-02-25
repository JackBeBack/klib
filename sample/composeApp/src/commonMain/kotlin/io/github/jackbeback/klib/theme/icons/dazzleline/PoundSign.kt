package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PoundSign: ImageVector
    get() {
        if (_PoundSign != null) {
            return _PoundSign!!
        }
        _PoundSign = ImageVector.Builder(
            name = "PoundSign",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5f, 20f)
                horizontalLineTo(19f)
                moveTo(5f, 13f)
                horizontalLineTo(15f)
                moveTo(18f, 6.818f)
                curveTo(17.19f, 5.15f, 15.479f, 4f, 13.5f, 4f)
                curveTo(10.739f, 4f, 8.5f, 6.239f, 8.5f, 9f)
                verticalLineTo(17f)
                curveTo(8.5f, 18.657f, 7.157f, 20f, 5.5f, 20f)
            }
        }.build()

        return _PoundSign!!
    }

@Suppress("ObjectPropertyName")
private var _PoundSign: ImageVector? = null
