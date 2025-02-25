package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Landmark: ImageVector
    get() {
        if (_Landmark != null) {
            return _Landmark!!
        }
        _Landmark = ImageVector.Builder(
            name = "Landmark",
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
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                moveTo(6f, 18f)
                verticalLineTo(13f)
                moveTo(10f, 18f)
                verticalLineTo(13f)
                moveTo(14f, 18f)
                verticalLineTo(13f)
                moveTo(18f, 18f)
                verticalLineTo(13f)
                moveTo(21f, 10f)
                lineTo(14.126f, 3.89f)
                curveTo(13.374f, 3.221f, 12.998f, 2.887f, 12.573f, 2.76f)
                curveTo(12.199f, 2.648f, 11.801f, 2.648f, 11.427f, 2.76f)
                curveTo(11.002f, 2.887f, 10.626f, 3.221f, 9.874f, 3.89f)
                lineTo(3f, 10f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _Landmark!!
    }

@Suppress("ObjectPropertyName")
private var _Landmark: ImageVector? = null
