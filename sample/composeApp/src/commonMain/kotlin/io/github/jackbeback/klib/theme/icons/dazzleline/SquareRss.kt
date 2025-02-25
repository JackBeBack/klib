package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareRss: ImageVector
    get() {
        if (_SquareRss != null) {
            return _SquareRss!!
        }
        _SquareRss = ImageVector.Builder(
            name = "SquareRss",
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
                moveTo(7f, 12f)
                curveTo(8.326f, 12f, 9.598f, 12.527f, 10.535f, 13.465f)
                curveTo(11.473f, 14.402f, 12f, 15.674f, 12f, 17f)
                moveTo(7f, 8f)
                curveTo(9.387f, 8f, 11.676f, 8.948f, 13.364f, 10.636f)
                curveTo(15.052f, 12.324f, 16f, 14.613f, 16f, 17f)
                moveTo(7.5f, 16.5f)
                horizontalLineTo(7.51f)
                moveTo(7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                close()
                moveTo(8f, 16.5f)
                curveTo(8f, 16.776f, 7.776f, 17f, 7.5f, 17f)
                curveTo(7.224f, 17f, 7f, 16.776f, 7f, 16.5f)
                curveTo(7f, 16.224f, 7.224f, 16f, 7.5f, 16f)
                curveTo(7.776f, 16f, 8f, 16.224f, 8f, 16.5f)
                close()
            }
        }.build()

        return _SquareRss!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRss: ImageVector? = null
