package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) {
            return _Lightbulb!!
        }
        _Lightbulb = ImageVector.Builder(
            name = "Lightbulb",
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
                moveTo(15f, 16f)
                verticalLineTo(18f)
                curveTo(15f, 18.932f, 15f, 19.398f, 14.848f, 19.765f)
                curveTo(14.645f, 20.255f, 14.255f, 20.645f, 13.765f, 20.848f)
                curveTo(13.398f, 21f, 12.932f, 21f, 12f, 21f)
                curveTo(11.068f, 21f, 10.602f, 21f, 10.235f, 20.848f)
                curveTo(9.745f, 20.645f, 9.355f, 20.255f, 9.152f, 19.765f)
                curveTo(9f, 19.398f, 9f, 18.932f, 9f, 18f)
                verticalLineTo(16f)
                moveTo(5f, 10f)
                curveTo(5f, 6.134f, 8.134f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.134f, 19f, 10f)
                curveTo(19f, 12.546f, 17.64f, 14.775f, 15.608f, 16f)
                horizontalLineTo(8.392f)
                curveTo(6.36f, 14.775f, 5f, 12.546f, 5f, 10f)
                close()
            }
        }.build()

        return _Lightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _Lightbulb: ImageVector? = null
