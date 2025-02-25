package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Projector: ImageVector
    get() {
        if (_Projector != null) {
            return _Projector!!
        }
        _Projector = ImageVector.Builder(
            name = "Projector",
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
                moveTo(9f, 14f)
                horizontalLineTo(9.01f)
                moveTo(6f, 14f)
                horizontalLineTo(6.01f)
                moveTo(13.146f, 10.5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 10.5f, 4.52f, 10.5f, 4.092f, 10.718f)
                curveTo(3.716f, 10.91f, 3.41f, 11.216f, 3.218f, 11.592f)
                curveTo(3f, 12.02f, 3f, 12.58f, 3f, 13.7f)
                verticalLineTo(14.3f)
                curveTo(3f, 15.42f, 3f, 15.98f, 3.218f, 16.408f)
                curveTo(3.41f, 16.784f, 3.716f, 17.09f, 4.092f, 17.282f)
                curveTo(4.52f, 17.5f, 5.08f, 17.5f, 6.2f, 17.5f)
                horizontalLineTo(14.436f)
                moveTo(5f, 17.481f)
                verticalLineTo(21f)
                moveTo(18f, 17.744f)
                verticalLineTo(21f)
                moveTo(16.5f, 3f)
                verticalLineTo(5f)
                moveTo(21f, 5f)
                lineTo(20f, 6f)
                moveTo(12f, 5f)
                lineTo(13f, 6f)
                moveTo(21f, 13.5f)
                curveTo(21f, 15.985f, 18.985f, 18f, 16.5f, 18f)
                curveTo(14.015f, 18f, 12f, 15.985f, 12f, 13.5f)
                curveTo(12f, 11.015f, 14.015f, 9f, 16.5f, 9f)
                curveTo(18.985f, 9f, 21f, 11.015f, 21f, 13.5f)
                close()
            }
        }.build()

        return _Projector!!
    }

@Suppress("ObjectPropertyName")
private var _Projector: ImageVector? = null
