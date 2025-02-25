package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LockHashtag: ImageVector
    get() {
        if (_LockHashtag != null) {
            return _LockHashtag!!
        }
        _LockHashtag = ImageVector.Builder(
            name = "LockHashtag",
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
                moveTo(16f, 8.002f)
                lineTo(16f, 7f)
                curveTo(16f, 4.791f, 14.209f, 3f, 12f, 3f)
                curveTo(9.791f, 3f, 8f, 4.791f, 8f, 7f)
                verticalLineTo(8.002f)
                moveTo(16f, 8.002f)
                curveTo(15.756f, 8f, 15.491f, 8f, 15.2f, 8f)
                horizontalLineTo(8.8f)
                curveTo(8.509f, 8f, 8.244f, 8f, 8f, 8.002f)
                moveTo(16f, 8.002f)
                curveTo(17.165f, 8.01f, 17.831f, 8.057f, 18.362f, 8.327f)
                curveTo(18.927f, 8.615f, 19.385f, 9.074f, 19.673f, 9.638f)
                curveTo(20f, 10.28f, 20f, 11.12f, 20f, 12.8f)
                verticalLineTo(16.2f)
                curveTo(20f, 17.88f, 20f, 18.72f, 19.673f, 19.362f)
                curveTo(19.385f, 19.927f, 18.927f, 20.385f, 18.362f, 20.673f)
                curveTo(17.72f, 21f, 16.88f, 21f, 15.2f, 21f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 21f, 6.28f, 21f, 5.638f, 20.673f)
                curveTo(5.074f, 20.385f, 4.615f, 19.927f, 4.327f, 19.362f)
                curveTo(4f, 18.72f, 4f, 17.88f, 4f, 16.2f)
                verticalLineTo(12.8f)
                curveTo(4f, 11.12f, 4f, 10.28f, 4.327f, 9.638f)
                curveTo(4.615f, 9.074f, 5.074f, 8.615f, 5.638f, 8.327f)
                curveTo(6.169f, 8.057f, 6.835f, 8.01f, 8f, 8.002f)
                moveTo(10f, 11f)
                verticalLineTo(18f)
                moveTo(14f, 11f)
                verticalLineTo(18f)
                moveTo(8.5f, 12.5f)
                horizontalLineTo(15.5f)
                moveTo(8.5f, 16.5f)
                horizontalLineTo(15.5f)
            }
        }.build()

        return _LockHashtag!!
    }

@Suppress("ObjectPropertyName")
private var _LockHashtag: ImageVector? = null
