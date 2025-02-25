package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignsPost: ImageVector
    get() {
        if (_SignsPost != null) {
            return _SignsPost!!
        }
        _SignsPost = ImageVector.Builder(
            name = "SignsPost",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(4f)
                moveTo(12f, 9f)
                verticalLineTo(12f)
                moveTo(12f, 17f)
                verticalLineTo(21f)
                moveTo(4f, 4f)
                horizontalLineTo(19f)
                lineTo(21f, 6.5f)
                lineTo(19f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                close()
                moveTo(20f, 12f)
                horizontalLineTo(5f)
                lineTo(3f, 14.5f)
                lineTo(5f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _SignsPost!!
    }

@Suppress("ObjectPropertyName")
private var _SignsPost: ImageVector? = null
