package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FaceSmile: ImageVector
    get() {
        if (_FaceSmile != null) {
            return _FaceSmile!!
        }
        _FaceSmile = ImageVector.Builder(
            name = "FaceSmile",
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
                moveTo(8.4f, 13.8f)
                curveTo(8.4f, 13.8f, 9.75f, 15.6f, 12f, 15.6f)
                curveTo(14.25f, 15.6f, 15.6f, 13.8f, 15.6f, 13.8f)
                moveTo(14.7f, 9.3f)
                horizontalLineTo(14.709f)
                moveTo(9.3f, 9.3f)
                horizontalLineTo(9.309f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
                moveTo(15.15f, 9.3f)
                curveTo(15.15f, 9.549f, 14.948f, 9.75f, 14.7f, 9.75f)
                curveTo(14.451f, 9.75f, 14.25f, 9.549f, 14.25f, 9.3f)
                curveTo(14.25f, 9.051f, 14.451f, 8.85f, 14.7f, 8.85f)
                curveTo(14.948f, 8.85f, 15.15f, 9.051f, 15.15f, 9.3f)
                close()
                moveTo(9.75f, 9.3f)
                curveTo(9.75f, 9.549f, 9.549f, 9.75f, 9.3f, 9.75f)
                curveTo(9.051f, 9.75f, 8.85f, 9.549f, 8.85f, 9.3f)
                curveTo(8.85f, 9.051f, 9.051f, 8.85f, 9.3f, 8.85f)
                curveTo(9.549f, 8.85f, 9.75f, 9.051f, 9.75f, 9.3f)
                close()
            }
        }.build()

        return _FaceSmile!!
    }

@Suppress("ObjectPropertyName")
private var _FaceSmile: ImageVector? = null
