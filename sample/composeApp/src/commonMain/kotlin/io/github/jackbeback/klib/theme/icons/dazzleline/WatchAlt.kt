package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WatchAlt: ImageVector
    get() {
        if (_WatchAlt != null) {
            return _WatchAlt!!
        }
        _WatchAlt = ImageVector.Builder(
            name = "WatchAlt",
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
                moveTo(12f, 9.5f)
                verticalLineTo(12f)
                lineTo(14f, 13.5f)
                moveTo(7.932f, 6.204f)
                curveTo(8.541f, 6f, 9.364f, 6f, 10.8f, 6f)
                horizontalLineTo(13.2f)
                curveTo(14.636f, 6f, 15.459f, 6f, 16.068f, 6.204f)
                moveTo(7.932f, 6.204f)
                curveTo(7.828f, 6.239f, 7.731f, 6.28f, 7.638f, 6.327f)
                curveTo(7.074f, 6.615f, 6.615f, 7.074f, 6.327f, 7.638f)
                curveTo(6f, 8.28f, 6f, 9.12f, 6f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(6f, 14.88f, 6f, 15.72f, 6.327f, 16.362f)
                curveTo(6.615f, 16.927f, 7.074f, 17.385f, 7.638f, 17.673f)
                curveTo(7.731f, 17.721f, 7.828f, 17.761f, 7.932f, 17.796f)
                moveTo(7.932f, 6.204f)
                lineTo(9f, 3f)
                horizontalLineTo(15f)
                lineTo(16.068f, 6.204f)
                moveTo(16.068f, 6.204f)
                curveTo(16.171f, 6.239f, 16.269f, 6.28f, 16.362f, 6.327f)
                curveTo(16.927f, 6.615f, 17.385f, 7.074f, 17.673f, 7.638f)
                curveTo(18f, 8.28f, 18f, 9.12f, 18f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(18f, 14.88f, 18f, 15.72f, 17.673f, 16.362f)
                curveTo(17.385f, 16.927f, 16.927f, 17.385f, 16.362f, 17.673f)
                curveTo(16.269f, 17.721f, 16.171f, 17.761f, 16.068f, 17.796f)
                moveTo(7.932f, 17.796f)
                curveTo(8.541f, 18f, 9.364f, 18f, 10.8f, 18f)
                horizontalLineTo(13.2f)
                curveTo(14.636f, 18f, 15.459f, 18f, 16.068f, 17.796f)
                moveTo(7.932f, 17.796f)
                lineTo(9f, 21f)
                horizontalLineTo(15f)
                lineTo(16.068f, 17.796f)
            }
        }.build()

        return _WatchAlt!!
    }

@Suppress("ObjectPropertyName")
private var _WatchAlt: ImageVector? = null
