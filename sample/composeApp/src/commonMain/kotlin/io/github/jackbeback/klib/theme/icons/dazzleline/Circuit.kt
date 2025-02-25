package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Circuit: ImageVector
    get() {
        if (_Circuit != null) {
            return _Circuit!!
        }
        _Circuit = ImageVector.Builder(
            name = "Circuit",
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
                moveTo(8f, 3f)
                verticalLineTo(6.183f)
                moveTo(3f, 8f)
                horizontalLineTo(6.183f)
                moveTo(3f, 12f)
                horizontalLineTo(6f)
                moveTo(3f, 16f)
                horizontalLineTo(6.183f)
                moveTo(17.817f, 8f)
                horizontalLineTo(21f)
                moveTo(18f, 12f)
                horizontalLineTo(21f)
                moveTo(17.817f, 16f)
                horizontalLineTo(21f)
                moveTo(8f, 17.817f)
                lineTo(8f, 21f)
                moveTo(12f, 3f)
                verticalLineTo(6f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(16f, 3f)
                lineTo(16f, 6.183f)
                moveTo(16f, 17.817f)
                verticalLineTo(21f)
                moveTo(10f, 14f)
                horizontalLineTo(10.01f)
                moveTo(14f, 14f)
                horizontalLineTo(14.01f)
                moveTo(14f, 10f)
                horizontalLineTo(14.01f)
                moveTo(10f, 10f)
                horizontalLineTo(10.01f)
                moveTo(10.8f, 18f)
                horizontalLineTo(13.2f)
                curveTo(14.88f, 18f, 15.72f, 18f, 16.362f, 17.673f)
                curveTo(16.927f, 17.385f, 17.385f, 16.927f, 17.673f, 16.362f)
                curveTo(18f, 15.72f, 18f, 14.88f, 18f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(18f, 9.12f, 18f, 8.28f, 17.673f, 7.638f)
                curveTo(17.385f, 7.074f, 16.927f, 6.615f, 16.362f, 6.327f)
                curveTo(15.72f, 6f, 14.88f, 6f, 13.2f, 6f)
                horizontalLineTo(10.8f)
                curveTo(9.12f, 6f, 8.28f, 6f, 7.638f, 6.327f)
                curveTo(7.074f, 6.615f, 6.615f, 7.074f, 6.327f, 7.638f)
                curveTo(6f, 8.28f, 6f, 9.12f, 6f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(6f, 14.88f, 6f, 15.72f, 6.327f, 16.362f)
                curveTo(6.615f, 16.927f, 7.074f, 17.385f, 7.638f, 17.673f)
                curveTo(8.28f, 18f, 9.12f, 18f, 10.8f, 18f)
                close()
            }
        }.build()

        return _Circuit!!
    }

@Suppress("ObjectPropertyName")
private var _Circuit: ImageVector? = null
