package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Anchor: ImageVector
    get() {
        if (_Anchor != null) {
            return _Anchor!!
        }
        _Anchor = ImageVector.Builder(
            name = "Anchor",
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
                moveTo(12f, 8.4f)
                curveTo(13.491f, 8.4f, 14.7f, 7.191f, 14.7f, 5.7f)
                curveTo(14.7f, 4.209f, 13.491f, 3f, 12f, 3f)
                curveTo(10.509f, 3f, 9.3f, 4.209f, 9.3f, 5.7f)
                curveTo(9.3f, 7.191f, 10.509f, 8.4f, 12f, 8.4f)
                close()
                moveTo(12f, 8.4f)
                verticalLineTo(21f)
                moveTo(12f, 21f)
                curveTo(9.613f, 21f, 7.324f, 20.052f, 5.636f, 18.364f)
                curveTo(3.948f, 16.676f, 3f, 14.387f, 3f, 12f)
                horizontalLineTo(5f)
                moveTo(12f, 21f)
                curveTo(14.387f, 21f, 16.676f, 20.052f, 18.364f, 18.364f)
                curveTo(20.052f, 16.676f, 21f, 14.387f, 21f, 12f)
                horizontalLineTo(19f)
            }
        }.build()

        return _Anchor!!
    }

@Suppress("ObjectPropertyName")
private var _Anchor: ImageVector? = null
