package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Frankenstein: ImageVector
    get() {
        if (_Frankenstein != null) {
            return _Frankenstein!!
        }
        _Frankenstein = ImageVector.Builder(
            name = "Frankenstein",
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
                moveTo(18f, 8f)
                verticalLineTo(16.2f)
                curveTo(18f, 17.88f, 18f, 18.72f, 17.673f, 19.362f)
                curveTo(17.385f, 19.927f, 16.927f, 20.385f, 16.362f, 20.673f)
                curveTo(15.72f, 21f, 14.88f, 21f, 13.2f, 21f)
                horizontalLineTo(10.8f)
                curveTo(9.12f, 21f, 8.28f, 21f, 7.638f, 20.673f)
                curveTo(7.074f, 20.385f, 6.615f, 19.927f, 6.327f, 19.362f)
                curveTo(6f, 18.72f, 6f, 17.88f, 6f, 16.2f)
                verticalLineTo(8f)
                moveTo(18f, 9f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                moveTo(9f, 17f)
                horizontalLineTo(15f)
                moveTo(9f, 13f)
                horizontalLineTo(10f)
                moveTo(14f, 13f)
                horizontalLineTo(15f)
                moveTo(21f, 8f)
                verticalLineTo(12f)
                moveTo(18f, 10f)
                horizontalLineTo(21f)
                moveTo(3f, 8f)
                verticalLineTo(12f)
                moveTo(6f, 10f)
                horizontalLineTo(3f)
                moveTo(9f, 6f)
                verticalLineTo(8f)
                moveTo(12f, 6f)
                verticalLineTo(8f)
                moveTo(15f, 6f)
                verticalLineTo(8f)
            }
        }.build()

        return _Frankenstein!!
    }

@Suppress("ObjectPropertyName")
private var _Frankenstein: ImageVector? = null
