package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Microchip: ImageVector
    get() {
        if (_Microchip != null) {
            return _Microchip!!
        }
        _Microchip = ImageVector.Builder(
            name = "Microchip",
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
                moveTo(21f, 8f)
                horizontalLineTo(17.817f)
                moveTo(21f, 12f)
                horizontalLineTo(18f)
                moveTo(21f, 16f)
                horizontalLineTo(17.817f)
                moveTo(6.183f, 8f)
                horizontalLineTo(3f)
                moveTo(8f, 6.183f)
                verticalLineTo(3f)
                moveTo(8f, 21f)
                lineTo(8f, 17.817f)
                moveTo(12f, 6f)
                verticalLineTo(3f)
                moveTo(12f, 21f)
                verticalLineTo(18f)
                moveTo(16f, 6.183f)
                verticalLineTo(3f)
                moveTo(16f, 21f)
                verticalLineTo(17.817f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(6.183f, 16f)
                horizontalLineTo(3f)
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
                moveTo(10f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Microchip!!
    }

@Suppress("ObjectPropertyName")
private var _Microchip: ImageVector? = null
