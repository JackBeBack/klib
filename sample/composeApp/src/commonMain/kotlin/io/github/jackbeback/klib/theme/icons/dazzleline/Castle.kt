package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Castle: ImageVector
    get() {
        if (_Castle != null) {
            return _Castle!!
        }
        _Castle = ImageVector.Builder(
            name = "Castle",
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
                verticalLineTo(16.2f)
                curveTo(21f, 17.88f, 21f, 18.72f, 20.673f, 19.362f)
                curveTo(20.385f, 19.927f, 19.927f, 20.385f, 19.362f, 20.673f)
                curveTo(18.72f, 21f, 17.88f, 21f, 16.2f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(8f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                moveTo(6f, 11f)
                verticalLineTo(3f)
                moveTo(18f, 11f)
                verticalLineTo(3f)
                moveTo(6f, 6f)
                horizontalLineTo(18f)
                moveTo(10f, 6f)
                verticalLineTo(3f)
                moveTo(14f, 6f)
                verticalLineTo(3f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Castle!!
    }

@Suppress("ObjectPropertyName")
private var _Castle: ImageVector? = null
