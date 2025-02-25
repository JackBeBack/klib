package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Screencast: ImageVector
    get() {
        if (_Screencast != null) {
            return _Screencast!!
        }
        _Screencast = ImageVector.Builder(
            name = "Screencast",
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
                moveTo(3f, 15.1f)
                curveTo(3.961f, 15.296f, 4.843f, 15.77f, 5.536f, 16.464f)
                curveTo(6.23f, 17.157f, 6.704f, 18.039f, 6.9f, 19f)
                moveTo(3f, 19f)
                horizontalLineTo(3.01f)
                moveTo(3f, 11.05f)
                curveTo(5.031f, 11.276f, 6.924f, 12.186f, 8.369f, 13.631f)
                curveTo(9.814f, 15.075f, 10.724f, 16.969f, 10.95f, 19f)
                moveTo(15f, 19f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 19f, 19.48f, 19f, 19.908f, 18.782f)
                curveTo(20.284f, 18.59f, 20.59f, 18.284f, 20.782f, 17.908f)
                curveTo(21f, 17.48f, 21f, 16.92f, 21f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(5f)
                curveTo(3.895f, 5f, 3f, 5.895f, 3f, 7f)
            }
        }.build()

        return _Screencast!!
    }

@Suppress("ObjectPropertyName")
private var _Screencast: ImageVector? = null
