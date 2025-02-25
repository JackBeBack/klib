package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PenCircle: ImageVector
    get() {
        if (_PenCircle != null) {
            return _PenCircle!!
        }
        _PenCircle = ImageVector.Builder(
            name = "PenCircle",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.905f, 13.475f)
                curveTo(8.94f, 13.299f, 8.958f, 13.21f, 8.99f, 13.128f)
                curveTo(9.019f, 13.055f, 9.056f, 12.985f, 9.101f, 12.921f)
                curveTo(9.152f, 12.848f, 9.215f, 12.785f, 9.343f, 12.657f)
                lineTo(13.5f, 8.5f)
                curveTo(14.052f, 7.948f, 14.948f, 7.948f, 15.5f, 8.5f)
                curveTo(16.052f, 9.052f, 16.052f, 9.948f, 15.5f, 10.5f)
                lineTo(11.343f, 14.657f)
                curveTo(11.215f, 14.785f, 11.152f, 14.848f, 11.079f, 14.899f)
                curveTo(11.015f, 14.944f, 10.945f, 14.981f, 10.872f, 15.01f)
                curveTo(10.79f, 15.042f, 10.701f, 15.06f, 10.525f, 15.095f)
                lineTo(8.5f, 15.5f)
                lineTo(8.905f, 13.475f)
                close()
            }
        }.build()

        return _PenCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PenCircle: ImageVector? = null
