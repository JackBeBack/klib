package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Minimize: ImageVector
    get() {
        if (_Minimize != null) {
            return _Minimize!!
        }
        _Minimize = ImageVector.Builder(
            name = "Minimize",
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
                moveTo(14f, 10f)
                lineTo(20f, 4f)
                moveTo(14f, 10f)
                horizontalLineTo(18.5f)
                moveTo(14f, 10f)
                verticalLineTo(5.5f)
                moveTo(4f, 4f)
                lineTo(10f, 10f)
                moveTo(10f, 10f)
                verticalLineTo(5.5f)
                moveTo(10f, 10f)
                horizontalLineTo(5.5f)
                moveTo(14f, 14f)
                lineTo(20f, 20f)
                moveTo(14f, 14f)
                verticalLineTo(18.5f)
                moveTo(14f, 14f)
                horizontalLineTo(18.5f)
                moveTo(10f, 14f)
                lineTo(4f, 20f)
                moveTo(10f, 14f)
                horizontalLineTo(5.5f)
                moveTo(10f, 14f)
                verticalLineTo(18.5f)
            }
        }.build()

        return _Minimize!!
    }

@Suppress("ObjectPropertyName")
private var _Minimize: ImageVector? = null
