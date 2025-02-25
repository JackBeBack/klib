package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) {
            return _Hashtag!!
        }
        _Hashtag = ImageVector.Builder(
            name = "Hashtag",
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
                moveTo(10f, 4f)
                lineTo(7f, 20f)
                moveTo(17f, 4f)
                lineTo(14f, 20f)
                moveTo(5f, 8f)
                horizontalLineTo(20f)
                moveTo(4f, 16f)
                horizontalLineTo(19f)
            }
        }.build()

        return _Hashtag!!
    }

@Suppress("ObjectPropertyName")
private var _Hashtag: ImageVector? = null
